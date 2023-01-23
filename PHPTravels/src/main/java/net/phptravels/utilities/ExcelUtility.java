package net.phptravels.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtility {
	
	private static XSSFWorkbook excelWBook;
	private static XSSFSheet excelWSheet;
	
	public static String getS1CellData(int RowNum, int ColNum) throws IOException {
		
		FileInputStream ExcelFile = new FileInputStream(System.getProperty("user.dir") + "/src/main/resources"
                + "/S1TestData.xlsx");

   	 excelWBook = new XSSFWorkbook(ExcelFile);
        excelWSheet = excelWBook.getSheetAt(0);
        DataFormatter formatter = new DataFormatter();
        return formatter.formatCellValue(excelWSheet.getRow(RowNum).getCell(ColNum));
		
	}
	
	public static String getS2CellData(int RowNum, int ColNum) throws IOException {
        
       
    	 FileInputStream ExcelFile = new FileInputStream(System.getProperty("user.dir") + "/src/main/resources"
                 + "/S2TestData.xlsx");

    	 excelWBook = new XSSFWorkbook(ExcelFile);
         excelWSheet = excelWBook.getSheetAt(0);
         DataFormatter formatter = new DataFormatter();
         return formatter.formatCellValue(excelWSheet.getRow(RowNum).getCell(ColNum));
         
     }
 
	public static String getS3CellData(int RowNum, int ColNum) throws IOException {
     
     
 	 FileInputStream ExcelFile = new FileInputStream(System.getProperty("user.dir") + "/src/main/resources"
              + "/S3TestData.xlsx");

 	 excelWBook = new XSSFWorkbook(ExcelFile);
      excelWSheet = excelWBook.getSheetAt(0);
      DataFormatter formatter = new DataFormatter();
      return formatter.formatCellValue(excelWSheet.getRow(RowNum).getCell(ColNum));
      
  }
 
	public static String getS4CellData(int RowNum, int ColNum) throws IOException {
     
     
 	 FileInputStream ExcelFile = new FileInputStream(System.getProperty("user.dir") + "/src/main/resources"
              + "/S4TestData.xlsx");

 	 excelWBook = new XSSFWorkbook(ExcelFile);
      excelWSheet = excelWBook.getSheetAt(0);
      DataFormatter formatter = new DataFormatter();
      return formatter.formatCellValue(excelWSheet.getRow(RowNum).getCell(ColNum));
      
  }

}
