package marchbatch;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.PageFactory;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Test;

public class Testcase_pagefactory {
	public static void main(String[] args) throws IOException {
//@Test	
		// TODO Auto-generated method stub
		String projectpath = System.getProperty("user.dir");
		File f1 = new File(projectpath + "\\Book1.xlsx");
		FileInputStream fis = new FileInputStream(projectpath + "\\Book1.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheetAt(0);
		int rowcount = sheet.getPhysicalNumberOfRows();
		for (int i = 1; i < rowcount; i++) {
			String username = sheet.getRow(i).getCell(0).getStringCellValue();
			String password = sheet.getRow(i).getCell(1).getStringCellValue();
			WebDriverManager.edgedriver().setup();
			WebDriver driver = new EdgeDriver();
			pafefactory1 obj = PageFactory.initElements(driver, pafefactory1.class);
			driver.get("https://demo.opencart.com/");

			obj.clickonmyaccount();
			obj.clickonloginlink();
			// obj.enterregister();
			// obj.enterfname();
			// obj.enterlname();
			obj.enteremail();
			obj.enterpassword();
			obj.clickonsubmit();
		}
	}
}
