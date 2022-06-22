package com.cydeo.tests.day11_actions_jsexecutor_practice;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class t7_Scroll_Jsexecuter {
    @Test
    public void task7_scroll_test(){
        Driver.getDriver().get("https://practice.cydeo.com/large");
        WebElement cydeoLink=Driver.getDriver().findElement(By.linkText("CYDEO"));
        WebElement homeLink=Driver.getDriver().findElement(By.linkText("Home"));
        JavascriptExecutor js=(JavascriptExecutor) Driver.getDriver();
        BrowserUtils.sleep(2);
        js.executeScript("arguments[0].scrollIntoView(true)", cydeoLink);
        BrowserUtils.sleep(2);
        js.executeScript("arguments[0].scrollIntoView(true)",  homeLink);
    }
}
