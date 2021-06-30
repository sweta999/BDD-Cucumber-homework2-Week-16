package com.nopcommerce.demo.pages;


import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class ComputerPage extends Utility {

    //Logger is class of Log4j. log is object created
    private static final Logger log = LogManager.getLogger(ComputerPage.class.getName());

    @FindBy(xpath ="//ul[@class='sublist']/li[1]/a")
    WebElement desktopLink;
    @FindBy(xpath = "//ul[@class='sublist']/li[2]/a")
    WebElement notebooksLink;
    @FindBy(xpath = "//ul[@class='sublist']/li[3]/a")
    WebElement softwareLink;
    @FindBy(xpath = "//h1[contains(text(),'Desktops')]")
    WebElement getTextForDesktopsPage;
    @FindBy(xpath = "//h1[contains(text(),'Notebooks')]")
    WebElement getTextForNotebooksPage;
    @FindBy(xpath = "//h1[contains(text(),'Software')]")
    WebElement getTextForSoftwarePage;

    public void clickOnDesktopLink() {
        mouseHoverToElementAndClick(desktopLink);
        log.info("Click on Desktop Link : " + desktopLink.toString());
    }

    public void clickOnNotebooksLink() {
        mouseHoverToElementAndClick(notebooksLink);
        log.info("Click on Notebooks Link : " + notebooksLink.toString());
    }

    public void clickOnSoftwareLink() {
        mouseHoverToElementAndClick(softwareLink);
        log.info("Click on Software Link : " + softwareLink.toString());
    }

    public String setGetTextForDesktops() {
        log.info(("Verify the Text, Desktop : " + getTextForDesktopsPage.toString()));
        return getTextFromElement(getTextForDesktopsPage);
    }

    public String setGetTextForNotebooks() {
        log.info(("Verify the Text, Notebooks : " + getTextForNotebooksPage.toString()));
        return getTextFromElement(getTextForNotebooksPage);
    }

    public String setGetTextForSoftware() {
        log.info(("Verify the Text, Software : " + getTextForSoftwarePage.toString()));
        return getTextFromElement(getTextForSoftwarePage);
    }


}
