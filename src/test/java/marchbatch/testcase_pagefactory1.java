package marchbatch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.PageFactory;

import io.github.bonigarcia.wdm.WebDriverManager;

public class testcase_pagefactory1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		pafefactory1 obj = PageFactory.initElements(driver, pafefactory1.class);
		driver.get("https://demo.opencart.com/");

		obj.clickonmyaccount();
		obj.clickonloginlink();
		obj.enteremail();
		obj.enterpassword();
		obj.clickonsubmit();
	}

}
