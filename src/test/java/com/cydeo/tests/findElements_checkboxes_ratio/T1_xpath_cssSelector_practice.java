package com.cydeo.tests.findElements_checkboxes_ratio;

import com.cydeo.tests.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T1_xpath_cssSelector_practice {
    public static void main(String[] args) {
        WebDriver driver= WebDriverFactory.getdDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://practice.cydeo.com/forgot_password");
        WebElement homelink_exp1=driver.findElement(By.cssSelector("a[class='nav-link']"));
        WebElement homelink_exp2=driver.findElement(By.cssSelector("a.nav-link"));
        WebElement homelink_exp3=driver.findElement(By.cssSelector("a[href='/']"));




    }
}
