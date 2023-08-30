package seleniumBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webelementsinselenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");

List<WebElement> amounts=driver.findElements(By.xpath("(//table[@id=\"product\"])[2]//tbody//tr//td[4]"));
int sum=0;

for (WebElement amount:amounts) {
System.out.println(amount.getText());
int temp=Integer.parseInt(amount.getText());
	sum=sum+temp;
	
	
	
}

System.out.println("Sum is:"+sum);
WebElement TotalAmount=driver.findElement(By.xpath("//div[@class=\"totalAmount\"]"));
System.out.println(TotalAmount.getText());
String OnlyTotal=TotalAmount.getText().substring(24);
int Total=Integer.parseInt(OnlyTotal);

if(sum==Total) {
	
System.out.println("Validated sum data successfully");

}
else {
	System.out.println("Sum data not validate successfully");
	
}
}

}
