import Components.*;
import Pages.*;
import SeleniumSetup.DriverManager;
import SeleniumSetup.SeleniumActions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.sql.Driver;

public class StampinTest {

    @BeforeSuite
    public void beforeSuite() {
        DriverManager.startDriver();
    }

    @Test(enabled = true)
    public static void happyPathNewCustomerTest() throws InterruptedException {
        SeleniumActions.initDriver();
        //Manual Authentication Check
        Thread.sleep(20000);

        //TEST START
        LandingPage landingPage = new LandingPage();
        landingPage.clickSignInButton();


        LoginPopup loginPopup = new LoginPopup();
        loginPopup.clickCreateAccountButton();
        loginPopup.fillNewCustomerForm();
        loginPopup.clickCreateAccountSubmitButton();


        RewardsPopup rewardsPopup = new RewardsPopup();
        rewardsPopup.clickMaybeLaterButton();
        rewardsPopup.clickCloseButton();
    }

    @Test
    public static void newCustomerTest() throws InterruptedException {
        SeleniumActions.initDriver();
        //Manual Authentication Check
        Thread.sleep(20000);

        //TEST START
        LandingPage landingPage = new LandingPage();
        landingPage.clickSignInButton();


        LoginPopup loginPopup = new LoginPopup();
        loginPopup.clickCreateAccountButton();
        loginPopup.fillNewCustomerForm();
        loginPopup.clickCreateAccountSubmitButton();


        RewardsPopup rewardsPopup = new RewardsPopup();
        rewardsPopup.clickMaybeLaterButton();
        rewardsPopup.clickCloseButton();

        landingPage.clickHelloUserButton();
        landingPage.clickAccountSettingButton();

        MyAccountPage myAccountPage = new MyAccountPage();
        myAccountPage.clickOnAddressesTab();

        myAccountPage.fillSubmitAndVerifyNewAddressForm();

        myAccountPage.clickOnAddressesTab();
        Thread.sleep(10000);
    }

    @AfterSuite
    public static void tearDown() {
        DriverManager.quitDriver();
    }
}

