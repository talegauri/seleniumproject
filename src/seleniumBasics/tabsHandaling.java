package seleniumBasics;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class tabsHandaling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Open browser
				WebDriver driver = new ChromeDriver();
			
			    // Open URL
			    driver.get("https://rahulshettyacademy.com/AutomationPractice/");
			   driver.findElement(By.xpath("//a[@id=\"opentab\"]")).click();
			    System.out.println(driver.getCurrentUrl());
			    Set<String>tabName = driver.getWindowHandles();
			    System.out.println(tabName);
			    Iterator<String> it = tabName.iterator();
			    String parentTabs=it.next();
			    String childtab=it.next();
			    driver.switchTo().window(childtab);
			    System.out.println(driver.getCurrentUrl());



	}

}
