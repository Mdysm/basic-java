package com.sept20;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountingLinks {

	public static void main(String[] args)throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		List<WebElement> li=driver.findElements(By.tagName("a"));
		System.out.println(li.size());
		for(WebElement each:li) {
			String linkname=each.getText();
			
			String url=each.getAttribute("href");
			System.out.println("linkname:"+linkname+"\t"+url);
		}
		driver.close();

	}

}
