package marchbatch;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
public class pageobjects_demo {
WebDriver driver;
By myaccountlink=By.linkText("My Account");
//By loginlink=By.linkText("Login");
By register=By.linkText("Register");
By fname=By.id("input-firstname");
By lname=By.id("input-lastname");
By email=By.id("input-email");
By password=By.id("input-password");
By loginbutton=By.xpath("//button[@type='submit']");

public void pageobjects(WebDriver driver) {
	this.driver=driver;
}
public void clickonmyaccount()
{
	driver.findElement(myaccountlink).click();
}
/*public void clickonloginlink()
{
	driver.findElement(loginlink).click();
}*/
public void enterregister()
{
	driver.findElement(register).click();
}
public void enterfname()
{
	driver.findElement(fname).sendKeys("wel");
}
public void enterlname()
{
	driver.findElement(lname).sendKeys("com");
}
public void enteremail()
{
	driver.findElement(email).sendKeys("welcome@gmail.com");
}
public void enterpassword()
{
	driver.findElement(password).sendKeys("welcome@123");
}
public void clickonsubmit()
{
	driver.findElement(loginbutton).click();
}


}
