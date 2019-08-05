package com.resource;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FunctionalLibrary {
	public static WebDriver driver;
	public void launch(String url) {
	
		System.setProperty("webdriver.chrome.driver","D:\\selenium class appllication\\eclipse oxygen\\Telecomm\\driver\\chromedriver.exe");
		
		driver=new ChromeDriver();
		driver.get(url);

	}
	public void text(WebElement we,String keys) {
		we.sendKeys(keys);
		
}
	public void clickButton(WebElement ele) {
		ele.click();
		

	}
	

	}


