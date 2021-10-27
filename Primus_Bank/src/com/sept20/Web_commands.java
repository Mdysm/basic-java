package com.sept20;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web_commands {

	public static void main(String[] args)throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		String title=driver.getTitle();
		System.out.println("title:"+title);
		System.out.println("url opened is:"+driver.getCurrentUrl());
		String pagesource=driver.getPageSource();
		System.out.println("pagesource:"+pagesource);
		WebElement emailid=driver.findElement(By.name("email"));
		emailid.sendKeys("acbccsshds@gamil.com");
		WebElement password=driver.findElement(By.name("pass"));
		System.out.println("TAG NAME:"+password.getTagName());
		password.sendKeys("12345678");
		emailid.clear();
		Thread.sleep(5000);
		password.clear();
		//driver.findElement(By.name("login")).submit();
		//String error_message=driver.findElement(By.className("_9ay7")).getText();
		//System.out.println("error_message:"+error_message);
		//click create new account
		driver.findElement(By.xpath("//*[contains(text(),'Create New Account')]")).click();
		Thread.sleep(3000);
		
		
		
		driver.close();

	}

}
