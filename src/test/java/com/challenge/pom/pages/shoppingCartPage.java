package com.challenge.pom.pages;

import com.challenge.pom.core.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class shoppingCartPage extends Driver {


    By btnBuyCar = By.xpath("//*[@id=\"app\"]/div/div[2]/div[3]/div[2]/a");
    By btnCheckOut = By.xpath("//*[@id=\"app\"]/div/main/div[2]/div/div[2]/div/div[2]/div/div[2]/a");


    public shoppingCartPage(WebDriver driver) {
        super(driver);
    }

    public void shoppingCart(){
        click(btnBuyCar);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        click(btnCheckOut);
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }



}
