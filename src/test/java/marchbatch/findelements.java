package marchbatch;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import java.util.elementToBeClickable;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class findelements {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();

		// implicit wait
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		// WebDriverWait wait=new WebDriverWait()ebDriver wait;

		// explicit wait
		WebDriverWait wait;
		wait = new WebDriverWait(driver, java.time.Duration.ofSeconds(30));
		Object ExceptedConditions;
		WebElement ele = wait.until(ExceptedConditions.elementToBeClickable(By.linkText("My Account")));

		// fluent wait
		Wait fwait = new Fluentwait(driver)

				.withTimeout(java.time.Duration.ofSeconds(30)).ignoring(NoSuchElementException.class)
				.pollingEvery(java.time.Duration.ofSeconds(5));
		WebElement ele = wait.until(ExceptedConditions.elementToBeClickable(By.linkText("My Account")));

		// pageload
		driver.manage().timeouts().pageLoadTimeout(java.time.Duration.ofSeconds(30));

		// WebElement ele=wait.until(ExpectedConditions.elemenToBeClickableBy)
		driver.get("https://demo.opencart.com/");
		Thread.sleep(20);
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();

		List<WebElement> l1 = driver.findElements(By.xpath("//a[@class='list-group-item']"));

		System.out.println("list count is:" + l1.size());
		// int i;
		// for(i=0;i<=l1.size();i++)
		for (WebElement i : l1) {
			// System.out.println("the list is :" +l1.indexOf(i));
			System.out.println("the list is :" + i.getText());
			System.out.println("The Attribute list -class:" + i.getAttribute("class"));
			System.out.println("The Attribute list -href :" + i.getAttribute("href"));

		}
		driver.close();
		driver.quit();
	}

}
