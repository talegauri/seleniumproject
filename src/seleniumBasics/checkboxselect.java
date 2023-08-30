package seleniumBasics;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkboxselect {

	public static void main(String[] args) {
		
		// To open browser
		WebDriver driver = new ChromeDriver();
		// Launch the URL
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
	
	if(checkbox1.getText().equalsIgnoreCase("Option2")) {
		
		if(checkbox1.isSelected()==false)
			
		checkbox1.click();	
	}
	
		
	//checkbox1.click();
}
for (int i=0; i<checkboxes.size(); i++) {
	
}



	}

}
