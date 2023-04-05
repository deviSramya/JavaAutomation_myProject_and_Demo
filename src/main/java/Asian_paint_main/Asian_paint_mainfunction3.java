package Asian_paint_main;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import Asian_paint.pagefactory;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Asian_paint_mainfunction3 {
public static void main(String[] args)throws IOException {
		
        ExtentReports extent=new ExtentReports();
        ExtentSparkReporter spark=new ExtentSparkReporter("C:\\Users\\Administrator\\eclipse-workspace\\marchclass\\report3");
        extent.attachReporter(spark);
        ExtentTest test=extent.createTest("Asian Paint");
        
            WebDriverManager.edgedriver().setup();
			WebDriver driver=new EdgeDriver();
			pagefactory obj=PageFactory.initElements(driver,pagefactory.class);		
			driver.get("https://www.asianpaints.com/");
			JavascriptExecutor js = (JavascriptExecutor) driver;
			driver.manage().window().maximize();
			obj.clickonacceptcookies();
			
			//*************************fin contractor*******************
			obj.clickcontractor();
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
			driver.close();
			extent.flush();
}
}
			