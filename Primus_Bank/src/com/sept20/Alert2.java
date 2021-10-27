package com.sept20;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Alert2 {

	public static void main(String[] args) throws Throwable{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://primusbank.qedgetech.com/");
		//click on username
		driver.findElement(By.id("txtuId")).sendKeys("Admin");
		//click on paswd
		driver.findElement(By.id("txtPword")).sendKeys("Admin");
		//click on login
		driver.findElement(By.id("login")).click();
		//click on branches
		driver.findElement(By.xpath("/html[1]/body[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[4]/td[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[2]/td[1]/table[1]/tbody[1]/tr[2]/td[1]/a[1]/img[1]")).click();
		//click on 3rd page
		driver.findElement(By.linkText("3")).click();
		Thread.sleep(2000);
		//click on delete
		driver.findElement(By.xpath("//tbody/tr[2]/td[8]/a[1]/img[1]")).click();
		//alert box meesage capture
		String msg=driver.switchTo().alert().getText();
		System.out.println(msg);
		//cancel the deletion in alert box
		driver.switchTo().alert().dismiss();
		
		
		driver.close();
	}

}
