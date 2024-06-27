package com.practice.appium;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidBy;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class LoginPage 
{
AppiumDriver d=null;


	public LoginPage(AppiumDriver adriver)
	{
		this.d=adriver;
	PageFactory.initElements(new AppiumFieldDecorator(adriver),this);
	}
	@AndroidFindBy(xpath="//android.widget.Button[@text='ALLOW']")
	public WebElement allow;
}

