package com.sept20;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBoxSelect_item {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("http://primusbank.qedgetech.com/");
		driver.manage().window().maximize();
		//Store listbox into Select class
		Select listbox=new Select(driver.findElement(By.cssSelector("#drlist")));
		List<WebElement> li=listbox.getOptions();
		//for(WebElement each:li) {
			//System.out.println("list of items:"+each.getText());
		//}
		for(int i=1;i<li.size();i++) {
			System.out.println("list of items:"+li.get(i).getText());
		}
		boolean value=listbox.isMultiple();
		System.out.println(value);
		listbox.selectByVisibleText("branchOneFive");
		//get selected item
		System.out.println(listbox.getFirstSelectedOption().getText());
		listbox.selectByIndex(3);
		System.out.println(listbox.getFirstSelectedOption().getText());
		listbox.selectByValue("Cuttack");
		System.out.println(listbox.getFirstSelectedOption().getText());
		
		driver.close();

	}

}
