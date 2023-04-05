package marchbatch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class pafefactory1 {
	WebDriver driver;
	// By myaccountlink=By.linkText("My Account");
	// By loginlink=By.linkText("Login")
	// By email=By.id("input-email");
	// By password=By.id("input-password");
	// By loginbutton=By.xpath("//button[@type='submit']");

@FindBy(linkText="My Account");
	WebElement myaccountlink;

@FindBy(linkText="login");
	WebElement loginlink;
@FindBy(id="input-email");

	WebElement email;

@FindBy(id="input-input-password");
	WebElement password;

@FindBy(xpath("//button[@type='submit']"));
WebElement loginbutton;

	public pafefactory1(WebDriver driver2) {
		// TODO Auto-generated constructor stub
		this.driver = driver2;
	}

	/*
	 * public void pageobjects(WebDriver driver) { this.driver=driver; }
	 */
	public void clickonmyaccount() {
		myaccountlink.click();
	}

	public void clickonloginlink() {
		loginlink.click();
	}

	public void enteremail() {
		email.sendKeys("welcome@gmail.com");
	}

	public void enterpassword() {
		password.sendKeys("welcome@123");
	}

	public void clickonsubmit() {
		loginbutton.click();
	}
}
