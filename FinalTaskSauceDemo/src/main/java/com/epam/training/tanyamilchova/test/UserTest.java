package com.epam.training.tanyamilchova.test;

import com.epam.training.tanyamilchova.model.User;
import com.epam.training.tanyamilchova.page.LoginPage;
import com.epam.training.tanyamilchova.service.UserCreator;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import java.util.logging.Logger;


public class UserTest extends CommonConditions{
    private static final Logger logger = Logger.getLogger(UserTest.class.getName());
    @Test
    public void mptyCredentialsLogin(){
        User userEmptyCredentials= UserCreator.withEmptyCredential();
        String actualMessage=new LoginPage(driver)
                .openPage()
                .putCredentials(userEmptyCredentials.getUserName(),userEmptyCredentials.getPassword())
                .login()
                .errorMessage();

        String expected="Epic sadface: Username is required";
        Assertions.assertEquals(expected,actualMessage);
    }
    @Test
    public void withoutPasswordLogin(){
        User userEmptyCredentials= UserCreator.withRandomCredentials();
        String actualMessage=new LoginPage(driver)
                .openPage()
                .putCredentials(userEmptyCredentials.getUserName(),userEmptyCredentials.getPassword())
                .clearPassword()
                .login()
                .errorMessage();

        String expected="Epic sadface: Password is required";
        Assertions.assertEquals(expected,actualMessage);
    }
    @Test
    public void withUsernameAndPasswordLogin(){
        User userEmptyCredentials= UserCreator.withRandomCredentials();
        String actualMessage=new LoginPage(driver)
                .openPage()
                .putCredentials(userEmptyCredentials.getUserName(),userEmptyCredentials.getPassword())
                .login()
                .getDashBoardTitle();

        String expected="Swag Labs";
        Assertions.assertEquals(expected,actualMessage);
        logger.info("Test completed: withUsernameAndPasswordLogin with result: " + actualMessage);
    }
}
