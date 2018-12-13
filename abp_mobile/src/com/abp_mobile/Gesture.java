/**
 * 
 */
package com.abp_mobile;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.interactions.touch.TouchActions;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;


/**
 * @author bluepi
 *
 */
public class Gesture extends FirstScript{

	/**
	 * @param args
	 * @throws MalformedURLException 
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		AndroidDriver<AndroidElement> driver=capabilities();
	     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	     System.out.println(driver.currentActivity());
	     System.out.println(driver.getContext());
	     //views - Native , Hybrid, Webview
	     System.out.println(driver.getOrientation());
	     System.out.println(driver.isDeviceLocked());
	     driver.getKeyboard();
	     Thread.sleep(1000);
	     
	     driver.hideKeyboard();
	 	 driver.findElementByXPath("//android.widget.TextView[@text='Views']").click();
//	     driver.startRecordingScreen()
	    driver.hideKeyboard();

	}

}
