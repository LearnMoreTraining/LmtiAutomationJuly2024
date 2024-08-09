package utility;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadExcel {


    public static String getDataFromExcel(String sheetName,int rowIndex, int columnIndex) throws IOException {

        FileInputStream fileInputStream = new FileInputStream(new File("src/main/resources/data/ProductDeatils.xlsx"));
        XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);
        XSSFSheet sheet = workbook.getSheet(sheetName);
       return  sheet.getRow(rowIndex).getCell(columnIndex).getStringCellValue();

    }
}
