package com.automation.steps;

import com.automation.pages.HomePage;
import com.automation.pages.LoginPage;
import com.automation.utils.ConfigReader;
import com.automation.utils.DriverManager;
import io.cucumber.java.After;
import io.cucumber.java.Before;


import java.io.IOException;

public class Hooks {

    @Before
    public void setup() throws IOException {
        ConfigReader.init();
        DriverManager.createDriver();
    }

    @After
    public void clean(){
        DriverManager.getDriver().quit();
    }
}
