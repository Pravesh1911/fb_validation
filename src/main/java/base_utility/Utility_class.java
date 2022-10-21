
<<<<<<< HEAD
	package base_utility;


	import java.io.File;
	import java.io.FileInputStream;
	import java.io.IOException;
	import java.text.DateFormat;
	import java.text.SimpleDateFormat;
	import java.util.Date;

	import org.apache.poi.EncryptedDocumentException;
	import org.apache.poi.ss.usermodel.Cell;
	import org.apache.poi.ss.usermodel.Sheet;
	import org.apache.poi.ss.usermodel.WorkbookFactory;
	import org.openqa.selenium.OutputType;
	import org.openqa.selenium.TakesScreenshot;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.io.FileHandler;

	public class Utility_class {

				WebDriver driver;
				
				public void utility_class(WebDriver _driver) {
					driver = _driver;
				}
				
				public String Get_Excel_Data(int Row_Ind,int Cell_ind) throws EncryptedDocumentException, IOException {
					
					FileInputStream File = new FileInputStream("D:\\Excel\\DCTC.xlsx");
					
					 Sheet sheet = WorkbookFactory.create(File).getSheet("Sheet1");
					 
					 Cell cell = sheet.getRow(Row_Ind).getCell(Cell_ind);
					 
					 try {
						return cell.getStringCellValue();
					 }catch (Exception e) {
						return (int)cell.getNumericCellValue()+"";
					 }
				}
				
				public void Take_Screen_shots(String TC_Name) throws IOException {
					
					Date d = new Date();
					DateFormat DF = new SimpleDateFormat("_mm_ss_hh_dd_MM_yyyy");
					String FormatedDate = DF.format(d);
					
					File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
					
					File dest = new File("C:\\Screenshot Store\\frame_SS\\"+TC_Name+FormatedDate+".png");
					
					FileHandler.copy(src, dest);
				}
 

	}


