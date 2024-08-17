package com.challenge.pom.pages;

import com.challenge.pom.core.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkOutPage extends Driver {

    By btnEnterAccount = By.xpath("//*[@id=\"app\"]/div/div[2]/div[3]/div[3]/a");
    By labelEmail = By.name("email");
    By labelPassword = By.name("password");
    By btnSingIn = By.xpath("//*[@id=\"loginForm\"]/div[2]/button");
    By btnShopKids = By.xpath("//*[@id=\"app\"]/div/main/div[2]/div/div[1]/a");
    By btnShoesKid01 = By.xpath("//*[@id=\"app\"]/div/main/div[3]/div[2]/div[2]/div/div[1]/div[1]/a/img");
    By btnSizeM = By.xpath("/html/body/div[1]/div/main/div[2]/div[2]/div/div[2]/div[2]/div[1]/ul/li[1]");
    By btnColourPur = By.xpath("//*[@id=\"app\"]/div/main/div[2]/div[2]/div/div[2]/div[2]/div[2]/ul/li[1]");
    By btnAddCart = By.xpath("//*[@id=\"productForm\"]/div/div/div[2]/button");
    By btnContinuesShop = By.xpath("//*[@id=\"lgqjd8crfg\"]/div/div/a[2]");
    By linkHome = By.xpath("/html/body/div[1]/div/main/div[1]/span[1]/a");
    By btnShopWomen = By.xpath("//*[@id=\"app\"]/div/main/div[2]/div/div[2]/a");
    By btnShopMan = By.xpath("//*[@id=\"app\"]/div/main/div[2]/div/div[3]/a");
    By btnBuyCar = By.xpath("//*[@id=\"app\"]/div/div[2]/div[3]/div[2]/a");
    By btnCheckOut = By.xpath("//*[@id=\"app\"]/div/main/div[2]/div/div[2]/div/div[2]/div/div[2]/a");
    By fieldName = By.name("address[full_name]");
    By fieldPhone = By.name("address[telephone]");
    By fieldAddress = By.name("address[address_1]");
    By fieldCity = By.name("address[city]");
    By checklistCountry = By.name("address[country]");
    By checklistCountryChina = By.xpath("//*[@id=\"address[country]\"]/option[3]");
    By listProvince = By.id("address[province]");
    By listProvinceAnhui = By.xpath("//*[@id=\"address[province]\"]/option[2]");
    By labelPostcode = By.name("address[postcode]");
    By checkBoxShipping = By.xpath("//*[@id=\"checkoutShippingAddressForm\"]/div[1]/div[6]/div/div/div/div[1]/label/span[1]");
    By btnContinuePayment = By.xpath("//*[@id=\"checkoutShippingAddressForm\"]/div[2]/button");
    By checkBoxVisa = By.cssSelector(".feather.feather-circle");
    By testSucceful = By.cssSelector("button[class='button interactive outline']");
    By labelCardNumber = By.xpath("//*[@id=\"root\"]/form/div/div[2]/span[1]/span[2]/div/div[2]/span/input");
    By labelMMAA = By.xpath("//*[@id=\"root\"]/form/div/div[2]/span[2]/span[1]/span/span/input");
    By labelCVC = By.xpath("//*[@id=\"root\"]/form/div/div[2]/span[2]/span[2]/span/span/input");
    By btnPlaceOrder = By.xpath("//*[@id=\"checkoutPaymentForm\"]/div[5]/button");
    By succefulCheck = By.cssSelector("div[class='check flex justify-center self-center text-interactive'] svg");


    public checkOutPage(WebDriver driver) {
        super(driver);
    }

    public void checkOut(){
        type("Carlos prueba uno",fieldName);
        type("1234567890",fieldPhone);
        type("calle las pruebas 123",fieldAddress);
        type("lima",fieldCity);
        click(checklistCountry);
        click(checklistCountryChina);
        click(listProvince);
        click(listProvinceAnhui);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        type("1234",labelPostcode);


        //ChromeDriver driver = new ChromeDriver();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 500)");


        click(checkBoxShipping);
        click(btnContinuePayment);
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        click(checkBoxVisa);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        click(testSucceful);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        By cardDetailsFrame = By.xpath("//iframe[contains(@name,'privateStripeFrame')]");

        //++++++++++++++++++++++++++
        WebElement cardDetailsFrame1 = driver.findElement(cardDetailsFrame);
        driver.switchTo().frame(cardDetailsFrame1);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        driver.findElement(By.xpath("(//input[@placeholder='Número de tarjeta'])[1]")).sendKeys("4242424242424242");
        driver.findElement(By.name("exp-date")).sendKeys("1024");
        driver.findElement(By.xpath("(//input[@placeholder='CVC'])[1]")).sendKeys("242");

        driver.switchTo().defaultContent();

        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        //++++++++++++++++++++++++++
        driver.findElement(btnPlaceOrder).click();
        try {
            Thread.sleep(20000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        WebElement element = driver.findElement(By.cssSelector("div[class='check flex justify-center self-center text-interactive'] svg"));
        if (element.isDisplayed()) {
            System.out.println("El elemento es visible.");
        } else {
            System.out.println("El elemento no es visible.");
        }
    }


    public boolean validatePay(){
        WebElement checkOk = driver.findElement(By.cssSelector("div[class='check flex justify-center self-center text-interactive'] svg"));
        boolean elements8 = false;
        if(checkOk.isDisplayed()){
            elements8 = true;
            System.out.println("se cargo de forma correcta la pantalla resumen");
        }
        else{

            System.out.println("error no se visualiza la pantalla resumen");
        }
        return elements8;
    }


}
