package com.abir.ATB13xSeleniumTasks.August28th_Mini_Project;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Selenium_Project_VWO {

    @Description("Selenium Mini Project 2.5")
    @Owner("Abir Bhattacharya")
    @Test
    public void test_verify_error(){

        WebDriver driver = new ChromeDriver();
        driver.get("https://app.vwo.com");
        driver.manage().window().maximize();
        WebElement trial = driver.findElement(By.linkText("Start a free trial"));
        trial.click();
        WebElement emailInput = driver.findElement(By.name("email"));
        emailInput.sendKeys("abc");
        WebElement checkbox = driver.findElement(By.name("gdpr_consent_checkbox"));
        checkbox.click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        WebElement errorMessage = driver.findElement(By.xpath("//div[contains(text(),'incorrect')]"));

        Assert.assertEquals(errorMessage.getText(),"The email address you entered is incorrect.");

        driver.close();

    }
}
