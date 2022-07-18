package test.com.appium;

import org.testng.annotations.Test;
import test.com.appium.utility.AppiumSetup;

import java.net.MalformedURLException;

public class IphoneApp extends AppiumSetup {

    @Test
    public void testApp() throws MalformedURLException {

        prepareCapabilitiesForIphone();

    }
}
