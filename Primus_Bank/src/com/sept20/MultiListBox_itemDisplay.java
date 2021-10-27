package com.sept20;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiListBox_itemDisplay {

	public static void main(String[] args)throws Throwable{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		//click create new account
				driver.findElement(By.xpath("//*[contains(text(),'Create New Account')]")).click();
				Thread.sleep(3000);
				//Store listbox into Select class
		Select listbox=new Select(driver.findElement(By.cssSelector("#month")));
		List<WebElement> li=listbox.getOptions();
		System.out.println("no of items are:"+li.size());
		//verify listbox is single select or multiselect
		boolean verify=listbox.isMultiple();
		System.out.println("is multi select listbox:"+verify);
		for(int i=0;i<li.size();i++) {
			System.out.println(li.get(i).getText());
		}
	}

}
