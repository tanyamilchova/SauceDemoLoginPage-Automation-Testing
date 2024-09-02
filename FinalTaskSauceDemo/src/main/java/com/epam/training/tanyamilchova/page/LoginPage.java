package com.epam.training.tanyamilchova.page;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends AbstractPage{
    private final Logger logger = LogManager.getRootLogger();
    private final String PAGE_URL ="https://www.saucedemo.com/" ;
    @FindBy(xpath = "//input[@id='user-name']")
    protected WebElement inputUserName;
    @FindBy(xpath = "//input[@id='password']")
    protected WebElement inputPassword;
    @FindBy(xpath = "//input[@id='login-button']")
    protected WebElement loginButton;
    @FindBy(xpath = "//button[contains(@class, 'error-button')]/parent::h3")
    protected WebElement errorMessage;
    @FindBy(xpath = "//div[@class='app_logo']")
    protected WebElement dashBoardTitle;
    public LoginPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
    }

    @Override
    public LoginPage openPage() {
        driver.navigate().to(PAGE_URL);
        logger.info("Login page opened");
        return this;
    }
    public LoginPage putCredentials(String username, String password){
        inputUserName.clear();
        inputUserName.sendKeys(username);
        inputPassword.clear();
        inputPassword.sendKeys(password);
        logger.info("Login performed");
        return this;
    }
    public LoginPage login(){
        loginButton.click();
        return this;
    }
    public String errorMessage(){
        return errorMessage.getText();
    }

    public LoginPage clearPassword() {
        inputPassword.clear();
        return this;
    }
    public String getDashBoardTitle(){
        return dashBoardTitle.getText();
    }
}
