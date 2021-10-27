package com.Sept12;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basics_of_java {

	public static void main(String[] args) throws Throwable{
		 System.out.println("hi");
		 WebDriver driver=new ChromeDriver();
		 driver.get("http://primusbank.qedgetech.com/");
		 driver. manage().window().maximize();
		 Thread.sleep(6000);
		WebElement select_branch=driver.findElement(By.id("drlist"));
		select_branch.click();
		select_branch.sendKeys("SBIBankDwarka");
		Thread.sleep(3000);
		String select_branch1 = "ASGG";
		 switch(select_branch1.toLowerCase()){
		 case "SBIBankDwarka":
			 System.out.println("available");
			 break;
		 case "dwakra":
			 System.out.println("available");
			 break;
		 case "hdfc":
			 System.out.println("available");
			 break;
		 case "sbi":
			 System.out.println("available");
			 break;
			 default:
				 System.out.println("not available");
				 }
		 driver.close();
	}

}
