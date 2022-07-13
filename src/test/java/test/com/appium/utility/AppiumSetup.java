package test.com.appium.utility;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class AppiumSetup {

    public AppiumDriver<WebElement> driver;
    public WaitAnd waitAnd;
    public WebDriverWait wait;

     DesiredCapabilities capabilities;

    public void setUp() throws MalformedURLException {
        URL url = new URL(WidgetPath.INSTANCE.getBaseURL());
        driver = new AppiumDriver<>(url, capabilities);
        wait = new WebDriverWait(driver, 25);
        driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        waitAnd = new WaitAnd(wait);
    }

    protected void prepareCapabilitiesForIphone() {

        capabilities = new DesiredCapabilities();

        capabilities.setCapability("deviceName", "iPhone 11");
        capabilities.setCapability("platformName", "iOS");
        capabilities.setCapability("automationName", "XCUITest");
        capabilities.setCapability("app", "com.apple.Maps");

    }

     protected void prepareCapabilitiesForAndroid() {

        capabilities = new DesiredCapabilities();

        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("platformVersion", "11");
        capabilities.setCapability("deviceName", "sdk_gphone_x86_arm");
        capabilities.setCapability("automationName", "UiAutomator2");
        capabilities.setCapability("appPackage", "com.android.contacts");
        capabilities.setCapability("appActivity", "com.android.contacts.activities.PeopleActivity");


    }
}