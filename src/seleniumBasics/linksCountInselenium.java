package seleniumBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class linksCountInselenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();

driver.get("https://login.salesforce.com/?locale=in");
	List<WebElement> links = driver.findElements(By.tagName("a"));	
	System.out.println(links.size());	
	
	
	for(WebElement link : links) {
		System.out.println(link.getAttribute("href"));
		
		
	System.out.println(link.getText());
		
	}
		
	}

}
