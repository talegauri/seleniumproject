package seleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class inconginatoWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions option = new ChromeOptions();
		option.addArguments("incognito");
		//open browser
		WebDriver driver = new ChromeDriver(option);
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");


	}

}
