package seleniumBasics;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class screenShot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//open browser
		WebDriver driver = new  ChromeDriver();
		// open url
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		// Take screenshot for whole screen
	//File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		//FileUtils.copyFile(screenshotFile , new File("C:\\Users\\gauri\\OneDrive\\Pictures\\screenshot1.png"));

		// Take ScreenShot for Specific WebElement 
		
		WebElement name=driver.findElement(By.xpath("//input[@id=\"name\"]"));

		
		File screenshotFile1 = name.getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(screenshotFile1 , new File("C:\\Users\\gauri\\OneDrive\\Pictures\\pictures\\screenshot2.png"));
	}

}
