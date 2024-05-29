package parametrization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class GetallSheetdata {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		FileInputStream file = new FileInputStream("C:\\Users\\admin\\git\\repository2\\studyjava\\TestData\\Book1.xlsx");

		Workbook wbf = WorkbookFactory.create(file);

		String Value11 = wbf.getSheet("TestData").getRow(1).getCell(1).getStringCellValue();

		System.out.println(Value11);

		CellType CT = wbf.getSheet("TestData").getRow(1).getCell(3).getCellType();

		System.out.println(CT);

		double Value13 = wbf.getSheet("TestData").getRow(1).getCell(3).getNumericCellValue();

		System.out.println(Value13);

		boolean Value14 = wbf.getSheet("TestData").getRow(1).getCell(4).getBooleanCellValue();

		System.out.println(Value14);
		
		CellType Pdata = wbf.getSheet("Projectdata").getRow(1).getCell(1).getCellType();

		System.out.println(Pdata);

		String Pdata11 = wbf.getSheet("Projectdata").getRow(1).getCell(1).getStringCellValue();

		System.out.println(Pdata11);
		
		String Pdata21 = wbf.getSheet("Projectdata").getRow(2).getCell(1).getStringCellValue();

		System.out.println(Pdata21);

	}

}
