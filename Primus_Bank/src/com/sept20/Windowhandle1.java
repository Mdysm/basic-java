package com.sept20;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowhandle1 {

	public static void main(String[] args)throws Throwable {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		//click on create new
		driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
		Thread.sleep(2000);
		//get parent window  id
		String parentid=driver.getWindowHandle();
		System.out.println(parentid);
		//click on terms
		driver.findElement(By.id("terms-link")).click();
		Thread.sleep(2000);
		//get all collection of window id
		Set<String> allwindowids=driver.getWindowHandles();
		
		for(String each:allwindowids){
			
			if(!parentid.equals(each)) {
				
				//switch to child window
				driver.switchTo().window(each);
				Thread.sleep(4000);
				//click on signup in child window
				driver.findElement(By.xpath("//a[@class='_42ft _4jy0 signup_btn _4jy4 _4jy2 selected _51sy']")).click();
				Thread.sleep(4000);
				////switch to parent window
				driver.switchTo().window(parentid);
				Thread.sleep(4000);
				//click on fristname send text
				driver.findElement(By.name("firstname")).sendKeys("afiyah");;
			}
			
		}
		driver.close();
	}
}
		
		
		
		
		
		
		
		
		

	

	