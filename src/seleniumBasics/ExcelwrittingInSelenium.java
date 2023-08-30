package seleniumBasics;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
//import org.apache.poi.udermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelwrittingInSelenium {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//path of file
String path ="C:\\Users\\gauri\\OneDrive\\Documents\\seleniumTest1.xlsx";
//Create an object of FileInputStream class to write excel file

FileInputStream fs = new FileInputStream(path);

//create object of XSSFworkbook class for.xksx file
XSSFWorkbook wb = new XSSFWorkbook(fs);

//control sheet inside the workbook by its name
XSSFSheet sheet1 = wb.getSheet("Sheet1");

//To get last row number
int lastRow = sheet1.getLastRowNum();
System.out.println("Row Count: "+lastRow);

Row row = sheet1.getRow(2);
Cell cell = row.createCell(2);
cell.setCellValue("Gauri");
//for(int i= 0; i<=lastRow; i++) {//0,2
	
	//Row row = sheet1.getRow(i);//0
	
	//Cell cell = row.createCell(2);//2
	
	//cell.setCellValue("Hello");
	
//}
//To write the data in excel sheet
		FileOutputStream fos = new FileOutputStream(path);
		
	wb.write(fos);
	
	fos.close();
	
	
	}
}
