package com.orangehrm.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.orangehrm.utils.BaseClass;

public class LoginPageWithoutPageFactory extends BaseClass {

	public WebElement username = driver.findElement(By.id("txtUsername"));
	public WebElement password = driver.findElement(By.id("txtPassword"));
	public WebElement btnLogin = driver.findElement(By.id("btnLogin"));

}
//public class LoginPageWithOutPageFactor extends BaseClass{
//	
//public WebElement username=driver.findElement(By.id("txtUsername"));
//public WebElement password=driver.findElement(By.id("txtPassword"));
//public WebElement login=driver.findElement(By.id("btnLogin"));
//
//
//}
