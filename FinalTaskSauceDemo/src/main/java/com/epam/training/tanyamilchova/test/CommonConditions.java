package com.epam.training.tanyamilchova.test;

import com.epam.training.tanyamilchova.driver.DriverSingleton;
import com.epam.training.tanyamilchova.util.TestListener;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Listeners;

@Listeners({TestListener.class})
public class CommonConditions {

    protected WebDriver driver;

    @Before
    public void setup() {
        driver=DriverSingleton.getDriver();
        driver.get("https://www.saucedemo.com/");
    }
    @After
    public void teardown() {
        DriverSingleton.closeDriver();
    }
}
