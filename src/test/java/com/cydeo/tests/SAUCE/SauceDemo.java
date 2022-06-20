package com.cydeo.tests.SAUCE;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class SauceDemo {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://saucedemo.com");
        driver.manage().window().maximize();
        String title=driver.getTitle();
        System.out.println("title = " + title);
        WebElement usernameBox=driver.findElement(By.id("user-name"));
        usernameBox.sendKeys("standard_user");
        WebElement passwordBox=driver.findElement(By.id("password"));
        passwordBox.sendKeys("secret_sauce");
        WebElement loginBtn=driver.findElement(By.id("login-button"));
        loginBtn.submit();
        WebElement firstProductLink=driver.findElement(By.linkText("Sauce Labs Backpack"));
        System.out.println("firstProductLink.getAttribute(\"id\") = "
                + firstProductLink.getAttribute("id"));
        WebElement firstProductlnk1=driver.findElement(By.className("inventory_item_name"));
        System.out.println("firstProductlnk1.getText() = " + firstProductlnk1.getText());
        WebElement firstProductlnk2=driver.findElement(By.id("item_4_title_link"));
        System.out.println("firstProductlnk2.getText() = " + firstProductlnk2.getText());
        List<WebElement> allProductTitle=driver.findElements(By.className("inventory_item_name"));
        System.out.println("allProductTitle.size() = " + allProductTitle.size());
        for (WebElement each:allProductTitle) {
            String producttitle=each.getText();
            System.out.println("title = " + producttitle);
        }


        driver.quit();
    }
}
