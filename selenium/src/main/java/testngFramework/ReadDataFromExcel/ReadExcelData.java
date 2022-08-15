package testngFramework.ReadDataFromExcel;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadExcelData {
	@Test
	public void getdata() throws IOException {

		// step1: set up the excel document path
		XSSFWorkbook wb = new XSSFWorkbook("./data/createLead.xlsx");
		// step2: set up the worksheet
		XSSFSheet sheet = wb.getSheetAt(0);

		// to find the number of rows in the worksheet
		int rowCount = sheet.getLastRowNum();
		// Find column count
		short columnCount = sheet.getRow(0).getLastCellNum();

		for (int i = 1; i <= rowCount; i++) {
			XSSFRow row = sheet.getRow(i);
			for (int j = 0; j < columnCount; j++) { // looping through eacg cell of first row
				XSSFCell cell = row.getCell(j);
				System.out.println(cell.getStringCellValue());
			}
		}
		// to close the workbook
		wb.close();
	}
}
