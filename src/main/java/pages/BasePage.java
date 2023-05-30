package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BasePage {

    protected WebDriver driver;

    public BasePage() {
        driver = BrowserDriver.getDriver();
    }

    public void gotoAmazon() {
        driver.get("https://www.amazon.co.uk/");
    }

    public void clickElementById(String id) {
        driver.findElement(By.id(id)).click();
    }

    public void sendKeysToElementById(String id, String text) {
        driver.findElement(By.id(id)).sendKeys(text);
    }

}