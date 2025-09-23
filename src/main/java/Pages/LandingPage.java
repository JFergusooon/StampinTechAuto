package Pages;
import SeleniumSetup.SeleniumActions;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

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

    public void clickSignInButton(ChromeDriver driver) {
        testStepStartLog("Clicking 'Sign In' Button");
        WebElement signInButton = driver.findElement(By.xpath(signInButtonXPath));
        signInButton.click();

        testStepLog("SignIn Button successfully clicked.");
    }
}
