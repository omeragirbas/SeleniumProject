package com.cydeo.tests.day2_lcators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T1_CydeoVerification {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
         driver.manage().window().maximize();
         driver.navigate().to("https://practice.cydeo.com/");
         //verification
        String expectedUrl="cydeo";
        String actualUrl=driver.getCurrentUrl();
        if(actualUrl.contains(expectedUrl)){
            System.out.println("PASSED");
        }else{
            System.out.println("FAILED");
        }
//verify title
        String expectedTitle="Practice";
        String actualTitle=driver.getTitle();
        if(actualTitle.equals(expectedTitle)){
            System.out.println("`Passed");
        }else{
            System.out.println("failed");
        }
        driver.close();
    }
}
