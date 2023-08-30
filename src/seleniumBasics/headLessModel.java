package seleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class headLessModel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions option = new ChromeOptions();
		option.addArguments("headless");
		//open browser
		WebDriver driver = new ChromeDriver(option);
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
System.out.println(driver.getTitle());

System.out.println("Test Sucessfully pass...");
	}

}
