package com.sept20;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radiobutton_count {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cleartrip.com/");
		driver.manage().window().maximize();
		
		List<WebElement> Olist=driver.findElements(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]"));
		System.out.println("no of radio buttons:"+Olist.size());
		for(int i=0;i<Olist.size();i++) {
			boolean active=Olist.get(i).isEnabled();
			System.out.print("\t"+active);
			System.out.println(Olist.get(i).getText());
			
			
		}
	}

}
