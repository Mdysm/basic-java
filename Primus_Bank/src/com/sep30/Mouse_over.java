package com.sep30;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.interactions.Actions;

public class Mouse_over {

	public static void main(String[] args) throws Throwable{
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		//click on electronics
		driver.findElement(By.xpath("//a[contains(text(),'Electronics')]")).click();
		//create object for action class
		Actions ac=new Actions(driver); 
		//move on laptops accesories
		ac.moveToElement(driver.findElement(By.xpath("//span[contains(text(),'Laptops & Accessories')]")));
		ac.build().perform();
		//mouse on and click on thin and light lap
		ac.moveToElement(driver.findElement(By.partialLinkText("Thin and light lapto")));
		ac.click().perform();
		//move on laptops accesories
				ac.moveToElement(driver.findElement(By.xpath("//span[contains(text(),'Laptops & Accessories')]")));
				ac.build().perform();
		//mouse over pendrive and click
		ac.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Pen Drives')]")));
		ac.click().perform();
		
		 //click on fashion
		driver.findElement(By.linkText("Fashion")).click();
	
		//mouse over to kids
		ac.moveToElement(driver.findElement(By.xpath("//a[@class='nav-a nav-hasArrow'][3]")));
		ac.build().perform();
		//move to jeans
		ac.moveToElement(driver.findElement(By.xpath("//body[1]/div[1]/header[1]/div[1]/div[3]/div[12]/div[2]/div[1]/div[2]/ul[1]/li[3]/a[1]")));
		ac.click().perform();
		driver.close();
		
			
			

	}

}
