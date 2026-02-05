package Utilities;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;
import ConstantsData.ConstantsData;

public class FetchDataFromExcel {
	
	public static String getUrl(int x, int y) throws IOException
	{
		FileInputStream fs = new FileInputStream(ConstantsData.URL);
		XSSFWorkbook workbook = new XSSFWorkbook(fs);
		XSSFSheet sheet = workbook.getSheetAt(0);
		XSSFCell value = sheet.getRow(x).getCell(y);
		String URLval = value.toString();
		return URLval;
		
	}

}
