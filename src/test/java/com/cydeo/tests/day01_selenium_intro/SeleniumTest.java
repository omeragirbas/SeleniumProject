package com.cydeo.tests.day01_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {
    public static void main(String[] args) throws InterruptedException {
        //1 setup web driver manager
        WebDriverManager.chromedriver().setup();
        //2-Create instance of the chrome driver
        WebDriver driver=new ChromeDriver();
        //3-Test if driver is workig as expected
        driver.get("https://www.tesla.com");
        String currentTitle=driver.getTitle();
        System.out.println("currentTitle="+ currentTitle);
        Thread.sleep(3000);

        driver.navigate().back();
        Thread.sleep(3000);
        driver.navigate().forward();
        driver.navigate().refresh();
        driver.navigate().to("https://www.google.com");
        currentTitle=driver.getTitle();
        //System.out.println("driver.getTitle()"+ driver.getTitle());
        System.out.println("currentTitle="+ currentTitle);
        String currentUrl=driver.getCurrentUrl();
        System.out.println("url"+currentUrl);
    }
}
