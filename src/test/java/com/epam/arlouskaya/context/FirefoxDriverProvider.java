package com.epam.arlouskaya.context;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by Katsiaryna_Arlouskay on 10/26/2015.
 */
public class FirefoxDriverProvider {
    private final static FirefoxDriverProvider firefoxDriverProvider = new FirefoxDriverProvider();
    private static WebDriver firefoxDriver;

    private FirefoxDriverProvider(){
        firefoxDriver = new FirefoxDriver();
        firefoxDriver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        firefoxDriver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    }

    public static WebDriver getDriver(){
        return firefoxDriver;
    }


}
