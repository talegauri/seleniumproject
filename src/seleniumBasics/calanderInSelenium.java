package seleniumBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class calanderInSelenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
	driver.findElement(By.xpath("//input[@id=\"ctl00_mainContent_view_date1\"]")).click();
	List<WebElement> days=driver.findElements(By.xpath("//td[@data-month=\"6\"]"));
	String date= "23";
	for(WebElement day:days) {
		if(day.getText().equalsIgnoreCase("23")){
	    day.click();
	    break;
		}
	}
	
	
	driver.findElement(By.xpath("//input[@id=\"ctl00_mainContent_view_date2\"]")).click();
	
	driver.findElement(By.xpath("//a[@title=\"Next\"]")).click();
	
	
	List<WebElement> Returndays=driver.findElements(By.xpath("//td[@data-month=\"7\"]"));
    String date1="17";
    
      for(WebElement day:Returndays) { 
        if(day.getText().equalsIgnoreCase(date1)) {
          day.click(); 
          break; 
        }
	}
	}
}
