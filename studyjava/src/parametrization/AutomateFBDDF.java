package parametrization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomateFBDDF {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {

//		FileInputStream file = new FileInputStream("C:\\Users\\admin\\git\\repository2\\studyjava\\TestData\\Book2.xlsx");
//
//		Workbook wbf = WorkbookFactory.create(file);
//		
//		String Uname = wbf.getSheet("Sheet1").getRow(0).getCell(1).getStringCellValue();
//		String password = wbf.getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
//
//		System.out.println(Uname);
//		Thread.sleep(2000);
//		System.out.println(password);

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("7066127856");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("Patil@1990");

		Thread.sleep(2000);

		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
		
	//	driver.navigate().refresh();
		
		Thread.sleep(8000);
		String a="Vaibhav Patil";
		driver.navigate().refresh();
		
		String b= driver.findElement(By.xpath("//span[text()='Vaibhav Patil']")).getText();
		
		if (a.equals(b)) {
			
			System.out.println("Test Case Pass");
		}
		else {
			System.out.println("Test Case Fail");
		}

	}

}
