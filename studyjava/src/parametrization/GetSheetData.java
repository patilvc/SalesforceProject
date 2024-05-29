package parametrization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetSheetData {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {


		FileInputStream file =new FileInputStream("C:\\Users\\admin\\git\\repository2\\studyjava\\TestData\\Book1.xlsx");
		
	    String DataString = WorkbookFactory.create(file).getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
//	    
	    System.out.println(DataString );
//	    
//	    System.setProperty("webdriver.chrome.driver", "C:\\Selenium files\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
//		
//		Thread.sleep(2000);
//		
//		driver.get("https://www.facebook.com/");
//		
//		driver.findElement(By.xpath("//input[@name='email']")).sendKeys(DataString);
//		
		int TotalRowCount = WorkbookFactory.create(file).getSheet("Sheet1").getLastRowNum();
		
		System.out.println(TotalRowCount);
		
		double DataString1 = WorkbookFactory.create(file).getSheet("Sheet1").getRow(1).getCell(3).getNumericCellValue();
	    
		System.out.println(DataString1);
		
       boolean DataString2 = WorkbookFactory.create(file).getSheet("Sheet1").getRow(1).getCell(4).getBooleanCellValue();
	    
		System.out.println(DataString2);

	}

}
