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

    @Test
    public static void newCustomerTest() throws InterruptedException {
        SeleniumActions.initDriver();
        //Manual Authentication Check
        Thread.sleep(20000);

        //TEST START
        LandingPage landingPage = new LandingPage();
        landingPage.clickSignInButton(DriverManager.getDriver());


        LoginPopup loginPopup = new LoginPopup();
        loginPopup.clickCreateAccountButton(DriverManager.getDriver());
        loginPopup.fillNewCustomerForm(DriverManager.getDriver());
        loginPopup.clickCreateAccountSubmitButton(DriverManager.getDriver());


        RewardsPopup rewardsPopup = new RewardsPopup();
        rewardsPopup.clickMaybeLaterButton();
        rewardsPopup.clickCloseButton();


        Thread.sleep(10000);
    }

    @AfterSuite
    public static void tearDown() {
        DriverManager.quitDriver();
    }
}

