package Pages;

import SeleniumSetup.DriverManager;
import SeleniumSetup.SeleniumActions;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.Objects;

public class MyAccountPage extends SeleniumActions {
    private String navigationAddressesXPath = "//span[text()='Addresses']";

    //AddressPage
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


    public void clickOnAddressesTab() {
        testStepStartLog("Clicking on Addresses Tab");
        try {
            WebElement addressesTab = DriverManager.getDriver().findElement(By.xpath(navigationAddressesXPath));
            addressesTab.click();
            testStepLog("Addresses Tab button clicked");
        } catch (Exception e) {
            testStepErrorLog("Failed to click Addresses Tab");
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

    public void clickOnDefaultShipping() {
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

    public void clickOnDefaultMailing() {
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
        String newFirstName = "a";
        String newLastName = "a";
        String newAddressOneName = "123 Street Ave";
        String newAddressTwoName = "APT 801";
        String newCity = "Salt Lake";
        String newState = "UT";
        String newZipCode = "84115";
        String newPhoneNumber = "(222) 222 - 2222";

        try {
            enterFirstName(newFirstName);
            enterLastName(newLastName);
            enterCity(newCity);
            enterState(newState);
            enterZipCode(newZipCode);
            enterPhoneNumber(newPhoneNumber);
            enterAddressOne(newAddressOneName);
            enterAddressTwo(newAddressTwoName);

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
}
