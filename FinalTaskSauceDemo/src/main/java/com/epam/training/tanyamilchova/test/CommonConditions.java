package com.epam.training.tanyamilchova.test;

import com.epam.training.tanyamilchova.driver.DriverSingleton;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;


public class CommonConditions {

    protected WebDriver driver;
    protected WebDriverManager manager;
    private static final String RESAURCES_PATH="src/main/resources/";
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
