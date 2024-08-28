package com.epam.training.tanyamilchova.test;

import com.epam.training.tanyamilchova.util.RandomGenerator;
import com.epam.training.tanyamilchova.driver.DriverSingleton;
import com.epam.training.tanyamilchova.page.LoginPage;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.logging.Logger;

public class ParametrizedTest extends CommonConditions {

    private static final Logger logger = Logger.getLogger(ParametrizedTest.class.getName());
    @DataProvider(name = "loginData")
    public Object[][] loginData() {
        return new Object[][]{
                {"", "", "Epic sadface: Username is required"},
                {RandomGenerator.getRandomUserName(), "", "Epic sadface: Password is required"},
                {RandomGenerator.getRandomUserName(), "secret_sauce", "Swag Labs"}
        };
    }
    @Test(dataProvider = "loginData")
    public void loginTest(String username, String password, String expectedMessage) {
        driver=DriverSingleton.getDriver();
        driver.get("https://www.saucedemo.com/");


        logger.info("Starting test with username: "+username+" and password: "+password);
        LoginPage loginPage = new LoginPage(driver)
                .openPage()
                .clearInput()
                .login(username, password)
                .pressLoginButton();

        String actualMessage;
        if (expectedMessage.equals("Swag Labs")) {
            actualMessage = loginPage.getDashBoardTitle();
        } else {
            actualMessage = loginPage.errorMessage();
        }

        logger.info("Expected: "+expectedMessage+"Actual:"+actualMessage);
        Assert.assertEquals(actualMessage, expectedMessage);
    }
}
