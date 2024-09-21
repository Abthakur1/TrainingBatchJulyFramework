//package testCases;
//
//import org.apache.poi.ss.usermodel.Cell;
//import org.apache.poi.ss.usermodel.Row;
//import org.apache.poi.ss.usermodel.Sheet;
//import org.apache.poi.ss.usermodel.Workbook;
//import org.apache.poi.xssf.usermodel.XSSFWorkbook;
//
//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.FileOutputStream;
//import java.io.IOException;
//
//public class WriteData {
//    public static void main(String[] args) throws IOException {
//        String path = "C:\\AC-TrainingBatch june\\Automation-Framework-Designing\\src\\test\\java\\testCases\\OutputData.xlsx";
//        FileInputStream fs = new FileInputStream(path);
//        Workbook wb = new XSSFWorkbook(fs);
//        Sheet sheet1 = wb.getSheetAt(0);
//        Row row = sheet1.getRow(1);
//        Cell cell = row.createCell(0);
//        cell.setCellValue("output value 1");
//
//        FileOutputStream fos = new FileOutputStream(path);
//        wb.write(fos);
//        fos.close();
//    }
//}
//
