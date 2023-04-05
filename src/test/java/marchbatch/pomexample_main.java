package marchbatch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class pomexample_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		pageobjects_demo obj=new pageobjects_demo();
		driver.get("https://demo.opencart.com/");
	
		obj.clickonmyaccount();
		//obj.clickonloginlink();
		obj.enterregister();
		obj.enterfname();
		obj.enterlname();
		obj.enteremail();
		obj.enterpassword();
		obj.clickonsubmit();
		//login page
		/*driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email")).sendKeys("testingclass1@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("welcome");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.linkText("My Account")).click();
*/
	}

}
