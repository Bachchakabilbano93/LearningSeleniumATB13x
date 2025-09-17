package com.abir.ATB13xSeleniumTasks.September16th_DDT;

import com.abir.utils.UtilExcelHRM;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.time.Duration;

public class OrangeHRMDDT {

    @Test(dataProvider = "getData")
    public void HRM_login(String email, String password){

        WebDriver driver = new ChromeDriver();
        driver.get("https://awesomeqa.com/hr/web/index.php/auth/login");
        driver.manage().window().maximize();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        WebElement userName = driver.findElement(By.name("username"));
        userName.sendKeys(email);

        WebElement passwordInput = driver.findElement(By.name("password"));
        passwordInput.sendKeys(password);

        WebElement loginButton = driver.findElement(By.xpath("//button[normalize-space()=\"Login\"]"));
        loginButton.click();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        WebElement error_message = driver.findElement(By.xpath("//p[normalize-space()=\"Invalid credentials\"]"));
        Assert.assertEquals(error_message.getText(), "Invalid credentials");

        driver.close();

    }

    @DataProvider
    public Object[][] getData(){
        // READ THE DATA FROM THE EXCEL FILE
        // GIVE THEM IN THE 2D ARRAY
        return UtilExcelHRM.getTestDataFromExcel("sheet1");

    }
}
