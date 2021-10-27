package com.sept20;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class listbox_key {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cleartrip.com");
		driver.manage().window().maximize();
		//from textbox 
	
		driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]")).sendKeys("BAN");
		List<WebElement> Olist=driver.findElements(By.xpath("/html/body/ul[1]/li"));
		System.out.println("No of items are::"+Olist.size());
		for(int i=0; i<Olist.size();i++)
		{
			String eachitem=Olist.get(i).getText();
			System.out.println(eachitem);
		}
		driver.close();
	}

}
