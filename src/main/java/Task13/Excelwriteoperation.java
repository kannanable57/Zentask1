package Task13;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTObject;
import org.apache.poi.xssf.usermodel.XSSFRow;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.EventObject;

import org.apache.poi.xssf.usermodel.XSSFCell;


public class Excelwriteoperation {
	
	

		public static void main(String[] args, int rowCount) {
			
	   XSSFWorkbook book = new XSSFWorkbook();
	   
	   XSSFSheet sheet = book.createSheet();
	   
	   Object [][] data = {
			   
			   {"Name",  "Age", "Email"},
			   {"JohnDoe","30", "john@test.com"},
			   {"JaneDoe","28", "john@test.com"},
			   {"Bobsmith","35", "jaky@example.com"},
			   {"Swapnil", "37", "swapnil@example.com"}
	   };
	   
	   int rowcount =0;
	   
	   for(Object[] row1 :data) {
		   
		   XSSFRow row = sheet.createRow(rowCount++);
		   
		   int columnCount=0;
		   
		   for(Object col: row1) {
			   
			XSSFCell cell = row.createCell(columnCount++);	
			
			if(col instanceof String) {
				cell.setCellValue((String)col);
			} else if(col instanceof Integer) {
				cell.setCellValue((Integer)col);
			}
			
	   }
	   }
	   try(
	   FileOutputStream output = new FileOutputStream("FirstFile.xlxs");){
			   book.write(output);  
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	   
		   
	   }

