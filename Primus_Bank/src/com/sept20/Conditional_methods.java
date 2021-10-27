package com.sept20;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Conditional_methods {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/r.php?locale=EN_US&campaign_id=973072070&extra_1=s%7Cc%7C231346576925%7Ce%7Cfacebook%20sign%20up%7C&placement=&creative=231346576925&keyword=facebook%20sign%20up&partner_id=googlesem&extra_2=campaignid%3D973072070%26adgroupid%3D54006292691%26matchtype%3De%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-295862466660%26loc_physical_ms%3D1007740%26loc_interest_ms%3D%26feeditemid%3D19894516786%26param1%3D%26param2%3D&gclid=Cj0KCQjwtMCKBhDAARIsAG-2Eu91aq_FrgnB6hyLziI4GyJ9SMIuQRPfkDA_qtm2dRQZTDcOE_SmQsQaApuCEALw_wcB");
		
		//text box first name is enabled or not
		WebElement fname=driver.findElement(By.name("firstname"));
		boolean value=fname.isEnabled();
		System.out.println(value);
		
		//verify reenter text box displayed or not
		WebElement reenter_email=driver.findElement(By.name("reg_email_confirmation__"));
		boolean value1=reenter_email.isDisplayed();
		System.out.println(value1);
		
		//verify radio button selected or not
		WebElement female=driver.findElement(By.name("sex"));
		boolean value2=female.isSelected();
		System.out.println(value2);
		
		driver.close();
		
	}

}
