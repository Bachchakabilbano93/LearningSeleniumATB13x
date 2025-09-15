package com.abir.ex16_Selenium_Exceptions;

import com.abir.utils.CommonToAll;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Lab45_Selenium_Exceptions_fix extends CommonToAll {

    @Test
    public void test_selenium_exceptions() {

        WebDriver driver = new ChromeDriver();
        driver.get("https://app.vwo.com/");

        try {
            driver.findElement(By.id("abir"));
        } catch (Exception e) {
            System.out.println("Element not found!!");
        }

//        org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {"method":"css selector","selector":"#abir"}
//        (Session info: chrome=140.0.7339.80)

    }
}
