package com.automation.steps;
import com.automation.pages.LoginPage;
import com.automation.utils.ConfigReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginSteps {

    LoginPage loginPage = new LoginPage();

    @Given("USER OPENS THE WEBSITE")
    public void user_opens_the_website() {
        loginPage.openUrl();
    }

    @Then("verify user is on on login page")
    public void verify_user_is_on_on_login_page() {
        Assert.assertTrue(loginPage.loginPageIsDisplayed());
    }

    @When("user enters username {string} and password {string}")
    public void user_enters_username_and_password(String string, String string2) {
        loginPage.doLogin(ConfigReader.getConfigValue(string),ConfigReader.getConfigValue(string2));
    }
}
