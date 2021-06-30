package com.nopcommerce.demo.stepdefs;

import com.nopcommerce.demo.pages.ComputerPage;
import com.nopcommerce.demo.pages.HomePage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class ComputerTestStepdefs {

    @Given("^I am on nopcommerce website homepage$")
    public void iAmOnNopcommerceWebsiteHomepage() {
    }

    @When("^I click on Computers Link$")
    public void iClickOnComputersLink() {
        new HomePage().clickOnComputersLink();
    }

    @And("^I click on Desktop Link$")
    public void iClickOnDesktopLink() {
        new ComputerPage().clickOnDesktopLink();
    }

    @Then("^I should navigate to desktop page \"([^\"]*)\"$")
    public void iShouldNavigateToDesktopPage(String verifydesktoppage)  {
        Assert.assertEquals("Desktops", new ComputerPage().setGetTextForDesktops());
    }

    @And("^I click on Notebooks Link$")
    public void iClickOnNotebooksLink() {
        new ComputerPage().clickOnNotebooksLink();
    }

    @Then("^I should navigate to notebooks page \"([^\"]*)\"$")
    public void iShouldNavigateToNotebooksPage(String verifynotebookspage)  {
        Assert.assertEquals("Notebooks", new ComputerPage().setGetTextForNotebooks());
    }

    @And("^I click on Software Link$")
    public void iClickOnSoftwareLink() {
        new ComputerPage().clickOnSoftwareLink();
    }

    @Then("^I should navigate to software page \"([^\"]*)\"$")
    public void iShouldNavigateToSoftwarePage(String verifysoftwarepage)  {
        Assert.assertEquals("Software", new ComputerPage().setGetTextForSoftware());
    }


}
