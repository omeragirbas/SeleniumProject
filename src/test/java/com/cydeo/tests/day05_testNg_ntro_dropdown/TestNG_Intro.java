package com.cydeo.tests.day05_testNg_ntro_dropdown;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG_Intro {
    @BeforeMethod
    public void setUpMethod(){
        System.out.println("before method is running");
    }
        @AfterMethod
        public void tearDown(){
            System.out.println("aftermethod is running");
        }


    @Test(priority = 2)
    public void test1(){
        System.out.println("Test1 is running");

    }
    @Test (priority = 1)
    public void test2(){
        System.out.println("Test 2 is running...");
    }

}
