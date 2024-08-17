package com.challenge.pom.pages;

import com.challenge.pom.core.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends Driver {

    By btnEnterAccount = By.xpath("//*[@id=\"app\"]/div/div[2]/div[3]/div[3]/a");
    By labelEmail = By.name("email");
    By labelPassword = By.name("password");
    By btnSingIn = By.xpath("//*[@id=\"loginForm\"]/div[2]/button");

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void loginUser(){
        click(btnEnterAccount);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        type("testcardoes01@yopmail.com",labelEmail);
        type("1234567890",labelPassword);
        click(btnSingIn);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public String loginMessage(){
        return "";
    }


}
