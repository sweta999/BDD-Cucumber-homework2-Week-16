package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class HomePage extends Utility {

    //Logger is class of Log4j. log is object created
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    @FindBy(linkText = "Log in")
    WebElement loginLink;
    @FindBy(linkText = "Register")
    WebElement registerLink;
    @FindBy(xpath = "//div[@class='header-menu']/ul[1]/li[1]")
    WebElement computerLink;


    public void clickOnLoginLink() {
        clickOnElement(loginLink);
        log.info(("Clicking on Login Link : " + loginLink.toString()));
    }

    public void clickOnRegisterLink() {
        clickOnElement(registerLink);
        log.info(("Clicking on Register Link : " + registerLink.toString()));
    }

    public void clickOnComputersLink() {
        clickOnElement(computerLink);
        log.info(("Clicking on Computers Link : " + computerLink.toString()));
    }

}