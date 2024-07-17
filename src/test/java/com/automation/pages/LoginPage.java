package com.automation.pages;

import com.automation.utils.ConfigReader;
import com.automation.utils.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static com.automation.utils.DriverManager.*;

public class LoginPage extends BasePage {

    @FindBy(id ="user-name")
    WebElement usernameInput;

    @FindBy(id="password")
    WebElement passwordInput;

    @FindBy(id="login-button")
    WebElement signInBtn;


    public void openUrl(){
        driver.get(ConfigReader.getConfigValue("base.url"));
    }

    public void doLogin(String userName , String password){

        usernameInput.sendKeys(userName);
        passwordInput.sendKeys(password);
        signInBtn.click();
    }

    public boolean loginPageIsDisplayed(){
        return usernameInput.isDisplayed()&&passwordInput.isDisplayed();
    }
}
