package com.challenge.pom.core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Base {


    public static WebDriver chromeDriverConnection(){

        WebDriver driver = null;

        //+++++++++++++++++++++++++++++++
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-save-password-bubble");  // Desactiva el aviso de guardar contraseñas
        options.addArguments("--disable-infobars");  // Desactiva la barra de información
        options.addArguments("--disable-popup-blocking");  // Desactiva el bloqueo de ventanas emergentes
        options.addArguments("--disable-notifications");
        options.addArguments("--disable-features=Autofill");
        options.addArguments("--incognito");
        //+++++++++++++++++++++++++++++++
        System.setProperty("webdriver.chrome.driver","./src/main/resources/drivers/chromedriver");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        return driver;
    }


}
