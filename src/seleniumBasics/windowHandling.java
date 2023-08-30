package seleniumBasics;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Open browser
		WebDriver driver = new ChromeDriver();
	
	    // Open URL
	    driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	    driver.findElement(By.xpath("//button[@id=\"openwindow\"]")).click();
	    System.out.println(driver.getCurrentUrl());
	    Set<String> windowName = driver.getWindowHandles();
	    //System.out.println(windowName);
	    Iterator<String> it = windowName.iterator();
	    String parentWindow=it.next();
	    String childWindow=it.next();
	    
	    driver.switchTo().window(childWindow);
	    
	    System.out.println(driver.getCurrentUrl());
	    

	}

}
//button[@id="openwindow"]