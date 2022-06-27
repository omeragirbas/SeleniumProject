package com.cydeo.tests.n11task;


import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.Set;
import java.util.concurrent.TimeUnit;

public class n11testt {
    @Test
            public void n11test(){
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
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        String firstwindowHandle= driver.getWindowHandle(); //bulundugun ana ekranin stringi
        Set<String> windowHandles = driver.getWindowHandles(); // 2 penceriyi bilgi olarak icine saklar
        for (String windowHandle : windowHandles) {
            driver.switchTo().window(windowHandle);

        }
        WebElement accept=driver.findElement(By.xpath("//button[@value='1']"));
        accept.click();





        //driver.switchTo().window(firstwindowHandle);
    }
}
