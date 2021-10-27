package com.sep30;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class slider {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/slider/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		Actions ac=new Actions(driver);
		List<WebElement> iframe=driver.findElements(By.tagName("iframe"));
		System.out.println(iframe.size());
		driver.switchTo().frame(0);
		WebElement slider=driver.findElement(By.xpath("//body/div[@id='slider']/span[1]"));
		ac.dragAndDropBy(slider, 300, 0).perform();	
		Thread.sleep(3000);
		ac.dragAndDropBy(slider, -200, 0).perform();
		Thread.sleep(3000);
		
		
		
		driver.close();
	}

}
