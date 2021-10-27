package com.sept20;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox_count {

	public static void main(String[] args) throws Throwable{
		WebDriver driver=new ChromeDriver();
		driver.get("file:///E:/SELENIUM%20TOOL/Selenium%20notes/sep7th/checkbox_1.html");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		List<WebElement> Olist=driver.findElements(By.xpath("//body/form/div/input"));
		System.out.println("no of items:"+Olist.size());
		for(WebElement each:Olist) {
			
			boolean value1=each.isSelected();
			System.out.println("is it checked :  "+value1);
			System.out.println("\t"+each.getAttribute("value"));
			if(each.isSelected()) {
				//uncheck the checked items
				each.click();
			}	
			else {
				//check if not selected
				each.click();
			}
			Thread.sleep(1000);
			
		}
driver.close();
	}

}
