package com.sept20;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Alert3 {

	public static void main(String[] args)throws Throwable {
		WebDriver driver = new FirefoxDriver();
				driver.get("file:///E:/SELENIUM%20TOOL/Selenium%20notes/sep9/promp.html");
				Thread.sleep(5000);
				//click on me button
				driver.findElement(By.xpath("/html/body/fieldset/button")).click();
				Thread.sleep(5000);
				//get alert text
				String alerttext=driver.switchTo().alert().getText();
				System.out.println(alerttext);
				Thread.sleep(5000);
				//enter some text into alert textbox
				driver.switchTo().alert().sendKeys("ayaan");
				Thread.sleep(5000);
				//accept alert
				driver.switchTo().alert().accept();
				Thread.sleep(5000);
				//capture message from webpage
				String message=driver.findElement(By.xpath("//*[@id=\"promptdemo\"]")).getText();
				System.out.println(message);
				Thread.sleep(5000);
				driver.quit();
			}

		

	

}
