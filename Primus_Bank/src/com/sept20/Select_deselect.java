package com.sept20;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Select_deselect {

	public static void main(String[] args)throws Throwable {
		
		WebDriver driver=new ChromeDriver();
	driver.get("file:///E:/SELENIUM%20TOOL/Selenium%20notes/sep3rdand4th/Multi.html");
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	Select droplist=new Select(driver.findElement(By.name("multiSelection")));
	

	//verify is multiple selector or not
	boolean value=droplist.isMultiple();
	System.out.println(value);
	//collecting items
	List<WebElement> colors=droplist.getOptions();
	System.out.println("no of items are:"+colors.size());
	System.out.println("list items are:");
	for(int i=0;i<colors.size();i++) {
		
		
		System.out.println(colors.get(i).getText());
		}
	droplist.selectByIndex(0);
	Thread.sleep(1000);
	droplist.selectByIndex(2);
	Thread.sleep(1000);
	droplist.selectByIndex(4);
	Thread.sleep(1000);
	droplist.selectByIndex(6);
	Thread.sleep(1000);
	List<WebElement> selected=droplist.getAllSelectedOptions();
	System.out.println("selected items are:");
	for(WebElement each:selected) {
	
	System.out.println(each.getText());
	}
	
	droplist.deselectByIndex(0);
	Thread.sleep(1000);
	droplist.deselectByIndex(2);
	Thread.sleep(1000);
	droplist.deselectByValue("brown");
	Thread.sleep(1000);
	droplist.deselectByValue("white");
	Thread.sleep(1000);
	
	
	
	
	driver.close();
	
	
	}

}
