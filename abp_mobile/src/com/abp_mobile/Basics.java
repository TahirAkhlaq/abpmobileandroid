/**
 * 
 */
package com.abp_mobile;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebElement;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

/**
 * @author bluepi
 *
 */
public class Basics extends FirstScript {

	/**
	 * @param args
	 * @throws MalformedURLException 
	 */
	public static void main(String[] args) throws MalformedURLException {
		AndroidDriver<AndroidElement> driver= capabilities();
	   	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 driver.findElementByXPath("//android.widget.TextView[@text='ABP न्यूज़ (Hindi)']").click();
		WebElement e= driver.findElementByXPath("//android.widget.Button[@text='OK']");
		if(e.isDisplayed()) {
			e.click();
		}
		else {
			 driver.findElementById("android:id/button1").click();
		}
		//  driver.findElementById("android:id/button1").click();
		  driver.findElementById("com.android.packageinstaller:id/permission_allow_button").click();
		  driver.findElementById("com.android.packageinstaller:id/permission_allow_button").click();
		  driver.findElementById("com.android.packageinstaller:id/permission_allow_button").click();
		  driver.findElementById("com.android.packageinstaller:id/permission_allow_button").click();
		  driver.findElementById("com.android.packageinstaller:id/permission_allow_button").click();
		  driver.findElementById("com.winit.starnews.hin:id/btnLiveTv").click();
		  
		  driver.findElementById("com.winit.starnews.hin:id/recentVideoTitleTextView");
	AndroidElement titleLive=	driver.findElementByAndroidUIAutomator("text(\"लाइव टीवी \")");
	System.out.println("Title is -"+titleLive.getText());
		 /*  driver.findElementByXPath("//android.widget.TextView[@text='3. Preference dependencies']").click();
	   
	     driver.findElementByXPath("(//android.widget.RelativeLayout)[2]").click();
	     driver.findElementByClassName("android.widget.EditText").sendKeys("hello");
	     driver.findElementsByClassName("android.widget.Button").get(1).click();*/
	}

}
