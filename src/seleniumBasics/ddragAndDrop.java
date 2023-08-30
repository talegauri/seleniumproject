package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ddragAndDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//open browser
				WebDriver driver = new  ChromeDriver();
				// open url
				driver.get("https://jqueryui.com/droppable/");
				WebElement frame=driver.findElement(By.xpath("//iframe[@class=\"demo-frame\"]"));
				driver.switchTo().frame(frame);
WebElement source= driver.findElement(By.xpath("//div[@id=\"draggable\"]"));
WebElement targer= driver.findElement(By.xpath("//div[@id=\"droppable\"]"));
Actions a= new Actions (driver);
a.dragAndDrop(source, targer).build().perform();


	}

}
