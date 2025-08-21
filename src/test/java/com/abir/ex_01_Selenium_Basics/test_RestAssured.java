package com.abir.ex_01_Selenium_Basics;

import io.restassured.RestAssured;

import java.io.File;

public class test_RestAssured {
    public static void main(String[] args) {

        File profilePhoto = new File("src/test/java/com/abir/ex01_Selenium_Basics/qajobfit.png");
        File licensePhoto = new File("src/test/java/com/abir/ex01_Selenium_Basics/qajobfit.png");
        File aadharPhoto = new File("src/test/java/com/abir/ex01_Selenium_Basics/qajobfit.png");


        DriverUploadRequest driverUploadRequest = new DriverUploadRequest(
                "1","abc",profilePhoto,licensePhoto,"abc123",aadharPhoto);


        RestAssured.given().baseUri("").basePath("")
                .multiPart("id",driverUploadRequest.getId())
                .multiPart("licenseNo",driverUploadRequest.getLicenseNo());

    }
}
