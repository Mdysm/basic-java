package com.sept20;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Orange_hrm_validatemethods {

	public static void main(String[] args)throws Throwable {
		//using Chrome object,without webdriver interface
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		String expectedtitle="Orangehrm";
		String actualtitle=driver.getTitle();
		System.out.println("title length:"+actualtitle.length());
		if(actualtitle.equalsIgnoreCase(expectedtitle)) {
			System.out.println("title is matching:  "+actualtitle);
		}
		else {
			System.out.println("title is not matching:  "+actualtitle);
		}
		
		//forgot password url
		String linkurl=driver.findElement(By.linkText("Forgot your password?")).getAttribute("href");
		System.out.println("get forgot pasword attribute linkurl :"+linkurl);
		String actualurl=driver.getCurrentUrl();
		String expectedurl="https://";
		System.out.println("url lenght is:"+actualurl.length());
		if(actualurl.startsWith(expectedurl)) {
			System.out.println("secured url,that is:"+actualurl);
		}
		else {
			System.out.println("unsecured url,that is"+actualurl);
			
		}
		
		driver.close();
		
		
	}

}
