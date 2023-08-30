package seleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumCommands {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//
	//ChromOptions ChromeOptions = new ChromeOptions();
		// To open browser
	WebDriver driver = new ChromeDriver();
	// Launch thr URL
	driver.get("https://www.amazon.com");
	//MakeMyTrip - =#1 Travel Website 50% off on hotels, flights and holidays
	
	 System.out.println(driver.getTitle());
	 
	 // To navigate backward 
	 driver.navigate().back();
	 // To navigate forward
	 driver.navigate().forward();
	 driver.navigate().forward();
	 // To Refresh the page
	 driver.navigate().refresh();
	 // To maximize windows
	 driver.manage().window().maximize();
	 //To manimize windows
	 // To minimize window
driver.manage().window().minimize();
// To close current window
//driver.close();
//to close all windows open from same object
//driver.quit();
driver.get("https://www.amazon.com");

WebDriver driver1 = new ChromeDriver();

driver1.get("https://www.makemmytrip.com/");
driver.quit();
	 
	 
	
	}

}
