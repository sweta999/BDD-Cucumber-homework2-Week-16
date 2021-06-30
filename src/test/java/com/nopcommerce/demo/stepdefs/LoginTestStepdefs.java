package com.nopcommerce.demo.stepdefs;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.LoginPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class LoginTestStepdefs {

    @Given("^I am on homepage$")
    public void iAmOnHomepage() {
    }

    @When("^I click on Login link$")
    public void iClickOnLoginLink() {
        new HomePage().clickOnLoginLink();
    }

    @Then("^I should navigated to login page successfully \"([^\"]*)\"$")
    public void iShouldNavigatedToLoginPageSuccessfully(String verifyWelcomeMessage)  {
        Assert.assertEquals("Welcome, Please Sign In!", new LoginPage().getWelcomeText());
    }

    @And("^I enter email \"([^\"]*)\"$")
    public void iEnterEmail(String email) throws InterruptedException {
        Thread.sleep(1000);
        new LoginPage().setEnterEmail(email);
    }

    @And("^I enter password \"([^\"]*)\"$")
    public void iEnterPassword(String password)  {
        new LoginPage().setEnterPassword(password);
    }

    @And("^I click on login button$")
    public void iClickOnLoginButton() {
        new LoginPage().clickLoginButton();
    }

    @Then("^I should see the error message \"([^\"]*)\"$")
    public void iShouldSeeTheErrorMessage(String errorMessage) throws InterruptedException {
       Thread.sleep(2000);
        Assert.assertEquals(errorMessage, new LoginPage().getErrorMessage());
        //Assert.assertTrue(errorMessage, new LoginPage().getErrorMessage().contains(errorMessage));
    }

    @Then("^I should login successfully$")
    public void iShouldLoginSuccessfully() {
        String expectedmsg = "Welcome to our store";
        String actualmsg  = new LoginPage().getLoginSuccessfull();
        Assert.assertEquals(expectedmsg,actualmsg);
    }

    @And("^I leave first name box empty$")
    public void iLeaveFirstNameBoxEmpty() {

    }
}
