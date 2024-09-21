package testCases;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

public class ReadExcel {
    public static void main(String[] args) throws IOException {
        FileInputStream file = new FileInputStream("C:\\AC-TrainingBatch june\\Automation-Framework-Designing\\src\\test\\java\\testCases\\TestData.xlsx");
        Workbook workbook = new XSSFWorkbook(file);
        Sheet sheet = workbook.getSheet("Sheet1");
        System.out.println("total rows in sheet:" + sheet.getPhysicalNumberOfRows());

        // static data
        //00
        Row row00 = sheet.getRow(0);
        Cell cell00 = row00.getCell(0);
        System.out.println(cell00.getStringCellValue());

        //01
        Row row01 = sheet.getRow(0);
        Cell cell01 = row01.getCell(1);
        System.out.println(cell01.getStringCellValue());

        //02
        Row row02 = sheet.getRow(0);
        Cell cell02 = row02.getCell(2);
        System.out.println(cell02.getStringCellValue());

        //10
        Row row10 = sheet.getRow(1);
        Cell cell10 = row10.getCell(0);
        System.out.println(cell10.getStringCellValue());

        //11
        Row row11 = sheet.getRow(1);
        Cell cell11 = row11.getCell(1);
        System.out.println(cell11.getStringCellValue());

        //12
        Row row12 = sheet.getRow(1);
        Cell cell12 = row12.getCell(2);
        System.out.println(cell12.getStringCellValue());
    }
}
