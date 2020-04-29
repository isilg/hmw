package com.cbt.tests;
import com.cbt.utilities.BrowserFactory;
import com.cbt.utilities.StringUtility;
import org.openqa.selenium.WebDriver;

public class NavigationTests {

    public static void main(String[] args)throws Exception {

        safariTest();
//        chromeTest();
//        firefoxTest();
//        edgeTest();

    }

    public static void  safariTest() throws Exception{
        WebDriver driver = BrowserFactory.getDriver("safari");
        driver.get("https://google.com");
    }

    public static void chromeTest() throws Exception {
        WebDriver driver = BrowserFactory.getDriver("chrome");
        driver.get("https://google.com");
        String titleG = driver.getTitle();
        Thread.sleep(2000);

        driver.navigate().to("https://etsy.com");
        String titleE = driver.getTitle();
        Thread.sleep(2000);

        driver.navigate().back();
        String afterNavigateGoogleTitle = driver.getTitle();
        StringUtility.verifyEquals(titleG, afterNavigateGoogleTitle);
        Thread.sleep(2000);

        driver.navigate().forward();
        String afterNavigateEtsyTitle = driver.getTitle();
        StringUtility.verifyEquals(titleE, afterNavigateEtsyTitle);
        Thread.sleep(2000);


        driver.quit();

    }

    public static void firefoxTest() throws Exception {
        WebDriver driver = BrowserFactory.getDriver("firefox");
        driver.get("https://google.com");
        String titleG = driver.getTitle();
        Thread.sleep(2000);

        driver.navigate().to("https://etsy.com");
        String titleE = driver.getTitle();
        Thread.sleep(2000);

        driver.navigate().back();
        String afterNavigateGoogleTitle = driver.getTitle();
        StringUtility.verifyEquals(titleG, afterNavigateGoogleTitle);
        Thread.sleep(2000);

        driver.navigate().forward();
        String afterNavigateEtsyTitle = driver.getTitle();
        StringUtility.verifyEquals(titleE, afterNavigateEtsyTitle);
        Thread.sleep(2000);

        driver.quit();

    }

    public static void edgeTest() throws Exception {
        WebDriver driver = BrowserFactory.getDriver("edge");
        driver.get("https://google.com");
        String titleG = driver.getTitle();
        Thread.sleep(2000);

        driver.navigate().to("https://etsy.com");
        String titleE = driver.getTitle();
        Thread.sleep(2000);

        driver.navigate().back();
        String afterNavigateGoogleTitle = driver.getTitle();
        StringUtility.verifyEquals(titleG, afterNavigateGoogleTitle);
        Thread.sleep(2000);

        driver.navigate().forward();
        String afterNavigateEtsyTitle = driver.getTitle();
        StringUtility.verifyEquals(titleE, afterNavigateEtsyTitle);
        Thread.sleep(2000);

        driver.quit();

    }
}
