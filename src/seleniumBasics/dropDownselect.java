package seleniumBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropDownselect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		WebElement checkbox=driver.findElement(By.xpath("//input[@id=\"checkBoxOption1\"]"));
		System.out.println(checkbox.isDisplayed());
		System.out.println(checkbox.isEnabled());
	//checkbox.click();
		System.out.println(checkbox.isSelected());
		
		if(checkbox.isSelected()==false){
			checkbox.click();
			
			System.out.println("Checkbox is checked");
		}
		else {
			System.out.println("Checkbox is already Selected");
		

		}

	List<WebElement> checkboxes=driver.findElements(By.xpath("//input[@type=\"checkbox\"]"));
	for(WebElement checkbox1 : checkboxes) {
		checkbox1.click();
	}

WebElement dropdown = driver.findElement(By.xpath("//select[@id-\"dropdown -class-example\"]"));
Select s = new Select (dropdown);
s.selectByIndex(1);
s.selectByValue("option2");
s.selectByVisibleText("option3");



		}
////select[@id="dropdown-class-example"]
	

		
	}

