package Components;

import SeleniumSetup.DriverManager;
import SeleniumSetup.SeleniumActions;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginPopup extends SeleniumActions {
    private String userNameXPath = "//*[@data-testid='auth-email']";
    private String passwordXPath = "//*[@data-testid='auth-password']";

    private String regPasswordXPath = "//input[@data-testid='reg-password']";
    private String regFirstNameXPath = "//*[@data-testid='reg-first-name']";
    private String regLastNameXPath = "//*[@data-testid='reg-last-name']";
    private String regEmailXPath = "//*[@data-testid='reg-email']";
    private String regConfirmPasswordXPath = "//input[@data-testid='reg-password-confirmation']";
    private String signInButtonXPath = "//*[@id='login-btn']";
    private String regCreateNewAccountXPath = "//*[@data-testid='btn-create-account']";
    private String regCreateNewAccountSubmitXPath = "//*[@data-testid='reg-submit']";

    public void enterUserName(String userName) {
        testStepStartLog("Entering user name");
        try {
            enterText(userName, userNameXPath);
            testStepStartLog("username entered successfully");
        } catch (Exception e) {
            testStepStartLog("username entered failed");
            DriverManager.quitDriver();
            Assert.fail(e.getMessage());
        }
    }

    public void enterPassword(String password) {
        testStepStartLog("Entering password: " + password);
        try {
            enterText(password, passwordXPath);
            testStepLog("Password entered successfully");
        } catch (Exception e) {
            testStepErrorLog("Failed to enter password text");
            DriverManager.quitDriver();
            Assert.fail(e.getMessage());
        }

    }

    private void enterFirstName(String firstName) {
        testStepStartLog("Entering first name: " + firstName);
        try {
            doubleClick(regFirstNameXPath);
            enterText(firstName, regFirstNameXPath);
            testStepLog("First Name entered successfully");
        } catch (Exception e) {
            testStepErrorLog("Failed to enter first name");
            DriverManager.quitDriver();
            Assert.fail(e.getMessage());
        }
    }

    private void enterLastName(String lastName) {
        testStepStartLog("Entering last name: " + lastName);
        try {
            doubleClick(regLastNameXPath);
            enterText(lastName, regLastNameXPath);
            testStepLog("Last Name entered successfully");
        } catch (Exception e) {
            testStepErrorLog("Failed to enter last name");
            DriverManager.quitDriver();
            Assert.fail(e.getMessage());
        }

    }

    private void enterEmail(String email) {
        testStepStartLog("Entering email: " + email);
        try {
            doubleClick(regEmailXPath);
            enterText(email, regEmailXPath);
            testStepLog("Email entered successfully");
        } catch (Exception e) {
            testStepErrorLog("Failed to enter email");
            DriverManager.quitDriver();
            Assert.fail(e.getMessage());
        }

    }

    private void enterRegPassword(String password) {
        testStepStartLog("Entering reg password: " + password);
        try {
            click(regPasswordXPath);
            enterText(password, regPasswordXPath);
            testStepLog("Password entered successfully");
        } catch (Exception e) {
            testStepErrorLog("Failed to enter password");
            DriverManager.quitDriver();
            Assert.fail(e.getMessage());
        }
    }

    private void enterConfirmPassword(String password) {
        testStepStartLog("Entering confirm password: " + password);
        try {
            doubleClick(regConfirmPasswordXPath);
            enterText(password, regConfirmPasswordXPath);
            testStepLog("Password entered successfully");
        } catch (Exception e) {
            testStepErrorLog("Failed to enter confirm password");
            DriverManager.quitDriver();
            Assert.fail(e.getMessage());
        }
    }


    public void clickSignInButton() {
        testStepStartLog("Clicking sign in button");
        try {
            WebElement signInButton = DriverManager.getDriver().findElement(By.xpath(signInButtonXPath));
            signInButton.click();
            testStepLog("Sign in button clicked");
        } catch (Exception e) {
            testStepErrorLog("Failed to click sign in button");
            DriverManager.quitDriver();
            Assert.fail(e.getMessage());
        }
    }

    public void signInWithUser(String username, String password) {
        enterUserName(username);
        enterPassword(password);
        clickSignInButton();
    }


    // New User / Register Flow
    public void clickCreateAccountButton() throws InterruptedException {
        testStepStartLog("Clicking create account button");
        try {
            Thread.sleep(3000);
            testStepLog("Element is visible");
            WebElement createAccountButton = DriverManager.getDriver().findElement(By.xpath(regCreateNewAccountXPath));
            createAccountButton.click();

            SeleniumActions.waitForElementToBeVisible(regFirstNameXPath);
            testStepLog("First name entered successfully");
        } catch (Exception e) {
            testStepErrorLog("Failed to click create account button");
            DriverManager.quitDriver();
            Assert.fail(e.getMessage());
        }
    }

    public void fillNewCustomerForm() {
        testStepStartLog("Filling new customer form");
        try {
            String newFirstName = java.util.UUID.randomUUID().toString().replace("-", "").substring(0, 2);
            String newLastName = java.util.UUID.randomUUID().toString().replace("-", "").substring(0, 2);
            String newEmail = java.util.UUID.randomUUID().toString().replace("-", "").substring(0, 4) + "@g.co";
            String newPassword = java.util.UUID.randomUUID().toString().replace("-", "").substring(0, 13);

            enterFirstName(newFirstName);
            enterLastName(newLastName);
            enterEmail(newEmail);
            enterRegPassword(newPassword);
            enterConfirmPassword(newPassword);
            testStepLog("Password entered successfully");
        }  catch (Exception e) {
            testStepErrorLog("Failed to fill new customer form");
            DriverManager.quitDriver();
            Assert.fail(e.getMessage());
        }
    }

    public void clickCreateAccountSubmitButton() {
        testStepStartLog("Clicking create account button");
        try {
            WebElement createNewAccountSubmitButton = DriverManager.getDriver().findElement(By.xpath(regCreateNewAccountSubmitXPath));
            createNewAccountSubmitButton.click();
            testStepLog("Create account button clicked");
        }  catch (Exception e) {
            testStepErrorLog("Failed to click create account button");
            DriverManager.quitDriver();
            Assert.fail(e.getMessage());
        }

    }
}
