package com.cydeo.tests.day9_javafaker_testbas_driver;

import com.github.javafaker.Faker;
import org.testng.annotations.Test;

public class JavaFakerPractice {
    @Test
    public void test1() {
        Faker faker=new Faker();
        System.out.println("faker.name().firstName() = "+ faker.name().firstName());
        System.out.println("faker.name().lastName() = "+ faker.name().lastName());

        System.out.println("faker.name().fullName() = " + faker.name().fullName());
    }
}
