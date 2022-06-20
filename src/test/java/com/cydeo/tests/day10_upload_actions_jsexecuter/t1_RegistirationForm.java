package com.cydeo.tests.day10_upload_actions_jsexecuter;

import com.cydeo.tests.utilities.ConfigurationReader;
import com.cydeo.tests.utilities.Driver;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class t1_RegistirationForm {
    @Test
    public void registiration_form_test(){
        //1. Open browser
        //2. Go to website: https://practice.cydeo.com/registration_form
        //Driver.getDriver() --> driver  ****
        Driver.getDriver().get(ConfigurationReader.getProperty("registration.form.url"));
        //JAVA FAKER
        Faker faker=new Faker();

        //3. Enter first name
        WebElement inputFirstName=Driver.getDriver().findElement(By.xpath("//input[@name='firstname']"));
        inputFirstName.sendKeys(faker.name().firstName());
        //4. Enter last name
        WebElement inputLastName=Driver.getDriver().findElement(By.xpath("//input[@name='lastname']"));
        inputLastName.sendKeys(faker.name().lastName());
        //5. Enter username
        WebElement InputUserName=Driver.getDriver().findElement(By.xpath("//input[@name='username']"));
       // InputUserName.sendKeys(faker.name().username().replaceAll(".",""));
        String user=faker.bothify("helpdesk###");
        InputUserName.sendKeys(user);
        //6. Enter email address
        WebElement inputEmail=Driver.getDriver().findElement(By.xpath("//input[@name='email']"));
        inputEmail.sendKeys(user+"@email.com");

        //7. Enter password
        //8. Enter phone number
        //9. Select a gender from radio buttons
        //10.Enter date of birth
        //11.Select Department/Office
        //12.Select Job Title
        //13.Select programming language from checkboxes
        //14.Click to sign up button
        //15.Verify success message “You’ve successfully completed registration.” is
        //displayed.
    }
}