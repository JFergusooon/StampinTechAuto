package Components;

import SeleniumSetup.DriverManager;
import SeleniumSetup.SeleniumActions;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class RewardsPopup extends SeleniumActions {
    private String getStartedButtonXPath = "(//*[text()='Join Stampin’ Rewards!']/../../..//span)[1]";
    private String maybeLaterButtonXPath = "(//*[text()='Join Stampin’ Rewards!']/../../..//span)[2]";

    private String xButtonXPath = "(//*[text()='You opted out of Stampin’ Rewards. Sign up again at any time ']/../../..//button)[2]";
    private String closeButtonXPath = "(//*[text()='You opted out of Stampin’ Rewards. Sign up again at any time ']/../../..//button)[1]";

    public void clickGetStartedButton() throws InterruptedException {
        testStepStartLog("Clicking 'Get Started' Button");
        try {
            waitForElementToBeVisible(getStartedButtonXPath);
            click(getStartedButtonXPath);
            testStepLog("'Get Started' Button successfully clicked");
        } catch(Exception e){
            testStepErrorLog("Failed to click 'Get Started' Button");
            DriverManager.quitDriver();
            Assert.fail(e.getMessage());
        }
    }

    public void clickMaybeLaterButton() throws InterruptedException {
        testStepStartLog("Clicking 'Maybe Later' Button");
        try {
            Thread.sleep(5000);
            waitForElementToBeVisible(maybeLaterButtonXPath);
            click(maybeLaterButtonXPath);
            testStepLog("'Maybe Later' Button successfully clicked");
        } catch(Exception e){
            testStepErrorLog("Failed to click 'Maybe Later' Button");
            DriverManager.quitDriver();
            Assert.fail(e.getMessage());
        }
    }

    public void clickXButton() throws InterruptedException {
        testStepStartLog("Clicking 'X' Button");
        try {
            Thread.sleep(8000);
            waitForElementToBeVisible(xButtonXPath);
            click(xButtonXPath);
            testStepLog("'X' Button successfully clicked");
        } catch(Exception e){
            testStepErrorLog("Failed to click 'X' Button");
            DriverManager.quitDriver();
            Assert.fail(e.getMessage());
        }
    }

    public void clickCloseButton() throws InterruptedException {
        testStepStartLog("Clicking 'Close' Button");
        try {
            Thread.sleep(5000);
            waitForElementToBeVisible(closeButtonXPath);
            click(closeButtonXPath);
            testStepLog("'Close' Button successfully clicked");
        } catch(Exception e){
            testStepErrorLog("Failed to click 'Close' Button");
            DriverManager.quitDriver();
            Assert.fail(e.getMessage());
        }
    }
}
