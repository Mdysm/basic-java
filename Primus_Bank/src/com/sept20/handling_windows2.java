package com.sept20;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class handling_windows2 {

	public static void main(String[] args)throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.shoppersstop.com/?ef_id=CjwKCAjwndCKBhAkEiwAgSDKQf6OMl4L8DUzyggM6rRlq_AvTISJ04sNiLlluMyp-M3Wp1sq8WpW5hoCvSAQAvD_BwE:G:s&utm_source=google&utm_medium=cpc&utm_campaign={Sok_Srch_Desktop_SS-Brand_Exact}&utm_term=shoppers%20stop&gclid=CjwKCAjwndCKBhAkEiwAgSDKQf6OMl4L8DUzyggM6rRlq_AvTISJ04sNiLlluMyp-M3Wp1sq8WpW5hoCvSAQAvD_BwE");
		driver.manage().window().maximize();
		String parentid=driver.getWindowHandle();
		System.out.println("parent windowid:"+parentid);
	   //click on windows
		Thread.sleep(3000);
		driver.findElement(By.linkText("WOMEN")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@title='KIDS'][1]")).click();
		
		//collection of all window id
		Set<String> brwid=driver.getWindowHandles();
		//iterate all windows
		Iterator<String> x=brwid.iterator();
		while(x.hasNext()) {
			String child=x.next();
			if(!parentid.equals(x)) {
				Thread.sleep(3000);
				String title=driver.switchTo().window(child).getTitle();
				System.out.println("title:"+title);
				// IN KIDS click on shop by age 
				driver.findElement(By.xpath("/html[1]/body[1]/main[1]/section[4]/a[1]/img[1]")).click();
				Thread.sleep(3000);	
			}
			
		}
		driver.close();
		
		
		
		
	}

}
