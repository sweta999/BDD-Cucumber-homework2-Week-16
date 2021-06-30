package com.nopcommerce.demo.stepdefs;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.RegisterPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class RegistrationTestStepdefs {

    @Given("^I am on nopcommerce homepage$")
    public void iAmOnNopcommerceHomepage() {
    }

    @When("^I click on Register link$")
    public void iClickOnRegisterLink() {
        new HomePage().clickOnRegisterLink();
    }

    @Then("^I should navigate to Register page successfully \"([^\"]*)\"$")
    public void iShouldNavigateToRegisterPageSuccessfully(String verifyMessage) throws InterruptedException {
        Thread.sleep(1000);
        Assert.assertEquals("Register", new RegisterPage().setVerifyRegisterPage());
    }

    @And("^I select female radio button$")
    public void iSelectFemaleRadioButton() {
        new RegisterPage().setSelectFemale();
    }

    @And("^I leave first name box empty \"([^\"]*)\"$")
    public void iLeaveFirstNameBoxEmpty(String firstname)  {
        new RegisterPage().setFirstName(firstname);
    }

    @And("^I enter last name \"([^\"]*)\"$")
    public void iEnterLastName(String lastname)  {
        new RegisterPage().setLastName(lastname);
    }

    @And("^I enter email in email field \"([^\"]*)\"$")
    public void iEnterEmailInEmailField(String email)  {
        new RegisterPage().setEnterEmail(email);
    }

    @And("^I enter password in password field \"([^\"]*)\"$")
    public void iEnterPasswordInPasswordField(String password)  {
       new RegisterPage().setEnterPassword(password);
    }

    @And("^I enter confirm password \"([^\"]*)\"$")
    public void iEnterConfirmPassword(String confirmpassword)  {
        new RegisterPage().setEnterConfirmPassword("sahi2000");
    }

    @And("^I click on Register button$")
    public void iClickOnRegisterButton() {
        new RegisterPage().setRegisterButton();
    }

    @Then("^I should see the error message First Name is required \"([^\"]*)\"$")
    public void iShouldSeeTheErrorMessageFirstNameIsRequired(String errorMessage)  {
        Assert.assertEquals(errorMessage, new RegisterPage().getTextEmptyFirstName());
        //Assert.assertTrue(errorMessage, new RegisterPage().getTextEmptyFirstName().contains(errorMessage));
    }

    @And("^I enter first name \"([^\"]*)\"$")
    public void iEnterFirstName(String firstname)  {
        new RegisterPage().setFirstName(firstname);
    }

    @Then("^I should Register successfully \"([^\"]*)\"$")
    public void iShouldRegisterSuccessfully(String registermessage)  {
        Assert.assertEquals("Your registration completed", new RegisterPage().getTextRegistrationComplete());
        //Assert.assertTrue("Your registration completed", new RegisterPage().getTextEmptyFirstName().contains(registermessage));
    }


}
