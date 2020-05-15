package application;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import fonts.Big;
import fonts.Dashes;
import fonts.Font;
import fonts.Hashes;
import fonts.Varsity;

public class Runner {

	public static void main(String[] args) throws IOException, InvalidFormatException {
		// TODO Auto-generated method stub
		String text = "anjali";
		Font fontToUse = new Varsity();
		Font hashesFont = new Hashes();
        Font dashesFont = new Dashes();
        Font bigFont = new Big();
        
		System.out.println("Hello there, we are going to make something awesome now.");

		System.out.println("Hi there, now I will print: " + text);
		System.out.println("I will use the Font: " + fontToUse);
 
		fontToUse.printText("anjays");

		//create a object of file class to open xlsx file
		String sheetName = "Sheet1";
		File file = new File("C:\\Users\\Anjali\\Downloads\\Fontstype.xlsx");
		
		
		//create an object for FileInputStream class to open the excel file
		FileInputStream inputStream = new FileInputStream(file);
		
		// load excel
		XSSFWorkbook book = new XSSFWorkbook(inputStream);
		
		
		// Get sheet required
		XSSFSheet sheet = book.getSheet(sheetName);
		

		// Get the Row iterator for sheet
		
		Iterator<Row> rowManager = sheet.iterator();
		
		// you might need to use loops for row by row printing
		while (rowManager.hasNext()) {
			// for every row in FontMaker
			Row current = rowManager.next();
			
			// get name
			String nameToPrint  = current.getCell(0).getStringCellValue();

			// get font
			String fontForPrint = current.getCell(1).getStringCellValue();
			
			
			System.out.println(nameToPrint + "-"  + fontForPrint) ;
			
			// also switch will help calling fontToUse for the said Font.

			// eg: switch (font)
			// case ("big")
			// bigFont.printText(name)
			// break;

			switch (fontForPrint.toLowerCase()) {
				case "hashes":
					hashesFont.printText(nameToPrint);
					break;
					
				case "dashes":
					dashesFont.printText(nameToPrint);
					break;
					
				case "big":
					bigFont.printText(nameToPrint);
					break;
			
				default:
					// print name using font class
					fontToUse.printText(nameToPrint);
					break;
			}
			
		}
			}

}
