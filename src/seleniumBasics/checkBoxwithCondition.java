package seleniumBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkBoxwithCondition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// To open browser
				WebDriver driver = new ChromeDriver();
				// Launch the URL
				driver.get("https://rahulshettyacademy.com/AutomationPractice/");
				
				
				List<WebElement> checkboxes=driver.findElements(By.xpath("//input[@type=\"checkbox\"]"));

				for(WebElement checkbox1 : checkboxes) {
					
					if(checkbox1.getText().equalsIgnoreCase("Option2")) {
						
						if(checkbox1.isSelected()==false) {
							
						checkbox1.click();	
					}
					
						else {
							System.out.println("check box is already checked");
							
		}
				}
					else {
						System.out.println("Option name:"+checkbox1.getText());
				
					
					}
				}
	}
}


				



					
	



				


