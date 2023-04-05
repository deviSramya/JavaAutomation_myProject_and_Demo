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

public class Asian_paint_mainfunction4 {
public static void main(String[] args)throws IOException {
		
        ExtentReports extent=new ExtentReports();
        ExtentSparkReporter spark=new ExtentSparkReporter("C:\\Users\\Administrator\\eclipse-workspace\\marchclass\\report4");
        extent.attachReporter(spark);
        ExtentTest test=extent.createTest("Asian Paint");
        
            WebDriverManager.edgedriver().setup();
			WebDriver driver=new EdgeDriver();
			pagefactory obj=PageFactory.initElements(driver,pagefactory.class);		
			driver.get("https://www.asianpaints.com/");
			JavascriptExecutor js = (JavascriptExecutor) driver;
			driver.manage().window().maximize();
			obj.clickonacceptcookies();
			

			//************************************shop page add to cart********************
			obj.clickshop();
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
			driver.close();
			extent.flush();
}
}
