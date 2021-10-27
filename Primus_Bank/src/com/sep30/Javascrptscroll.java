package com.sep30;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javascrptscroll {

	public static void main(String[] args) throws Exception {
		WebDriver driver=new ChromeDriver();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.location='http://amazon.com'");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		//scroll vertically to certain pixel
		js.executeScript("window.scrollBy(0,900)");
		
		driver.close();
		
		
		
	}

}
