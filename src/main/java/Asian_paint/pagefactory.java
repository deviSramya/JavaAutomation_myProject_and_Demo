package Asian_paint;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class pagefactory {
	WebDriver driver;

@FindBy (xpath="//*[@id=\'onetrust-accept-btn-handler\']")
WebElement acceptcookies;

@FindBy (xpath="/html/body/div[1]/div/div[1]/div/div/header/div[2]/div[2]/div[1]/a[1]")
WebElement loginbutton;

@FindBy (xpath="//*[@id=\"loginModal\"]/div/div/div[1]/a")
WebElement logincancelbutton;

@FindBy (xpath="/html/body/div[1]/div/div[1]/div/div/header/div[1]/div/div[2]/p/span[1]/span[3]")
WebElement findstore;

@FindBy (xpath="//*[@id=\"navPincode_Field\"]")
WebElement enterpincode;

@FindBy (xpath="//*[@id=\"header-store-locator-submit-arrow-icon-on-button\"]")
WebElement navigatepincode;

@FindBy (xpath="//*[@id=\"navpincodemodal\"]/div/div/div[1]/a")
WebElement cancelpincode;

@FindBy (xpath="/html/body/div[1]/div/div[1]/div/div/header/div[2]/div[3]/nav/div[1]/button")
WebElement navigatebutton;

@FindBy (xpath="//*[@id='headerSearch']/div[1]/form/div/input")
WebElement searchoption;

@FindBy (xpath="//*[@id=\"headerSearch\"]/div[1]/form/div/button")
WebElement searchbutton;

@FindBy (xpath="/html/body/div[1]/div[1]/div[2]/div/div/section/div/div/div[2]/div/div/div[2]/div/div[1]/a")
WebElement navigateoption;

@FindBy (xpath="/html/body/div[1]/div/div[1]/div/div/header/div[1]/div/div[1]/a[2]/span[1]")
WebElement findcontractor;

@FindBy (xpath="//*[@id=\"ctaPincode\"]")
WebElement enterareaorpin;

@FindBy (xpath="//*[@id=\"js-autoCompleteListArea\"]/div[2]/button")
WebElement areasubmit;

@FindBy (xpath="//*[@id=\"headerNav\"]/div[1]/ul/li[6]/a[2]")
WebElement entershop;

@FindBy (xpath="/html/body/div[1]/div/div[2]/div/div[2]/div/div/div/div[2]/div[1]/a/div[1]/picture/img")
WebElement wallsticker;

@FindBy (xpath="//*[@id=\"thin-banner-info\"]/ul/li[1]/div[2]/a/span[1]")
WebElement addtocart;

@FindBy (xpath="//*[@id=\"cartPinCode\"]")
WebElement cartpincode;
	
@FindBy (xpath="//*[@id=\"cartPinCodeModal\"]/div/div/div[2]/form/div[2]/button")
WebElement cartsubmit;
	public void pageobjects(WebDriver driver) {
		this.driver=driver;	
	}
	
	public void clickonacceptcookies() 
	{
		acceptcookies.click();
	}
	public void clicklogin()
	{
		loginbutton.click();
	}
	public void clicklogincancel()
	{
		logincancelbutton.click();
	}
	public void clickfindstore()
	{
		findstore.click();
	}
	public void clickpincode()
	{
		enterpincode.sendKeys("600018");
	}
	public void clickpincodebutton()
	{
		navigatepincode.click();
	}
	public void clickonpincodecancelbutton()
	{
		cancelpincode.click();
	}
	public void clicknavigation()
	{
		navigatebutton.click();
	}
	public void clicksearch()
	{
		searchoption.sendKeys("Wallpapers");
	}
	public void clicknavigateoption()
	{
		navigateoption.click();
	}
	public void clicksearchbutton()
	{
		searchbutton.click();
	}
	public void clickcontractor()
	{
		findcontractor.click();
	}
	public void clickareasubmit() 
	{
		areasubmit.click();
	}
	public void clickareorpin()
	{
		enterareaorpin.sendKeys("600018");
	} 
	public void clickshop()
	{
		entershop.click();
	}
	public void clickwallsticker()
	{
		wallsticker.click();
	}
	public void clickaddtocart()
	{
		addtocart.click();
	}
	public void clickpinforcart()
	{
		cartpincode.sendKeys("627501");
	}
	public void clickcartsubmit()
	{
		cartsubmit.click();
	}

	

}

