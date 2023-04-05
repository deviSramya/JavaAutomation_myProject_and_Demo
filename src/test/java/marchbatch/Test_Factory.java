package marchbatch;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.apache.poi.xssf.streaming.SXSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFRichTextString;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_Factory {

	@Test
	public void Testcase2() throws IOException {
// TODO Auto-generated method stub
		String projectpath = System.getProperty("Users.dir");
		File f1 = new File(projectpath + "pagefactory.xlsx");
		FileInputStream fis = new FileInputStream(f1);
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheetAt(0);
		int rowcount = sheet.getPhysicalNumberOfRows();
		for (int i = 0; i < rowcount; i++) {

			String username = sheet.getRow(i).getCell(0).getStringCellValue();
			String password = sheet.getRow(i).getCell(1).getStringCellValue();

			WebDriverManager.edgedriver().setup();
			WebDriver driver = new EdgeDriver();

			Test_case_testNG obj = PageFactory.initElements(driver, Test_case_testNG.class);

			driver.get("https://demo.opencart.com/");

			obj.clickonmyaccount();
			obj.clickonloginlink();
			obj.enteremail(username);
			obj.enterpassword(password);
			obj.clickonsubmit();
			driver.quit();
		}
	}
}