package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class LoginPage extends Utility {

    //Logger is class of Log4j. log is object created
    private static final Logger log = LogManager.getLogger(LoginPage.class.getName());

    @FindBy(xpath = "//h1[contains(text(),'Welcome, Please Sign In!')]")
    WebElement welcomeText;
    @FindBy(xpath = "//input[@id='Email']")
    WebElement enterEmail;
    @FindBy(xpath = "//input[@id='Password']")
    WebElement enterPassword;
    @FindBy(xpath = "//button[contains(text(),'Log in')]")
    WebElement loginButton;
    @FindBy(xpath ="//li[contains(text(),'No customer account found')]")
    //div[contains(text(),'Login was unsuccessful. Please correct the errors and try again.')]
    //body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/form[1]/div[1]
    WebElement errorMessage;
    @FindBy(xpath = "//h2[contains(text(),'Welcome to our store')]")
    //div[@class='topic-block-title']/h2
    WebElement WelcomeToOurStore;

    public String getWelcomeText() {
        log.info(("Verify The Text,Welcome, Please Sign In! : " + welcomeText.toString()));
        return getTextFromElement(welcomeText);
    }

    public void setEnterEmail(String email) {
        sendTextToElement(enterEmail, email);
        log.info("Entering email address : " + email + " to email field : " + enterEmail.toString());
    }

    public void setEnterPassword(String password) {
        sendTextToElement(enterPassword,password);
        log.info("Entering password : " + password + " to password field : " + enterPassword.toString());
    }

    public void clickLoginButton() {
        clickOnElement(loginButton);
        log.info("Clicking on login button : " + loginButton.toString());
    }

    public String getErrorMessage() {
        log.info("Verify the Text, Error Message  : " + errorMessage.toString());
        return getTextFromElement(errorMessage);
    }

    public String getLoginSuccessfull() {
        log.info("Verify the Text, Welcome To Our Store  : " + WelcomeToOurStore.toString());
        return getTextFromElement(WelcomeToOurStore);

    }

}

