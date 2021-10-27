package com.sept20;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioCount {

	public static void main(String[] args)throws Throwable {
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.cleartrip.com/");
	driver.manage().window().maximize();
	Thread.sleep(5000);
	//get collection of radio buttons and print each radion button name
List<WebElement>Olist=driver.findElements(By.xpath("//form/nav/ul/li/label/strong"));
System.out.println("No of radio buttons::"+Olist.size());
for(WebElement each: Olist)
{
	System.out.println(each.getText());
}
Thread.sleep(5000);
driver.close();
	}

}

