package com.challenge.pom.pages;

import com.challenge.pom.core.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class buyShoesKidPage extends Driver {


    By btnShopKids = By.xpath("//*[@id=\"app\"]/div/main/div[2]/div/div[1]/a");
    By btnShoesKid01 = By.xpath("//*[@id=\"app\"]/div/main/div[3]/div[2]/div[2]/div/div[1]/div[1]/a/img");
    By btnSizeM = By.xpath("/html/body/div[1]/div/main/div[2]/div[2]/div/div[2]/div[2]/div[1]/ul/li[1]");
    By btnColourPur = By.xpath("//*[@id=\"app\"]/div/main/div[2]/div[2]/div/div[2]/div[2]/div[2]/ul/li[1]");
    By btnAddCart = By.xpath("//*[@id=\"productForm\"]/div/div/div[2]/button");
    By linkHome = By.xpath("/html/body/div[1]/div/main/div[1]/span[1]/a");


    public buyShoesKidPage(WebDriver driver) {
        super(driver);
    }

    public void buyShoesKid(){
        click(btnShopKids);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        click(btnShoesKid01);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        click(btnSizeM);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        click(btnColourPur);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        click(btnAddCart);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        click(linkHome);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


    }



}
