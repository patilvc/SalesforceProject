package parametrization;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMixData {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		FileInputStream File = new FileInputStream("C:\\Users\\admin\\git\\repository2\\studyjava\\TestData\\Book2.xlsx");

		Sheet wbf = WorkbookFactory.create(File).getSheet("Sheet1");

		String Uname = wbf.getRow(0).getCell(1).getStringCellValue();

		System.out.println(Uname);

	}

}
