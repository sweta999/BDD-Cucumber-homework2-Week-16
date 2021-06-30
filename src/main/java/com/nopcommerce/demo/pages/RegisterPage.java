package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class RegisterPage extends Utility {

    //Logger is class of Log4j. log is object created
    private static final Logger log = LogManager.getLogger(RegisterPage.class.getName());

    @FindBy(xpath = "//h1[contains(text(),'Register')]")
    WebElement verifyRegisterPage;
    @FindBy(xpath = "//input[@id='gender-male']")
    WebElement selectMale;
    @FindBy(xpath = "//input[@id='gender-female']")
    WebElement selectFemale;
    @FindBy(id = "FirstName")
    WebElement firstName;
    @FindBy(id = "LastName")
    WebElement lastName;
    @FindBy(xpath = "//select[@name='DateOfBirthDay']")
    WebElement dateOfBirthDay;
    @FindBy(xpath = "//select[@name='DateOfBirthMonth']")
    WebElement dateOfBirthMonth;
    @FindBy(xpath = "//select[@name='DateOfBirthYear']")
    WebElement dateOfBirthYear;
    @FindBy(id = "Email")
    WebElement enterEmail;
    @FindBy(id = "Newsletter")
    WebElement clearNewsletterBox;
    @FindBy(id = "Password")
    WebElement enterPassword;
    @FindBy(id = "ConfirmPassword")
    WebElement enterConfirmPassword;
    @FindBy(id = "register-button")
    WebElement registerButton;
    @FindBy(xpath = "//span[contains(text(),'First name is required.')]")
    WebElement verifyFirstNameError;
    @FindBy(xpath = "//div[contains(text(),'Your registration completed')]")
    WebElement verifyRegistrationComplete;



    public String setVerifyRegisterPage() {
        log.info(("Verify the Text, Register : " + verifyRegisterPage.toString()));
        return getTextFromElement(verifyRegisterPage);
    }

    public void setSelectMale() {
        clickOnElement(selectMale);
        log.info(("Select Male Radio Button : " + selectMale.toString()));
    }

    public void setSelectFemale() {
        clickOnElement(selectFemale);
        log.info(("Select Female Radio Button : " + selectFemale.toString()));
    }

    public void setFirstName(String FirstName) {
        sendTextToElement(firstName, FirstName);
        log.info("Select First Name " + firstName.toString());
    }

    public void setLastName(String LastName) {
        sendTextToElement(lastName, LastName);
        log.info("Select Last Name " + lastName.toString());
    }

    public void setDateOfBirthDay(String Day) {
        selectByValueFromDropDown(dateOfBirthDay,Day);
        log.info("Select Date of BirthDay " + dateOfBirthDay.toString());
    }

    public void setDateOfBirthMonth(String Month) {
        selectByValueFromDropDown(dateOfBirthMonth,Month);
        log.info("Select Date of BirthMonth " + dateOfBirthMonth.toString());
    }

    public void setDateOfBirthYear(String Year) {
        selectByValueFromDropDown(dateOfBirthYear,Year);
        log.info("Select Date of BirthYear " + dateOfBirthYear.toString());
    }

    public void setEnterEmail(String email) {
        sendTextToElement(enterEmail,email);
        log.info("Enter email address : " + email + " to email field : " + enterEmail.toString());
    }

    //Note : this box gives tick by default on Register page.
    public void setClearNewsletterBox() {
        clearNewsletterBox.clear();
        log.info("Clear tick from NewLetter Box " + clearNewsletterBox.toString());
    }

    public void setEnterPassword(String password) {
        sendTextToElement(enterPassword, password);
        log.info("Enter password : " + password + " to password field : " + enterPassword.toString());
    }

    public void setEnterConfirmPassword(String confirmPassword) {
        sendTextToElement(enterConfirmPassword, confirmPassword);
        log.info("Enter password : " + confirmPassword + " to password field : " + enterPassword.toString());
    }

    public void setRegisterButton() {
        clickOnElement(registerButton);
        log.info("Click on Register button : " + registerButton.toString());
    }

    public String getTextEmptyFirstName() {
        log.info("Verify the Text, First Name is required : " + verifyFirstNameError.toString());
        return getTextFromElement(verifyFirstNameError);
    }

    public String getTextRegistrationComplete() {
        log.info("Verify the Text, Registration Complete : " + verifyRegistrationComplete.toString());
        return getTextFromElement(verifyRegistrationComplete);
    }


}





