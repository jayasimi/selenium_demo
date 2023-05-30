package step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import pages.LoginPage;

public class LoginSteps {
    LoginPage loginPage = new LoginPage();

    @Given("I am on the Amazon Login page")
    public void i_am_on_the_amazon_login_page()  {
        loginPage.gotoLoginPage();
    }

//    @When("I enter {string}")
//    public void enter_username(String username) {
//        loginPage.enterUsername(username);
//    }
//    @When("I enter {string}")
//    public void enter_password(String password) {
//        loginPage.enterPassword(password);
//    }

    @When("I enter {string}")
    public void i_enter(String string) {
        loginPage.enterUsername(string);
        loginPage.enterPassword(string);
    }
    @When("I click on Login button")
    public void i_click_on_login_button() {
        loginPage.submitLogin();
    }
    @Then("I am on home page")
    public void i_am_on_home_page()  {
        loginPage.isLoginSuccessful();
    }

}
