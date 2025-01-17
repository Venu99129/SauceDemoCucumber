package com.automation.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class DriverManager {

    static WebDriver driver;

    public static void createDriver(){
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        driver.manage().window().maximize();
    }

    public static void createEdgeDriver(){
        driver = new EdgeDriver();
    }

    public static WebDriver getDriver(){
        return driver;
    }
}
