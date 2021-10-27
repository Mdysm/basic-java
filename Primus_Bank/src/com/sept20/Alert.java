package com.sept20;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Alert {

	public static void main(String[] args)throws Throwable {
		
			WebDriver driver= new FirefoxDriver();
			driver.get("http://primusbank.qedgetech.com/");
			Thread.sleep(2000);
		//click on login	
		driver.findElement(By.id("login")).click();
		Thread.sleep(2000);
		//alertbox messge capture
		String message=driver.switchTo().alert().getText();
		System.out.println("alert message is:" +message);
		Thread.sleep(2000);
		//click on ok of alert box
		driver.switchTo().alert().accept();
		driver.close();
		
	}

}
