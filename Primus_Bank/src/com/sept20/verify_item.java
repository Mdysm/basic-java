package com.sept20;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class verify_item {

	public static void main(String[] args)throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		String expecteditem="electronics";
		boolean exist=false;
		//dropdown search box
		Select dropdown=new Select(driver.findElement(By.xpath("//select[@id='searchDropdownBox']")));
		List<WebElement> olist=dropdown.getOptions();
		System.out.println("no of items in a list :"+olist.size());
		for(int i=1;i<olist.size();i++) {
			String actualitem=olist.get(i).getText();
			if(actualitem.equalsIgnoreCase(expecteditem)) {
				
				exist=true;
				break;
					}
			}
		if(exist) {
			System.out.println("item seached is exist:"+expecteditem +" "+exist);
		}
		else {
			System.out.println("item  seached is not exist:"+expecteditem +" "+exist);
		}

	}

}
