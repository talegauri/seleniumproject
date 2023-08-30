package seleniumBasics;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class excelHandlingInSelenium {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		 //Create an object of File class to open xlsx file
        File file = new File("C:\\Users\\gauri\\OneDrive\\Documents\\seleniumTest1.xlsx");
        //C:\Users\gauri\OneDrive\Documents
        
        //Create an object of FileInputStream class to read excel file
        FileInputStream inputStream = new FileInputStream(file);
        
        //create object of XSSFWorkbook class for .xlsx file
        XSSFWorkbook fileName = new XSSFWorkbook(inputStream);
        
        //Read sheet inside the workbook by its name
        Sheet sheet = fileName.getSheet("Sheet1");
        
        //To select the Row
        Row row = sheet.getRow(4);
        
        //To select cell
        Cell cell = row.getCell(1);
        
        //Row row1 = sheet.getRow(2);
        //To select cell
        //Cell cell1 = row1.getCell(2);
        
        //System.out.println(row);
        System.out.println(cell);
        
        //System.out.println(row1);
        //System.out.println(cell1);
        
        
        String username=cell.toString();
        String password=cell.toString();
}
}