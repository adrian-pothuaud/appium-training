package scenarios;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

@SuppressWarnings("unused")
class AndroidSetup {

    @SuppressWarnings({"FieldCanBeLocal"})
    AndroidDriver driver;

    void prepareAndroidForAppium() throws MalformedURLException {

        File appDir = new File("/Users/adrian/IdeaProjects/AppiumSample1/apps");
        File app = new File(appDir, "android-sample-app.apk");
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("device","Android");

        //mandatory capabilities
        capabilities.setCapability("deviceName","Nexus 5X");
        capabilities.setCapability("platformName","Android");

        //other caps
        capabilities.setCapability("platformVersion", "7.0");
        capabilities.setCapability("app", app.getAbsolutePath());
        driver =  new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
    }
}
