package Asian_paint_main;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.PageFactory;
//import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import Asian_paint.pagefactory;
//import com.opencart.testcases.pagefactory_demo;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Asian_paint_mainfunction2 {
public static void main(String[] args)throws IOException {
		
        ExtentReports extent=new ExtentReports();
        ExtentSparkReporter spark=new ExtentSparkReporter("C:\\Users\\Administrator\\eclipse-workspace\\marchclass\\report2");
        extent.attachReporter(spark);
        ExtentTest test=extent.createTest("Asian Paint");
   
			//***************find store*********************************
			File f1 = new File("C:\\Users\\Administrator\\eclipse-workspace\\marchclass\\pincode.xlsx");
			FileInputStream fis = new FileInputStream("C:\\Users\\Administrator\\eclipse-workspace\\marchclass\\pincode.xlsx");
			XSSFWorkbook workbook = new XSSFWorkbook(fis);
			XSSFSheet sheet = workbook.getSheetAt(0);
			int rowcount = sheet.getPhysicalNumberOfRows();
			for (int i = 1; i < rowcount; i++) {
				double username = sheet.getRow(i).getCell(0).getNumericCellValue();
				 WebDriverManager.edgedriver().setup();
					WebDriver driver1=new EdgeDriver();
					pagefactory obj=PageFactory.initElements(driver1,pagefactory.class);		
					driver1.get("https://www.asianpaints.com/");
					JavascriptExecutor js1 = (JavascriptExecutor) driver1;
					driver1.manage().window().maximize();
					obj.clickonacceptcookies();
			obj.clickfindstore();
			if(driver1.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/header/div[1]/div/div[2]/p/span[1]/span[3]")).isSelected())
            {
	            test.fail("findstore not clicked");
            }
			else
			{
				test.pass("findsore clicked");
			}
			obj.clickpincode();
			obj.clickpincodebutton();
			obj.clickonpincodecancelbutton();
			driver1.close();
			extent.flush();
			}
}
}