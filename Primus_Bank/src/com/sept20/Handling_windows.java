package com.sept20;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_windows {
	//switch to specific windows in multiple window by arraylist

	public static void main(String[] args)throws Throwable {
	
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.irctc.co.in/nget/train-search");
		Thread.sleep(4000);
		driver.manage().window().maximize();
		
		//click on ok botton 
		driver.findElement(By.xpath("//button[contains(text(),'OK')]")).click();
		//click on buses
		driver.findElement(By.xpath("//app-header/div[2]/div[2]/div[2]/nav[1]/ul[1]/li[4]")).click();
        //click on flight
		driver.findElement(By.partialLinkText("FLIGH")).click();
		//click on hotels
		driver.findElement(By.xpath("//a[contains(text(),'HOTELS')]"));
		//collection of windows index
		ArrayList<String> brw=new ArrayList<String>(driver.getWindowHandles());
		//switch to bus window
		driver.switchTo().window(brw.get(2));
		//switch to flight window
		driver.switchTo().window(brw.get(1));
		//switch to parent window
		driver.switchTo().window(brw.get(0));
		
		
		
		
		
		
		
		
		
		
		
		
		driver.close();

	}

}
