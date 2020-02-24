package androidDemo;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class calcLaunch {

	public static void main(String[] args) throws MalformedURLException {
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability("deviceName","vivo 1606");
		cap.setCapability("automationName","UiAutomator2");
		cap.setCapability("platformName","android");
		cap.setCapability("platformVersion","6");
		cap.setCapability("UDID","4f84b649");
		cap.setCapability("appPackage","com.android.bbkcalculator");
		cap.setCapability("appActivity","Calculator");
		URL url=new URL("http://localhost:4723/wd/hub");
		AndroidDriver driver=new AndroidDriver(url, cap);
		 
	}

}
