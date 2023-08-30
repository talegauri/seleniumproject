package seleniumBasics;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class webElementinselemium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver = new ChromeDriver();
driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");

WebElement amounts=driver.findElement(By.xpath("(//table[@id=\"product\"])[2]//tbody//tr//td[4]"));
	




	}
	

}
