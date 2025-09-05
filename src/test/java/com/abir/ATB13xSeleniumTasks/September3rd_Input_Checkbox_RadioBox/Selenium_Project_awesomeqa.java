package com.abir.ATB13xSeleniumTasks.September3rd_Input_Checkbox_RadioBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Selenium_Project_awesomeqa {

    @Test
    public void inputRadioCheckbox(){

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://awesomeqa.com/practice.html");

        driver.findElement(By.name("firstname")).sendKeys("Rajashree");
        driver.findElement(By.name("lastname")).sendKeys("Bhattacharya");
        driver.findElement(By.xpath("//input[@value='Female']")).click();
        driver.findElement(By.xpath("//input[@value='Automation Tester']")).click();
        driver.findElement(By.id("submit")).click();
        driver.quit();

    }
}
