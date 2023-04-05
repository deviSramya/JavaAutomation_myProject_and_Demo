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

public class Asian_paint_mainfunction5 {
public static void main(String[] args)throws IOException {
		
        ExtentReports extent=new ExtentReports();
        ExtentSparkReporter spark=new ExtentSparkReporter("C:\\Users\\Administrator\\eclipse-workspace\\marchclass\\report5");
        extent.attachReporter(spark);
        ExtentTest test=extent.createTest("Asian Paint");
        
            WebDriverManager.edgedriver().setup();
			WebDriver driver=new EdgeDriver();
			pagefactory obj=PageFactory.initElements(driver,pagefactory.class);		
			driver.get("https://www.asianpaints.com/");
			JavascriptExecutor js = (JavascriptExecutor) driver;
			driver.manage().window().maximize();
		    obj.clickonacceptcookies();
		    
//******************************search*****************************************	
			obj.clicksearch();
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
		extent.flush();
	}
			
}
