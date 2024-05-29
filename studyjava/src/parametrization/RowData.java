package parametrization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class RowData {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		FileInputStream file = new FileInputStream(
				"C:\\Users\\admin\\git\\repository2\\studyjava\\TestData\\Book1.xlsx");

		Workbook wbf = WorkbookFactory.create(file);

//		int CellCount = wbf.getSheet("TestData").getRow(1).getLastCellNum();
//
//		System.out.println(CellCount);
//
//		for (int i = 0; i < CellCount; i++) {
//
//			String RowValue = wbf.getSheet("TestData").getRow(1).getCell(i).getStringCellValue();
//
//			System.out.println(RowValue);
//		}

		int Rowcount = wbf.getSheet("TestData").getLastRowNum();

		System.out.println(Rowcount);

		for (int i = 0; i <= Rowcount; i++) {

			String ColumnValue = wbf.getSheet("TestData").getRow(i).getCell(1).getStringCellValue();

			System.out.println(ColumnValue);
		}

	}

}
