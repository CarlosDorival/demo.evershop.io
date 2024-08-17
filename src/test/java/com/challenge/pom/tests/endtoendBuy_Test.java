package com.challenge.pom.tests;

import com.challenge.pom.pages.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class endtoendBuy_Test {

    private WebDriver driver;
    buyShoesKidPage buyShoesKidpage;
    buyShoesWomanPage buyShoesWomanpage;
    buyShoesManPage buyShoesManpage;
    checkOutPage checkOutpage;
    LoginPage loginpage;
    shoppingCartPage shoppingCartpage;

    @Before
    public void  setUp() throws  Exception {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        driver = new ChromeDriver(options);
        loginpage = new LoginPage(driver);
        buyShoesKidpage = new buyShoesKidPage(driver);
        buyShoesWomanpage = new buyShoesWomanPage(driver);
        buyShoesManpage = new buyShoesManPage(driver);
        checkOutpage = new checkOutPage(driver);
        shoppingCartpage = new shoppingCartPage(driver);
        loginpage.visit("https://demo.evershop.io/");
        driver.manage().window().maximize();

    }
@After
    public void tearDown() throws Exception{
        driver.quit();
}

@Test
    public void test() throws InterruptedException{
        loginpage.loginUser();
    try {
        Thread.sleep(2000);
    } catch (InterruptedException e) {
        throw new RuntimeException(e);
    }
    buyShoesKidpage.buyShoesKid();
    buyShoesWomanpage.buyShoesWoman();
    buyShoesManpage.buyShoesMan();
    shoppingCartpage.shoppingCart();
    checkOutpage.checkOut();
    checkOutpage.validatePay();

}

}
