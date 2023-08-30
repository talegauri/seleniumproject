package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locators {
	// Types of locators :- ID,
	//Name , 
	//XPath,
	//ClassName,
	//CSS selector, (fastest element locator)
	//LinnkText,
	//PartiallinkText, 
	//TAgName 

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://login.salesforce.com/?locale=in");
		
		
		// Enter username
driver.findElement(By.id("username")).sendKeys("test");
// Enter Password
driver.findElement(By.id("password")).sendKeys("test");
// Remember me check box
driver.findElement(By.id("rememberUn")).click();

// Click on login button
driver.findElement(By.id("Login")).click();

// Click on forget your password
driver.findElement(By.id("forgot_password_link")).click();




	}

}
