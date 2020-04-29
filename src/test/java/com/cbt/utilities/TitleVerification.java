package com.cbt.utilities;
import org.openqa.selenium.WebDriver;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class TitleVerification {

    public static void main(String[] args) throws Exception {

        List<String> urls = Arrays.asList("http://practice.cybertekschool.com",
                                          "http://practice.cybertekschool.com/dropdown",
                                          "http://practice.cybertekschool.com/login");

        WebDriver driver = BrowserFactory.getDriver("chrome");

        List<String> sameTitleList= new ArrayList<>();

        Thread.sleep(3000);
        for (String url : urls)
        {
            driver.get(url);
            sameTitleList.add(driver.getTitle());
        }

        for (int i = 0; i <sameTitleList.size()-1 ; i++) {
            StringUtility.verifyEquals(sameTitleList.get(i),sameTitleList.get(i+1)); //i=2 -> i <titleList.size() -> titleList.get(3) out of range
        }

        List<Boolean> urlList= new ArrayList<>();
        Thread.sleep(3000);

        for (String url: urls) {

            urlList.add(url.startsWith("http://practice.cybertekschool.com"));
        }


        driver.quit();
    }

 }
