package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage {

    private String usernameField = "username";
    private String passwordField = "password";
    private String submitButton = "loginBtn";
    private String signInButton = "(\"nav-link-accountList\")";
    private String continueButton = "continue";

    public LoginPage() {
        super();
    }

    public void gotoLoginPage() {
        gotoAmazon();
        clickElementById(signInButton);
    }

    public void enterUsername(String username) {
        sendKeysToElementById(usernameField, username);
    }

    public void gotoPasswordPage(){
        clickElementById(continueButton);
    }

    public void enterPassword(String password) {
        sendKeysToElementById(passwordField, password);
    }

    public void submitLogin() {
        clickElementById(submitButton);
    }

    public void login(String username, String password) {
        enterUsername(username);
        enterPassword(password);
        submitLogin();
    }

    public boolean isLoginSuccessful(){

        WebElement deliverToElement = driver.findElement(By.id("nav-packaging-selection"));

        if(deliverToElement.isDisplayed()) {
            return true;
        } else {
            return false;
        }
    }
}