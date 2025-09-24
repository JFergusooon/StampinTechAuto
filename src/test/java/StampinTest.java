import Components.*;
import Pages.*;
import SeleniumSetup.DriverManager;
import SeleniumSetup.SeleniumActions;
import org.testng.annotations.*;

public class StampinTest {

    @BeforeTest
    public void beforeSuite() {
        DriverManager.startDriver();
    }

    @Test(enabled = false, priority = 1)
    public static void happyPathNewCustomerTest() throws InterruptedException {
        SeleniumActions.initDriver();
        //Initial Manual Authentication Check
        //      Website is asking for 'Additional security check' must be done manually.
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
        landingPage.clickSignOutButton();

    }

    @Test(enabled = false, priority = 2)
    public static void newCustomerTestWithAddress() throws InterruptedException {
        SeleniumActions.initDriver();
        //Initial Manual Authentication Check
        //      Website is asking for 'Additional security check' must be done manually.
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

        myAccountPage.clickUseMyShippingAddress();
        myAccountPage.verifyMailingAddressMatchesShippingAddress();

        //DO MORE VALIDATIONS FOR ADDRESS
        myAccountPage.clickOnAccountSettingsTab();
        myAccountPage.clickEditUnderContact();
        myAccountPage.fillContactFormAndSave();

        landingPage.clickHelloUserButton();
        landingPage.clickSignOutButton();

        Thread.sleep(10000); //END
    }

    @Test(enabled = true, priority = 3)
    public static void existingCustomerTest() throws InterruptedException {
        //Typically we would have a testdata file so there is no hardcoded information in the tests,
        // but for simplicity I will declare the sign in username & password here,
        String username = "JFergusooon@gmail.com"; // this would come from testdata folder.
        String password = "Jeffrey57!";

        SeleniumActions.initDriver();
        //Initial Manual Authentication Check
        //      Website is asking for 'Additional security check' must be done manually.
        Thread.sleep(20000);

        //Sign In
        LandingPage landingPage = new LandingPage();
        landingPage.clickSignInButton();
        LoginPopup loginPopup = new LoginPopup();
        loginPopup.enterUserName(username);
        loginPopup.enterPassword(password);
        loginPopup.clickSignInButton();

        //Edit Fields in Address & Settings
        landingPage.clickHelloUserButton();
        landingPage.clickAccountSettingButton();

        MyAccountPage myAccountPage = new MyAccountPage();
        myAccountPage.clickEditUnderContact();
        myAccountPage.editContactFormSaveAndVerify();

        myAccountPage.clickOnAddressesTab();
        myAccountPage.editAddressSaveAndVerify();

        landingPage.clickHelloUserButton();
        landingPage.clickSignOutButton();

        Thread.sleep(10000); //END
    }

    @AfterTest
    public static void afterTest() throws InterruptedException {
        DriverManager.quitDriver();
    }
}

