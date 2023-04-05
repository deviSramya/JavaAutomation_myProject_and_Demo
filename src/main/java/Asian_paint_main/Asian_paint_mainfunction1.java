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

public class Asian_paint_mainfunction1 {
public static void main(String[] args)throws IOException {
		
        ExtentReports extent=new ExtentReports();
        ExtentSparkReporter spark=new ExtentSparkReporter("C:\\Users\\Administrator\\eclipse-workspace\\marchclass\\report1");
        extent.attachReporter(spark);
        ExtentTest test=extent.createTest("Asian Paint");
        
            WebDriverManager.edgedriver().setup();
			WebDriver driver=new EdgeDriver();
			pagefactory obj=PageFactory.initElements(driver,pagefactory.class);		
			driver.get("https://www.asianpaints.com/");
			JavascriptExecutor js = (JavascriptExecutor) driver;
			driver.manage().window().maximize();
			//obj.clickonacceptcookies();
			//**************accept cookies*******************************
			obj.clickonacceptcookies(); 
			if(driver.findElement(By.xpath("//*[@id=\'onetrust-accept-btn-handler\']")).isDisplayed())
			{
				test.fail("popup disappeared cookies accepted");
			}
			else
			{
				test.pass("popup not disappeared");
			}
			driver.close();
			extent.flush();
			//***************find store*********************************
			/*File f1 = new File("C:\\Users\\Administrator\\eclipse-workspace\\marchclass\\pincode.xlsx");
			FileInputStream fis = new FileInputStream("C:\\Users\\Administrator\\eclipse-workspace\\marchclass\\pincode.xlsx");
			XSSFWorkbook workbook = new XSSFWorkbook(fis);
			XSSFSheet sheet = workbook.getSheetAt(0);
			int rowcount = sheet.getPhysicalNumberOfRows();
			for (int i = 1; i < rowcount; i++) {
				double username = sheet.getRow(i).getCell(0).getNumericCellValue();
				 WebDriverManager.edgedriver().setup();
					WebDriver driver=new EdgeDriver();
					pagefactory obj=PageFactory.initElements(driver,pagefactory.class);		
					driver.get("https://www.asianpaints.com/");
					JavascriptExecutor js = (JavascriptExecutor) driver;
					driver.manage().window().maximize();
					obj.clickoncancel();
			obj.clickfindstore();
			if(driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/header/div[1]/div/div[2]/p/span[1]/span[3]")).isSelected())
            {
	            test.fail("findstore not clicked");
            }
			else
			{
				test.pass("findsore clicked");
			}
			obj.clickpincode();
			obj.clickpincodebutton();
			obj.clickonpincodecancelbutton();*/
			
			//*************************fin contractor*******************
			/*obj.clickcontractor();
			if(driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/header/div[1]/div/div[1]/a[2]/span[1]")).isSelected())
			{
				test.fail("contractor not found");
			}
			else
			{
				test.pass("contractor found");
			}
			
			obj.clickareorpin();
			obj.clickareasubmit();
			*/
			
			//************************************shop page add to cart********************
			/*obj.clickshop();
			js.executeScript("window.scrollBy(0,400)");
			obj.clickwallsticker();
			js.executeScript("window.scrollBy(0,500)");
			obj.clickaddtocart();
		    if(driver.findElement(By.xpath("//*[@id=\"thin-banner-info\"]/ul/li[1]/div[2]/a/span[1]")).isSelected())
		    {
		    	test.fail("cart not added");
		    }
		    else
		    {
		    	test.pass("cart added");
		    }
			obj.clickpinforcart();
			obj.clickcartsubmit();
			*/
			//******************************search*****************************************
			
			/*obj.clicksearch();
			obj.clicksearchbutton();
			 if(driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div/section/div/div/div[2]/div/div/div[2]/div/div[1]/a")).isSelected())
			    {
			    	test.fail("element not searched ");
			    }
			    else
			    {
			    	test.pass("element searched");
			    }
			obj.clicknavigateoption();
			
			
		driver.close();
		extent.flush();*/
	}
			
}

