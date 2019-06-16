package tests;

import io.appium.java_client.android.AndroidDriver;
import utils.DriverFactory;

class BaseTest {
    AndroidDriver driver;

    BaseTest() {
        DriverFactory driverFactory = new DriverFactory();
        driver = driverFactory.getDriver();
    }
}


