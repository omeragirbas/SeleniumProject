package com.cydeo.tests.n11task;


import com.cydeo.tests.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class n11testt {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.n11.com/");
        String currentTitle= driver.getTitle();
        System.out.println("currentTitle = " + currentTitle);
        String expectedTitle="n11.com - Hayat Sana Gelir";
        if(expectedTitle.equals(currentTitle)){
            System.out.println("n11 home page is open");
        }else{
            System.out.println("not passed");
        }
        WebElement girisyap=driver.findElement(By.xpath("//a[@class='btnSignIn']"));
        girisyap.click();
        WebElement facebook=driver.findElement(By.xpath("//div[@class='facebook_large medium facebookBtn  btnLogin']"));
        facebook.click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        WebElement agreeButton = driver.findElement(By.xpath("//button[@value='1']"));
        agreeButton.click();



    }
}
