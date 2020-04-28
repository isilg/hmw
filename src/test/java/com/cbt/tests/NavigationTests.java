package com.cbt.tests;

import com.cbt.utilities.BrowserFactory;
import com.cbt.utilities.StringUtility;
import org.openqa.selenium.WebDriver;

public class NavigationTests {

    public static void main(String[] args)throws Exception {

        chromeTest();
        firefoxTest();
        edgeTest();

    }


    public static void chromeTest() throws Exception {
        WebDriver driver = BrowserFactory.getDriver("chrome");
        driver.get("https://google.com");
        String actualTitleGoogle = driver.getTitle();
        Thread.sleep(2000);

        driver.navigate().to("https://etsy.com");
        String actualTitleEtsy = driver.getTitle();
        Thread.sleep(2000);

        driver.navigate().back();
        String afterNavigateGoogleTitle = driver.getTitle();
        StringUtility.verifyEquals(actualTitleGoogle, afterNavigateGoogleTitle);
        Thread.sleep(2000);

        driver.navigate().forward();
        String afterNavigateEtsyTitle = driver.getTitle();
        StringUtility.verifyEquals(actualTitleEtsy, afterNavigateEtsyTitle);
        Thread.sleep(2000);


        driver.quit();

    }

    public static void firefoxTest() throws Exception {
        WebDriver driver = BrowserFactory.getDriver("firefox");
        driver.get("https://google.com");
        String actualTitleGoogle = driver.getTitle();
        Thread.sleep(2000);

        driver.navigate().to("https://etsy.com");
        String actualTitleEtsy = driver.getTitle();
        Thread.sleep(2000);

        driver.navigate().back();
        String afterNavigateGoogleTitle = driver.getTitle();
        StringUtility.verifyEquals(actualTitleGoogle, afterNavigateGoogleTitle);
        Thread.sleep(2000);

        driver.navigate().forward();
        String afterNavigateEtsyTitle = driver.getTitle();
        StringUtility.verifyEquals(actualTitleEtsy, afterNavigateEtsyTitle);
        Thread.sleep(2000);

        driver.quit();

    }

    public static void edgeTest() throws Exception {
        WebDriver driver = BrowserFactory.getDriver("edge");
        driver.get("https://google.com");
        String actualTitleGoogle = driver.getTitle();
        Thread.sleep(2000);

        driver.navigate().to("https://etsy.com");
        String actualTitleEtsy = driver.getTitle();
        Thread.sleep(2000);

        driver.navigate().back();
        String afterNavigateGoogleTitle = driver.getTitle();
        StringUtility.verifyEquals(actualTitleGoogle, afterNavigateGoogleTitle);
        Thread.sleep(2000);

        driver.navigate().forward();
        String afterNavigateEtsyTitle = driver.getTitle();
        StringUtility.verifyEquals(actualTitleEtsy, afterNavigateEtsyTitle);
        Thread.sleep(2000);

        driver.quit();

    }
}
