package com.cbt.utilities;

import org.openqa.selenium.WebDriver;
import java.util.Arrays;
import java.util.List;

public class TitleVerification3 {

    public static void main(String[] args) throws Exception{

        List<String> urls = Arrays.asList("https://luluandgeorgia.com","https://wayfair.com/",
                                          "https://walmart.com", "https://westelm.com/");

        for (String url: urls){
            WebDriver driver= BrowserFactory.getDriver("chrome");
            driver.get(url);
            Thread.sleep(2);
            if(url.contains(driver.getTitle().replace(" ","").toLowerCase())){
                System.out.println("TEST PASSED!");
            }else{
                System.out.println("TEST FAILED!");
            }
            Thread.sleep(2);
            driver.quit();
        }



    }
}
