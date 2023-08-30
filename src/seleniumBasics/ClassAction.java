package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClassAction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//open browser
		
		//open browser
		WebDriver driver = new  ChromeDriver();
		// open url
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		//WebElement checkbox=driver.findElement(By.xpath("//input[@id=\"checkBoxOption1\"]"));
	//for double click
		WebElement checkbox=driver.findElement(By.xpath("//legend[text()=\"Suggession Class Example\"]"));

Actions a = new Actions(driver);

//a.contextClick(checkbox).perform();
//a.doubleClick(checkbox).perform();
//For MouseHover
WebElement mouseHover= driver.findElement(By.xpath("//button[@id=\"mousehover\"]"));
a.moveToElement(mouseHover).perform();
a.dragAndDrop(checkbox, mouseHover).build().perform();



	}

}
