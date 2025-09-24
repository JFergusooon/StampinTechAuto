package Pages;
import SeleniumSetup.DriverManager;
import SeleniumSetup.SeleniumActions;
import org.openqa.selenium.*;

public class LandingPage extends SeleniumActions {
    public String signInButtonXPath = "//button[@data-testid='menu-user-btn-signin']";
    public String helloUserXPath = "//*[@data-testid='menu-user-firstname']";

    //Account Dropdown
    public String accountSettingXPath = "//*[@data-testid='account-link'][1]";
    public String addressesXPath = "//*[@data-testid='account-link'][2]";
    public String paymentXPath = "//*[@data-testid='account-link'][3]";
    public String myOrdersXPath = "//*[@data-testid='account-link'][4]";
    public String myListsXPath = "//*[@data-testid='account-link'][5]";
    public String subscriptionsXPath = "//*[@data-testid='account-link'][6]";
    public String demonstratorXPath = "//*[@data-testid='account-link'][7]";
    public String rewardsXPath = "//*[@data-testid='account-link'][8]";
    public String signOutXPath = "//*[@data-testid='auth-logout']";

    public void clickSignInButton() {
        testStepStartLog("Clicking 'Sign In' Button");
        WebElement signInButton = DriverManager.getDriver().findElement(By.xpath(signInButtonXPath));
        signInButton.click();
        testStepLog("SignIn Button successfully clicked.");
    }

    public void clickHelloUserButton() throws InterruptedException {
        testStepStartLog("Clicking 'Hello User' Button");
        Thread.sleep(2000);
        WebElement helloUserButton = DriverManager.getDriver().findElement(By.xpath(helloUserXPath));
        helloUserButton.click();
        testStepLog("Hello User clicked.");
    }

    public void clickAccountSettingButton() {
        testStepStartLog("Clicking 'Account Setting' Button");
        WebElement accountSettingButton = DriverManager.getDriver().findElement(By.xpath(accountSettingXPath));
        accountSettingButton.click();
        testStepLog("Account Setting clicked.");
    }

    public void clickSignOutButton() {
        testStepStartLog("Clicking 'Sign Out' Button");
        WebElement signOutButton = DriverManager.getDriver().findElement(By.xpath(signOutXPath));
        signOutButton.click();
        testStepLog("Sign Out Button clicked.");
    }
}
