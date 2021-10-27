package com.sep30;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class javascrpexecuter {

	public static void main(String[] args) throws Exception {
		WebDriver driver=new ChromeDriver();
	
		JavascriptExecutor js=(JavascriptExecutor)driver;
		//js lauch url
		js.executeScript("window.location='https://amazon.com'");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		//print tilte and legth of title
		String pagetitle=js.executeScript("return document.title").toString();
		System.out.println("page title is::"+pagetitle);
		System.out.println("page title lengh is::"+pagetitle.length());
		//print url and length of url
		String strurl=js.executeScript("return document.URL").toString();
		System.out.println("url of page::"+strurl);
		//print name of the domain and length of domain
		String strdomain=js.executeScript("return document.domain").toString();
		System.out.println("Domain name::"+strdomain);
		driver.close();
		
		

	}

}
