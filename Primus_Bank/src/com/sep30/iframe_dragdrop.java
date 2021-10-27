package com.sep30;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class iframe_dragdrop {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		//create object for Actions class
				Actions ac=new Actions(driver);
				
	//get collection of iframe
		List<WebElement> iframes=driver.findElements(By.tagName("iframe"));
		System.out.println("iframes in webpage:"+iframes.size());
		driver.switchTo().frame(0);
		
		WebElement src=driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement dst=driver.findElement(By.xpath("//div[@id='droppable']"));
		//clickand hold the element to destination
ac.clickAndHold(src).moveToElement(dst).release().perform();
Thread.sleep(3000);
if(dst.getText().contains("Dropped!")) {
	System.out.println("dropped sucessfully");
	
}
else {
	System.out.println("dropped unsucessfull");
}
driver.switchTo().defaultContent();
//click on sortable
driver.findElement(By.xpath("//a[contains(text(),'Sortable')]")).click();
Thread.sleep(3000);
driver.close();

	}

}
