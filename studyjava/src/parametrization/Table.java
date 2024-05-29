package parametrization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Table {
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		
		FileInputStream file = new FileInputStream("C:\\Users\\admin\\git\\repository2\\studyjava\\TestData\\Book1.xlsx");

		Sheet Sheet = WorkbookFactory.create(file).getSheet("TestData");		
		
		int rowcount = Sheet.getLastRowNum();
		
		System.out.println(rowcount);
		
		for(int i=0;i<=rowcount;i++) {
			
			int Cellcount =Sheet.getRow(i).getLastCellNum();
			
			for (int j=0;j<Cellcount;j++) {
				
				
			String TableValues = Sheet.getRow(i).getCell(j).getStringCellValue();
				
				System.out.print(TableValues+" , ");
			}
			System.out.println();
		}
		
	}

}
