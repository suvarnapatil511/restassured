package Data_Driven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class XLUtils {
	public static FileInputStream file;
	public static FileOutputStream fileOutput;
	public static XSSFWorkbook w;
	public static XSSFSheet sheet;
	public static XSSFRow row;
	public static XSSFCell cell;
//	
	

	public static int getCountRow(String xlsheet) throws IOException {
		file=new FileInputStream(".//src//test//resources//Employee.xlsx");
		w=new XSSFWorkbook(file);
		sheet=w.getSheet(xlsheet);
		int rowCount=sheet.getLastRowNum();
		
		w.close();
		file.close();
		return rowCount;
		// TODO Auto-generated method stub
		
	}
	public static int getCountCell(String path,String XLsheet,int Rownum) throws IOException {
		file=new FileInputStream((String) path);
		w=new XSSFWorkbook(file);
		sheet=w.getSheet(XLsheet);
		row=sheet.getRow(Rownum);
		int cellCount=row.getLastCellNum();
		System.out.println("cellcount is"+cellCount);
		w.close();
		file.close();
		return cellCount;
		
		
	}
	public static String  getCelldata(String XLsheet,int Rownum,int column) throws IOException {
		file=new FileInputStream(".//src//test//resources//Employee.xlsx");
		w=new XSSFWorkbook(file);
		sheet=w.getSheet(XLsheet);
		row=sheet.getRow(Rownum);
		 cell=row.getCell(column);
		 String data;
		 
			 try
		 {
				 DataFormatter formatter=new DataFormatter();
				 String celldata=formatter.formatCellValue(cell);
				 return(celldata);
		 }
			 catch (Exception e) {
				  data="";
				// TODO: handle exception
			}
		w.close();
//		file.close();
//		return data;
//		
//		
		return data;
		
	}}
		
//	public static Object getData(int page ,int row, int col) throws FileNotFoundException {
//         // path where the xlsx file is saved
//        FileInputStream File = new FileInputStream(".//src//test//resources//Employee.xlsx");
//        XSSFWorkbook workBook = null; // initializing it null so the exception could be caught.
//        try {
//            workBook = new XSSFWorkbook(File);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        assert workBook != null; // asserting that workbook is not empty
//        XSSFSheet sheet = workBook.getSheetAt(page); // to get on the sheet which contains data
//        System.out.println(sheet);
//        XSSFCell cell = sheet.getRow(row).getCell(col); // to get on the cell from which we have to extract data
//        System.out.println("cell data is"+cell);
//
//        // to typecast the cell data to string using DataFormatter
//        DataFormatter formatter = new DataFormatter();
//        return formatter.formatCellValue(cell);
//        //System.out.println("formatter is"+formatter);
//    }

	
		
	
		
		


//	public static Object getCelldata(Object path, String xLsheet, int i, int j) {
//		// TODO Auto-generated method stub
//		return null;
	
