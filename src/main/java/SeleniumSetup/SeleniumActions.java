package SeleniumSetup;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class SeleniumActions{

    public static void initDriver() {
        DriverManager.getDriver().manage().window().maximize();
        DriverManager.getDriver().get("https://www.stampinup.com");
    }

    public static void enterText(String text, String xpath) {
        WebElement element = DriverManager.getDriver().findElement(By.xpath(xpath));
        element.sendKeys(text);
    }

    public static void click(String xpath) {
        DriverManager.getDriver().findElement(By.xpath(xpath)).click();
    }

    public static void doubleClick(String xpath) {
        DriverManager.getDriver().findElement(By.xpath(xpath)).click();
        DriverManager.getDriver().findElement(By.xpath(xpath)).click();
    }

    public static void waitForElementToBeVisible(String xpath) {
        WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(10));
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
    }

    public static void waitForElementToBeEditable(String xpath) throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(10));
        Boolean element = wait.until(ExpectedConditions.elementToBeSelected(By.xpath(xpath)));
    }

    public static void testStepStartLog(String message) {
        System.out.println("STEP X: " + message);
    }

    public static void testStepLog(String message) {
        System.out.println("\t\t\t\t"+ message);
    }

    public static void testStepErrorLog(String message) {
        System.out.println("!!!!  ERROR: " + message);
    }

    public static void setElementValue(String xpath, String value) {
        WebElement element = DriverManager.getDriver().findElement(By.xpath(xpath));
        element.sendKeys("value", value);
    }

    public static String getElementText(String xpath) {
        return DriverManager.getDriver().findElement(By.xpath(xpath)).getText();
    }

    public static void clearElementText(String xpath) {
        WebElement element = DriverManager.getDriver().findElement(By.xpath(xpath));
        while(!element.getAttribute("value").isEmpty()){
            element.sendKeys(Keys.BACK_SPACE);
        }
        element.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
    }
}