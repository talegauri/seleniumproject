package seleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class sslcertlIssue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions option = new ChromeOptions();

option.setAcceptInsecureCerts(true);
//open broser
WebDriver driver = new ChromeDriver(option);
//open Url
driver.get("https://expired.badssl.com/");
System.out.println(driver.getTitle());

	}

}
