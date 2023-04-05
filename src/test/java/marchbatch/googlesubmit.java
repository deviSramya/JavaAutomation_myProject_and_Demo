package marchbatch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class googlesubmit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.google.com/");
		// System.out.println("The titel of the browser is:"+driver.getTitle());
		// System.out.println("url is" +driver.getCurrentUrl());
		// driver.navigate().to("https://www.google.com");
		WebElement search = driver.findElement(By.name("q"));
		search.sendKeys("Software Testing Tools");
		search.submit();

	}

}
