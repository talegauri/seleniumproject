package seleniumBasics;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class radioButton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		
List<WebElement> radioButton=driver.findElements(By.xpath("//input[@class='radioButton']"));
		
		for(int i=0; i<radioButton.size(); i++)
		{
			WebElement radioButton1=radioButton.get(i);
		radioButton1.click();
	
		}
		
		
	}

}
