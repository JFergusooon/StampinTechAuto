package Pages;

import SeleniumSetup.DriverManager;
import SeleniumSetup.SeleniumActions;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.util.Objects;

public class MyAccountPage extends SeleniumActions {
    private String navigationAddressesXPath = "//span[text()='Addresses']";
    private String navigationAccountSettingsXPath = "//span[text()='Account Settings']";

    //AddressPage
    private String defaultShippingEditButtonXPath = "(//a[@data-testid='addresslist-item-btn-edit'])[1]";
    private String defaultMailingEditButtonXPath = "(//a[@data-testid='addresslist-item-btn-edit'])[2]";
    private String firstNameXPath = "//input[@data-testid='address-field-first-name']";
    private String lastNameXPath = "//input[@data-testid='address-field-last-name']";
    private String addressOneXPath = "//input[@data-testid='address.addressLine1']";
    private String addressTwoXPath = "//input[@data-testid='address-field-addressLine2']";
    private String cityXPath = "//input[@data-testid='address-field-city']";
    private String stateXPath = "//input[@data-testid='autocomplete-field-div']";
    private String zipCodeXPath = "//input[@data-testid='address-field-postalCode']";
    private String phoneNumberXPath = "//input[@data-testid='address-telephone']";
    private String defaultShippingXPath = "//input[@data-testid='address-default']";
    private String defaultMailingXPath = "//input[@data-testid='mailing-address-default']";
    private String saveAddressButtonXPath = "//button[@data-testid='address-save']";
    private String cancelButtonXPath = "//button[@data-testid='cancelButton']";
    private String useMyShippingAddressButtonXPath = "//div[@data-testid='default-mailing-address']/following-sibling::div//button";

    //AccountSettingPage
    private String contactFirstNameXPath = "//input[@data-testid='account-card-firstName']";
    private String contactLastNameXPath = "//input[@data-testid='account-card-lastName']";
    private String contactEmailXPath = "//input[@data-testid='account-card-email']";
    private String contactSectionEditButtonXPath = "//button[@data-testid='edit-contact-setting']";
    private String contactPhoneNumberInputXPath = "//input[@data-testid='account-card-phone']";
    private String contactMethodOfContactInputXPath = "//*[text()='Preferred Method of Contact']/following-sibling::div/input";

    public void clickOnAddressesTab() {
        testStepStartLog("Clicking on Addresses Tab");
        try {
            WebElement addressesTab = DriverManager.getDriver().findElement(By.xpath(navigationAddressesXPath));
            addressesTab.click();
            Thread.sleep(5000);
            testStepLog("Addresses Tab button clicked");
        } catch (Exception e) {
            testStepErrorLog("Failed to click Addresses Tab");
            DriverManager.quitDriver();
            Assert.fail(e.getMessage());
        }
    }

    public void clickEditUnderShippingAddress() {
        testStepStartLog("Clicking on Edit Under Shipping Address");
        try {
            WebElement element = DriverManager.getDriver().findElement(By.xpath(defaultShippingEditButtonXPath));
            element.click();
            testStepLog("Default Shipping Edit Button clicked");
        } catch (Exception e) {
            testStepErrorLog("Failed to click Default Shipping Edit Button");
            DriverManager.quitDriver();
            Assert.fail(e.getMessage());
        }
    }

    public void enterFirstName(String firstName) {
        testStepStartLog("Entering First Name: " + firstName);
        try {
            waitForElementToBeVisible(firstNameXPath);
            doubleClick(firstNameXPath);
            enterText(firstName, firstNameXPath);
            testStepLog("First Name entered successfully");
        } catch (Exception e) {
            testStepErrorLog("Failed to enter First Name");
            DriverManager.quitDriver();
            Assert.fail(e.getMessage());
        }
    }

    public void enterLastName(String lastName) {
        testStepStartLog("Entering Last Name: " + lastName);
        try {
            waitForElementToBeVisible(lastNameXPath);
            doubleClick(lastNameXPath);
            enterText(lastName, lastNameXPath);
            testStepLog("Last Name entered successfully");
        } catch (Exception e) {
            testStepErrorLog("Failed to enter Last Name");
            DriverManager.quitDriver();
            Assert.fail(e.getMessage());
        }
    }

    public void enterAddressOne(String addressOne) {
        testStepStartLog("Entering Address One: " + addressOne);
        try {
            waitForElementToBeVisible(addressOneXPath);
            doubleClick(addressOneXPath);
            enterText(addressOne, addressOneXPath);
            testStepLog("Address One entered successfully");
        } catch (Exception e) {
            testStepErrorLog("Failed to enter Address One");
            DriverManager.quitDriver();
            Assert.fail(e.getMessage());
        }
    }

    public void enterAddressTwo(String addressTwo) {
        testStepStartLog("Entering Address Two: " + addressTwo);
        try {
            waitForElementToBeVisible(addressTwoXPath);
            doubleClick(addressTwoXPath);
            enterText(addressTwo, addressTwoXPath);
            testStepLog("Address Two entered successfully");
        } catch (Exception e) {
            testStepErrorLog("Failed to enter Address Two");
            DriverManager.quitDriver();
            Assert.fail(e.getMessage());
        }
    }

    public void enterCity(String city) {
        testStepStartLog("Entering City: " + city);
        try {
            waitForElementToBeVisible(cityXPath);
            doubleClick(cityXPath);
            enterText(city, cityXPath);
            testStepLog("City entered successfully");
        } catch (Exception e) {
            testStepErrorLog("Failed to enter City");
            DriverManager.quitDriver();
            Assert.fail(e.getMessage());
        }
    }

    public void enterState(String state) {
        testStepStartLog("Entering State: " + state);
        try {
            waitForElementToBeVisible(stateXPath);
            doubleClick(stateXPath);
            enterText(state, stateXPath);
            testStepLog("State entered successfully");
        } catch (Exception e) {
            testStepErrorLog("Failed to enter State");
            DriverManager.quitDriver();
            Assert.fail(e.getMessage());
        }
    }

    public void enterZipCode(String zipCode) {
        testStepStartLog("Entering Zip Code: " + zipCode);
        try {
            waitForElementToBeVisible(zipCodeXPath);
            doubleClick(zipCodeXPath);
            enterText(zipCode, zipCodeXPath);
            testStepLog("Zip Code entered successfully");
        } catch (Exception e) {
            testStepErrorLog("Failed to enter Zip Code");
            DriverManager.quitDriver();
            Assert.fail(e.getMessage());
        }
    }

    public void enterPhoneNumber(String phoneNumber) {
        testStepStartLog("Entering Phone Number: " + phoneNumber);
        try {
            waitForElementToBeVisible(phoneNumberXPath);
            doubleClick(phoneNumberXPath);
            enterText(phoneNumber, phoneNumberXPath);
            testStepLog("Phone Number entered successfully");
        } catch (Exception e) {
            testStepErrorLog("Failed to enter Phone Number");
            DriverManager.quitDriver();
            Assert.fail(e.getMessage());
        }
    }

    public void clickOnDefaultShippingCheckBox() {
        testStepStartLog("Clicking on Default Shipping");
        try {
            WebElement element = DriverManager.getDriver().findElement(By.xpath(defaultShippingXPath));
            element.click();
            testStepLog("Default Shipping clicked");
        } catch (Exception e) {
            testStepErrorLog("Failed to click Default Shipping");
            DriverManager.quitDriver();
            Assert.fail(e.getMessage());
        }
    }

    public void clickOnDefaultMailingCheckBox() {
        testStepStartLog("Clicking on Default Mailing");
        try {
            WebElement element = DriverManager.getDriver().findElement(By.xpath(defaultMailingXPath));
            element.click();
            testStepLog("Default Mailing clicked");
        } catch (Exception e) {
            testStepErrorLog("Failed to click Default Mailing");
            DriverManager.quitDriver();
            Assert.fail(e.getMessage());
        }
    }

    public void clickOnSaveAddressButton() {
        testStepStartLog("Clicking on Save Address Button");
        try {
            WebElement element = DriverManager.getDriver().findElement(By.xpath(saveAddressButtonXPath));
            element.click();
            testStepLog("Save Address Button clicked");
        } catch (Exception e) {
            testStepErrorLog("Failed to click Save Address Button");
            DriverManager.quitDriver();
            Assert.fail(e.getMessage());
        }
    }

    public void clickOnCancelButton() {
        testStepStartLog("Clicking on Cancel Button");
        try {
            WebElement element = DriverManager.getDriver().findElement(By.xpath(cancelButtonXPath));
            element.click();
            testStepLog("Cancel Button clicked");
        } catch (Exception e) {
            testStepErrorLog("Failed to click Cancel Button");
            DriverManager.quitDriver();
            Assert.fail(e.getMessage());
        }
    }

    public void fillSubmitAndVerifyNewAddressForm() {
        testStepStartLog("Filling New Address Form");
        String newFirstName = java.util.UUID.randomUUID().toString().replace("-", "").substring(0, 5);
        String newLastName = java.util.UUID.randomUUID().toString().replace("-", "").substring(0, 5);
        String newAddressOneName = "123 Street Ave";
        String newAddressTwoName = "APT 801";
        String newCity = "Salt Lake";
        String newState = "UT";
        String newZipCode = "84115";
        String newPhoneNumber = "(222) 222 - 2222";

        try {
            enterFirstName(newFirstName);
            enterLastName(newLastName);
            enterAddressOne(newAddressOneName);
            enterAddressTwo(newAddressTwoName);
            enterCity(newCity);
            enterState(newState);
            enterZipCode(newZipCode);
            enterPhoneNumber(newPhoneNumber);

            clickOnSaveAddressButton();
            verifyDefaultShippingAddress(newFirstName, newLastName, newAddressOneName, newAddressTwoName, newCity, newState, newZipCode, newPhoneNumber);
            testStepLog("New Address Form entered successfully");
        } catch (Exception e) {
            testStepErrorLog("Failed to Fill New Address Form");
            DriverManager.quitDriver();
            Assert.fail(e.getMessage());
        }
    }

    public void verifyDefaultShippingAddress(String firstName, String lastName, String addressOne, String addressTwo, String city, String state, String zipCode, String phoneNumber) {
        testStepStartLog("Verifying Default Shipping Address");
        try {
            waitForElementToBeVisible("//div[@data-testid='address-list-default']//div[@data-testid='addresslist-row-0']");
            WebElement nameDefaultShipping = DriverManager.getDriver().findElement(By.xpath("//div[@data-testid='address-list-default']//div[@data-testid='addresslist-row-0']"));
            String curText = nameDefaultShipping.getText();
            if(!Objects.equals(curText, firstName + " " + lastName)) {
                testStepErrorLog("Name Text Value did not match entered data");
                DriverManager.quitDriver();
                Assert.fail();
            }

            WebElement addressOneDefaultShipping = DriverManager.getDriver().findElement(By.xpath("//div[@data-testid='address-list-default']//div[@data-testid='addresslist-row-1']"));
            curText = addressOneDefaultShipping.getText();
            if(!Objects.equals(curText, addressOne)) {
                testStepErrorLog("AddressOne Text Value did not match entered data");
                DriverManager.quitDriver();
                Assert.fail();
            }

            WebElement addressTwoDefaultShipping = DriverManager.getDriver().findElement(By.xpath("//div[@data-testid='address-list-default']//div[@data-testid='addresslist-row-2']"));
            curText =  addressTwoDefaultShipping.getText();
            if(!Objects.equals(curText, addressTwo)) {
                testStepErrorLog("AddressTwo Text Value did not match entered data");
                DriverManager.quitDriver();
                Assert.fail();
            }

            WebElement cityStateZipDefaultShipping = DriverManager.getDriver().findElement(By.xpath("//div[@data-testid='address-list-default']//div[@data-testid='addresslist-row-3']"));
            curText = cityStateZipDefaultShipping.getText();
            if(!Objects.equals(curText, city + " " + state + " " + zipCode)) {
                testStepErrorLog("CityStateZip Text Value did not match entered data");
                DriverManager.quitDriver();
                Assert.fail();
            }

            WebElement phoneNumberDefaultShipping = DriverManager.getDriver().findElement(By.xpath("//div[@data-testid='addresslist-item-phone']"));
            curText = phoneNumberDefaultShipping.getText();
            if(!Objects.equals(curText, phoneNumber)) {
                testStepErrorLog("PhoneNumber Text Value did not match entered data");
                DriverManager.quitDriver();
                Assert.fail();
            }
        } catch (Exception e) {
             testStepErrorLog("Default Shipping address not found or has inconsistencies");
             DriverManager.quitDriver();
            Assert.fail(e.getMessage());
        }
    }

    public void clickUseMyShippingAddress() {
        testStepStartLog("Clicking on 'Use My Shipping Address'");
        try {
            WebElement btn = DriverManager.getDriver().findElement(By.xpath(useMyShippingAddressButtonXPath));
            btn.click();
            testStepLog("'Use My Shipping Address' button clicked");
        } catch (Exception e) {
            testStepErrorLog("Failed to click 'User my Shipping Address' button");
            DriverManager.quitDriver();
            Assert.fail(e.getMessage());
        }
    }

    public void verifyMailingAddressMatchesShippingAddress() {
        testStepStartLog("Verifying Mailing and Shipping Addresses Match");
        try {
            waitForElementToBeVisible("//div[@data-testid='address-list-default']//div[@data-testid='addresslist-row-0']");
            String nameDefaultShipping = DriverManager.getDriver().findElement(By.xpath("//div[@data-testid='address-list-default']//div[@data-testid='addresslist-row-0']")).getText();
            String nameDefaultMailing = DriverManager.getDriver().findElement(By.xpath("//div[@data-testid='mailing-address']//div[@data-testid='addresslist-row-0']")).getText();
            if(!Objects.equals(nameDefaultShipping, nameDefaultMailing)) {
                testStepErrorLog("First and Last Names Match");
                DriverManager.quitDriver();
                Assert.fail();
            }

            String addressOneDefaultShipping = DriverManager.getDriver().findElement(By.xpath("//div[@data-testid='address-list-default']//div[@data-testid='addresslist-row-1']")).getText();
            String addressOneDefaultMailing = DriverManager.getDriver().findElement(By.xpath("//div[@data-testid='mailing-address']//div[@data-testid='addresslist-row-1']")).getText();
            if(!Objects.equals(addressOneDefaultShipping, addressOneDefaultMailing)) {
                testStepErrorLog("AddressOne Text Value did not match entered data");
                DriverManager.quitDriver();
                Assert.fail();
            }

            String addressTwoDefaultShipping = DriverManager.getDriver().findElement(By.xpath("//div[@data-testid='address-list-default']//div[@data-testid='addresslist-row-2']")).getText();
            String addressTwoDefaultMailing = DriverManager.getDriver().findElement(By.xpath("//div[@data-testid='mailing-address']//div[@data-testid='addresslist-row-2']")).getText();
            if(!Objects.equals(addressTwoDefaultShipping, addressTwoDefaultMailing)) {
                testStepErrorLog("AddressTwo Text Value did not match entered data");
                DriverManager.quitDriver();
                Assert.fail();
            }
            String cityStateZipDefaultShipping = DriverManager.getDriver().findElement(By.xpath("//div[@data-testid='address-list-default']//div[@data-testid='addresslist-row-3']")).getText();
            String cityStateZipDefaultMailing = DriverManager.getDriver().findElement(By.xpath("//div[@data-testid='mailing-address']//div[@data-testid='addresslist-row-3']")).getText();
            if(!Objects.equals(cityStateZipDefaultShipping, cityStateZipDefaultMailing)) {
                testStepErrorLog("CityStateZip Text Value did not match entered data");
                DriverManager.quitDriver();
                Assert.fail();
            }
            String phoneNumberDefaultShipping = DriverManager.getDriver().findElement(By.xpath("//div[@data-testid='addresslist-item-phone']")).getText();
            String phoneNumberDefaultMailing = DriverManager.getDriver().findElement(By.xpath("//div[@data-testid='mailing-address']//div[@data-testid='addresslist-item-phone']")).getText();
            if(!Objects.equals(phoneNumberDefaultShipping, phoneNumberDefaultMailing)) {
                testStepErrorLog("PhoneNumber Text Value did not match entered data");
                DriverManager.quitDriver();
                Assert.fail();
            }
            testStepLog("Both Addresses Match");
        } catch (Exception e) {
            testStepErrorLog("Addresses did not match");
            DriverManager.quitDriver();
            Assert.fail(e.getMessage());
        }
    }

    public void editAddressSaveAndVerify() throws InterruptedException {
        testStepStartLog("Editing Address, Saving, and Verifying Page Persistence");
        try {
            String curShippingFirstName = getElementText("//div[@data-testid='address-list-default']//div[@data-testid='addresslist-row-0']").split(" ")[0];
            String curShippingLastName = getElementText("//div[@data-testid='address-list-default']//div[@data-testid='addresslist-row-0']").split(" ")[1];
            String curShippingAddressOne = getElementText("//div[@data-testid='address-list-default']//div[@data-testid='addresslist-row-1']");
            String curShippingAddressTwo = getElementText("//div[@data-testid='address-list-default']//div[@data-testid='addresslist-row-2']");
            String curShippingCityStateZip = getElementText("//div[@data-testid='address-list-default']//div[@data-testid='addresslist-row-3']");
            String curShippingPhoneNumber = getElementText("//div[@data-testid='addresslist-item-phone']");

            clickEditUnderShippingAddress();

            String newFirstName = java.util.UUID.randomUUID().toString().replace("-", "").substring(0, 5);
            String newLastName = java.util.UUID.randomUUID().toString().replace("-", "").substring(0, 5);

            clearShippingAddressForm();

            enterFirstName(newFirstName);
            enterLastName(newLastName);
            enterAddressOne("567 South Street");
            enterAddressTwo("Apt 123");
            enterCity("Oak Ridge");
            enterState("TN");
            enterZipCode("37830");
            enterPhoneNumber("(222) 222 - 2222");

            clickOnSaveAddressButton();

            verifyDefaultShippingAddress(newFirstName, newLastName, "567 South Street", "Apt 123", "Oak Ridge", "TN", "37830", "(222) 222 - 2222");

            clickOnAccountSettingsTab();
            clickOnAddressesTab();

            verifyDefaultShippingAddress(newFirstName, newLastName, "567 South Street", "Apt 123", "Oak Ridge", "TN", "37830", "(222) 222 - 2222");

            clickEditUnderShippingAddress();
            clearShippingAddressForm();
            fillShippingAddressForm(curShippingFirstName, curShippingLastName, curShippingAddressOne, curShippingAddressTwo, curShippingCityStateZip.split(" ")[0] + " " + curShippingCityStateZip.split(" ")[1] + " " + curShippingCityStateZip.split(" ")[2], curShippingCityStateZip.split(" ")[3], curShippingCityStateZip.split(" ")[4], curShippingPhoneNumber);
            clickOnSaveAddressButton();
            verifyDefaultShippingAddress(curShippingFirstName, curShippingLastName, curShippingAddressOne, curShippingAddressTwo, curShippingCityStateZip.split(" ")[0] + " " + curShippingCityStateZip.split(" ")[1] + " " + curShippingCityStateZip.split(" ")[2], curShippingCityStateZip.split(" ")[3], curShippingCityStateZip.split(" ")[4], curShippingPhoneNumber);
            testStepLog("Edit Address, save, and verify successfully completed. ");
        } catch (Exception e) {
            testStepErrorLog("EditAddress Failed");
            DriverManager.quitDriver();
            Assert.fail();
        }
    }

    public void clearShippingAddressForm() throws InterruptedException {
        testStepStartLog("Clearing Shipping Address Form");
        try {
            Thread.sleep(5000);

            doubleClick(firstNameXPath);
            clearElementText(firstNameXPath);

            doubleClick(lastNameXPath);
            clearElementText(lastNameXPath);

            doubleClick(addressOneXPath);
            clearElementText(addressOneXPath);

            click(firstNameXPath);
            doubleClick(addressTwoXPath);
            clearElementText(addressTwoXPath);

            doubleClick(cityXPath);
            clearElementText(cityXPath);
            doubleClick(stateXPath);
            clearElementText(stateXPath);
            doubleClick(zipCodeXPath);
            clearElementText(zipCodeXPath);

            doubleClick(phoneNumberXPath);
            clearElementText(phoneNumberXPath);
            testStepLog("Shipping Address Form Cleared");
        } catch (Exception e) {
            testStepErrorLog("Failed to clear Shipping Address Form");
            DriverManager.quitDriver();
            Assert.fail();
        }

    }

    public void fillShippingAddressForm(String firstName, String lastName, String addressOne, String addressTwo, String city, String state, String zipCode, String phoneNumber) {
        testStepStartLog("Filling Shipping Address Form");
        try {
            enterFirstName(firstName);
            enterLastName(lastName);
            enterAddressOne(addressOne);
            enterAddressTwo(addressTwo);
            enterCity(city);
            enterState(state);
            enterZipCode(zipCode);
            enterPhoneNumber(phoneNumber);
            testStepLog("Shipping Address Form Successfully Filled");
        }  catch (Exception e) {
            testStepErrorLog("Failed to fill Shipping Address Form");
            DriverManager.quitDriver();
            Assert.fail();
        }
    }

    // Account Settings Page

    public void clickOnAccountSettingsTab() {
        testStepStartLog("Clicking on Account Settings Tab");
        try {
            WebElement element = DriverManager.getDriver().findElement(By.xpath(navigationAccountSettingsXPath));
            element.click();
            waitForElementToBeVisible("//div[@data-testid='account-card-contact']");
            testStepLog("Account Settings Tab clicked");
        } catch (Exception e) {
            testStepErrorLog("Failed to click Account Settings Tab");
            DriverManager.quitDriver();
            Assert.fail(e.getMessage());
        }
    }

    public void clickEditUnderContact() {
        testStepStartLog("Clicking on Edit Under Contact Section");
        try {
            WebElement element = DriverManager.getDriver().findElement(By.xpath(contactSectionEditButtonXPath));
            element.click();
            testStepLog("Edit Contact Button Clicked");
        } catch (Exception e) {
            testStepErrorLog("Failed to click Edit Under Contact Section");
            DriverManager.quitDriver();
            Assert.fail(e.getMessage());
        }
    }

    public void fillContactFormAndSave() {
        testStepStartLog("Filling Contact Form");
        try {
            enterContact_PhoneNumber("(222) 222 - 2222");
            enterContact_MethodOfContact("Text Message");
            enterContact_BirthDate("");

            clickOnSaveChangesButton();
            testStepLog("Contact Form Filled Successfully");
        } catch (Exception e) {
            testStepErrorLog("Failed to Fill Contact Form");
            DriverManager.quitDriver();
            Assert.fail(e.getMessage());
        }
    }

    public void enterContact_FirstName(String firstName) {
        testStepStartLog("Entering Contact First Name: " + firstName);
        try {
            waitForElementToBeVisible(contactFirstNameXPath);
            doubleClick(contactFirstNameXPath);
            clearElementText(contactFirstNameXPath);
            enterText(firstName, contactFirstNameXPath);
            testStepLog("Contact First Name entered successfully");
        } catch (Exception e) {
            testStepErrorLog("Failed to enter Contact First Name");
            DriverManager.quitDriver();
            Assert.fail(e.getMessage());
        }
    }

    public void enterContact_LastName(String lastName) {
        testStepStartLog("Entering Contact Last Name: " + lastName);
        try {
            waitForElementToBeVisible(contactLastNameXPath);
            doubleClick(contactLastNameXPath);
            clearElementText(contactLastNameXPath);
            enterText(lastName, contactLastNameXPath);
            testStepLog("Contact Last Name entered successfully");
        } catch (Exception e) {
            testStepErrorLog("Failed to enter Contact Last Name");
            DriverManager.quitDriver();
            Assert.fail(e.getMessage());
        }
    }

    public void enterContact_Email(String email) {
        testStepStartLog("Entering Contact Email: " + email);
        try {
            waitForElementToBeVisible(contactEmailXPath);
            doubleClick(contactEmailXPath);
            clearElementText(contactEmailXPath);
            enterText(email, contactEmailXPath);
            testStepLog("Contact Email entered successfully");
        } catch (Exception e) {
            testStepErrorLog("Failed to enter Contact Email");
            DriverManager.quitDriver();
            Assert.fail(e.getMessage());
        }
    }

    public void enterContact_PhoneNumber(String phoneNumber) {
        testStepStartLog("Entering Contact Phone Number: " + phoneNumber);
        try {
            waitForElementToBeVisible(contactPhoneNumberInputXPath);
            doubleClick(contactPhoneNumberInputXPath);
            clearElementText(contactPhoneNumberInputXPath);
            enterText(phoneNumber, contactPhoneNumberInputXPath);
            testStepLog("Contact Phone Number entered successfully");
        } catch (Exception e) {
            testStepErrorLog("Failed to enter Contact Phone Number");
            DriverManager.quitDriver();
            Assert.fail(e.getMessage());
        }
    }

    public void enterContact_MethodOfContact(String methodOfContact) {
        testStepStartLog("Entering Method Of Contact: " + methodOfContact);
        try {
            waitForElementToBeVisible("//*[text()='Preferred Method of Contact']");
            doubleClick(contactMethodOfContactInputXPath);
            click("//*[@class='v-list-item__content']/div[text()='" + methodOfContact + "']");
            testStepLog("Method of Contact entered successfully");
        } catch (Exception e) {
            testStepErrorLog("Failed to enter Method of Contact");
            DriverManager.quitDriver();
            Assert.fail(e.getMessage());
        }

    }

    public void enterContact_BirthDate(String birthDate) {
        testStepStartLog("Entering BirthDate: " + birthDate);
        try {
            //for simplicity, ideally would be in a test data file.
            waitForElementToBeVisible("//*[text()='Birthdate']/following-sibling::input");
            click("//*[text()='Birthdate']/following-sibling::input");
            waitForElementToBeVisible("//li[text()='2005']");
            click("//li[text()='2005']");
            waitForElementToBeVisible("//div[text()='Feb']");
            click("//div[text()='Feb']");
            waitForElementToBeVisible("//div[text()='2']");
            click("//div[text()='2']");

            testStepLog("BirthDate entered successfully");
        } catch (Exception e) {
            testStepErrorLog("Failed to enter BirthDate");
            DriverManager.quitDriver();
            Assert.fail(e.getMessage());
        }
    }

    public void clickOnSaveChangesButton() {
        testStepStartLog("Clicking on Save Changes Button");
        try {
            WebElement element = DriverManager.getDriver().findElement(By.xpath("//button[@data-testid='save-changes']"));
            element.click();
            testStepLog("Save Changes Button clicked");
        } catch (Exception e) {
            testStepErrorLog("Failed to click Save Changes Button");
            DriverManager.quitDriver();
            Assert.fail(e.getMessage());
        }
    }

    public void editContactFormSaveAndVerify() {
        testStepStartLog("Editing Contact Form, Saving, and Verifying Update Persistance");
        try {
            String curFirstName = getElementText("(//div[@data-testid='account-label-content'])[1]");
            String curLastName = getElementText("(//div[@data-testid='account-label-content'])[2]");
            String curEmail = getElementText("(//div[@data-testid='account-label-content'])[3]");
            String curPhoneNumber = getElementText("(//div[@data-testid='account-label-content'])[4]");
            String curMethodOfContact = getElementText("(//div[@data-testid='account-label-content'])[5]");

            clickEditUnderContact();

            String firstName = java.util.UUID.randomUUID().toString().replace("-", "").substring(0, 5);;
            String lastName = java.util.UUID.randomUUID().toString().replace("-", "").substring(0, 5);;
            String email = java.util.UUID.randomUUID().toString().replace("-", "").substring(0, 4) + "@g.co";;
            String phoneNumber = "(222) 222 - 2222";
            String methodOfContact = "Email";

            enterContact_FirstName(firstName);
            enterContact_LastName(lastName);
            enterContact_Email(email);
            enterContact_PhoneNumber(phoneNumber);
            enterContact_MethodOfContact(methodOfContact);
            clickOnSaveChangesButton();

            verifyContactDetails(firstName, lastName, email, phoneNumber, methodOfContact);

            clickOnAddressesTab();
            clickOnAccountSettingsTab();

            verifyContactDetails(firstName, lastName, email, phoneNumber, methodOfContact);

            clickEditUnderContact();

            enterContact_FirstName(curFirstName);
            enterContact_LastName(curLastName);
            enterContact_Email(curEmail);
            enterContact_PhoneNumber(curPhoneNumber);
            enterContact_MethodOfContact(curMethodOfContact);

            clickOnSaveChangesButton();

        } catch (Exception e) {
            testStepErrorLog("Failed to edit contact form and verify");
            DriverManager.quitDriver();
            Assert.fail(e.getMessage());
        }
    }

    public void verifyContactDetails(String firstName,  String lastName, String email, String phoneNumber, String methodOfContact) {
        testStepStartLog("Verifying Contact Details");
        try {
            Thread.sleep(5000);
            waitForElementToBeVisible("//div[@data-testid='account-card-contact']");
            if(!Objects.equals(getElementText("(//div[@data-testid='account-label-content'])[1]"), firstName)) {
                testStepErrorLog("First name does not match expected value");
                DriverManager.quitDriver();
                Assert.fail();
            }
            if(!Objects.equals(getElementText("(//div[@data-testid='account-label-content'])[2]"), lastName)) {
                testStepErrorLog("Last Name does not match expected value");
                DriverManager.quitDriver();
                Assert.fail();
            }
            if(!Objects.equals(getElementText("(//div[@data-testid='account-label-content'])[3]"), email)) {
                testStepErrorLog("Email does not match expected value");
                DriverManager.quitDriver();
                Assert.fail();
            }
            if(!Objects.equals(getElementText("(//div[@data-testid='account-label-content'])[4]"), phoneNumber)) {
                testStepErrorLog("Phone Number does not match expected value");
                DriverManager.quitDriver();
                Assert.fail();
            }
            if(!Objects.equals(getElementText("(//div[@data-testid='account-label-content'])[5]"), methodOfContact)) {
                testStepErrorLog("Method of Contact does not match expected value");
                DriverManager.quitDriver();
                Assert.fail();
            }
            testStepLog("Verified Contact Details Successfully");
        }  catch (Exception e) {
            testStepErrorLog("Failed to verify contact details");
            DriverManager.quitDriver();
            Assert.fail(e.getMessage());
        }

    }
}
