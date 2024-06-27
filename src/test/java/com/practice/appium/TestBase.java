package com.practice.appium;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileBrowserType;

import org.openqa.selenium.JavascriptExecutor;
public class TestBase {
	@Test
	public void setUp() throws InterruptedException {
		DesiredCapabilities caps=new  DesiredCapabilities();
		    caps.setCapability("platformName", "Android");
	        caps.setCapability("deviceName", "Infinix Hot 9 Pro");
	        caps.setCapability("platformVersion", "10");
	        caps.setCapability("appPackage", "com.hmh.api");
	        caps.setCapability("appActivity", "com.hmh.api.ApiDemos");
	        AppiumDriver driver=null;
	        try {
				 driver=new AndroidDriver(new URL("http://localhost:4723/wd/hub"), caps);
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	        Thread.sleep(3000);
	        driver.findElement(AppiumBy.xpath("//android.widget.Button[@text='CONTINUE']")).click();
	        Thread.sleep(3000);
	        driver.findElement(AppiumBy.id("android:id/button1")).click();
	        
//	        Thread.sleep(3000);
//	        driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Preference']")).click();
//	        
//	        
//	        Thread.sleep(3000);
//	        driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='1. Preferences from XML']")).click();
	        Thread.sleep(3000);
	        driver.findElement(AppiumBy.xpath("//*[contains(@text,'Views')]")).click();
	        Thread.sleep(3000);
	        driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""+"WebView"+"\").instance(0))"));
	        
	        Thread.sleep(3000);
	        driver.findElement(AppiumBy.xpath("//*[contains(@text,'WebView')]")).click();
//	        LoginPage p=new LoginPage(driver);
//	        Thread.sleep(3000);
//	        p.allow.click();
//	      //  driver.findElement(AppiumBy.id("com.android.permissioncontroller:id/permission_allow_button")).click();
//	        Thread.sleep(4000);
//	        driver.findElement(AppiumBy.id("com.android.permissioncontroller:id/permission_allow_foreground_only_button")).click();
//	        Thread.sleep(3000);
//	        driver.findElement(AppiumBy.xpath("//android.view.ViewGroup[@content-desc=\"Login\"]/android.widget.TextView")).click();
	        
	}}

