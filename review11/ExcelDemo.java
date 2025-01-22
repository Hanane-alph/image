package com.neotech.review11;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDemo {

	public static void main(String[] args) throws IOException {
		
		String fullPath=System.getProperty("user.dir")+"/extra/Excel.xlsx";
		FileInputStream fis=new FileInputStream(fullPath);
	// read the whole excel	sheet
		Workbook book= new XSSFWorkbook(fis);
	// get one sheet from the excel file	
		Sheet sheet= book.getSheet("Sheet1");
  // get the row with index2		
		Row row2=sheet.getRow(2);
	// get the cell (with index1) from the row	
		Cell cell1= row2.getCell(1);
	// print the info of the cell
		System.out.println(cell1.toString());
		// let's get the first row of the sheet and print it
		Row headerRow= sheet.getRow(0);
		// the number of cell that have information in that Row
		 int cellNumber= headerRow.getLastCellNum();
		 System.out.println("----------------------------------");
		for(int i= 0; i< cellNumber; i++)
		{
			String cellData= headerRow.getCell(i).toString();
		
        System.out.print(cellData+"\t"); 
}		
	System.out.println();	
		
	System.out.println("--------------------------------");	
		// how many rows are in a sheet
		int rows= sheet.getPhysicalNumberOfRows();
		// i am skipping the row with index 0 because i already printed it
		for(int row=1; row<rows; row++) {
			// for each Row, iterate (from cell 0) to (the last cell)
		for(int cell=0; cell< cellNumber; cell++) {
			String cellinfo=sheet.getRow(row).getCell(cell).toString();
			System.out.print(cellinfo +"\t\t");
		}	
		System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
