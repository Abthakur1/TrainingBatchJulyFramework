package testCases;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

public class ReadExcelDynamic {
    public static void main(String[] args) throws IOException {
        FileInputStream file = new FileInputStream("C:\\AC-TrainingBatch june\\Automation-Framework-Designing\\src\\test\\java\\testCases\\TestData.xlsx");
        Workbook workbook = new XSSFWorkbook(file);
        Sheet sheet = workbook.getSheet("Sheet1");
        System.out.println("total rows in sheet:" + sheet.getPhysicalNumberOfRows());
        Iterator<Row> rowIterator = sheet.iterator();

        // dynamic
        while (rowIterator.hasNext()) {
            Row row = rowIterator.next();
            Iterator<Cell> cellIterator = row.iterator();
            while (cellIterator.hasNext()) {
                Cell cell = cellIterator.next();
                // Process the cell value
                System.out.println(cell.getStringCellValue());
            }
        }
    }
}
