package com.abir.ex16_Selenium_Exceptions;

import com.abir.utils.CommonToAll;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Lab44_Selenium_Exceptions extends CommonToAll {

    @Test
    public void test_selenium_exceptions() {

        WebDriver driver = new ChromeDriver();
        driver.get("https://app.vwo.com/");

        driver.findElement(By.id("abir"));

//        org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {"method":"css selector","selector":"#abir"}
//        (Session info: chrome=140.0.7339.80)

    }
}
