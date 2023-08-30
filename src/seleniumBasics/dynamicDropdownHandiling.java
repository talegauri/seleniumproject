package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class dynamicDropdownHandiling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		//from select
		driver.findElement(By.xpath("//input[@id=\"ctl00_mainContent_ddl_originStation1_CTXT\"]")).click();
		//select Goa
	
		driver.findElement(By.xpath("//a[@text=\"Goa (GOI)\"]")).click();
//select Mumbai
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[@text=\"Mumbai (BOM)\"])[2]")).click();
		//Thread.sleep(2000);
		//driver.findElement(By.xpath("//div[@id=\"divpaxinfo\"]")).click();
			driver.findElement(By.xpath("//div[@class=\"paxinfo\"]"));
			

		

				
		
		
	}

}
