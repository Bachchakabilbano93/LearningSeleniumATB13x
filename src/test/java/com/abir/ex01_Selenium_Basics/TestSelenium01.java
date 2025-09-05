package com.abir.ex01_Selenium_Basics;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSelenium01 {

    @Test
    public void test_Code(){
        Assert.assertEquals("abir","Abir");
    }

    @Test
    public void test_OpenTheTestingAcademy(){
        FirefoxDriver driver = new FirefoxDriver();
        driver.get("https://thetestingacademy.com");
    }

    @Test
    public void test_OpenTheTestingAcademyChrome(){
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://thetestingacademy.com");
    }
}
