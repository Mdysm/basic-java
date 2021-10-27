package com.sep30;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_drop {

	public static void main(String[] args)throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		//create object for Actions class
				Actions ac=new Actions(driver);
				
	//get collection of iframe
		List<WebElement> iframe=driver.findElements(By.tagName("iframe"));
		System.out.println("iframes are:"+iframe.size());
		driver.switchTo().frame(0);
		WebElement src=driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement dst=driver.findElement(By.xpath("//div[@id='droppable']"));
		
		//get location of dst
		int x=dst.getLocation().getX();
		int y=dst.getLocation().getY();
		System.out.println(x+"   "+y);
		
	ac.dragAndDropBy(src, x, y).perform();
	Thread.sleep(3000);
	//ac.dragAndDrop(src, dst).perform();
	
		
		
		
		
		
		
		driver.close();
		
		
		
		
		
	
	}

}
