package com.evershop;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Set;

public class endtoendBuy {


    private WebDriver driver;
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

    @Before
    public void setUp(){
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
        driver.get("https://demo.evershop.io/");
        driver.manage().window().maximize();
    }

    @Test
    public void testEvershopPage()throws InterruptedException {
        driver.findElement(btnEnterAccount).click();
        //Thread.sleep(2000);
        driver.findElement(labelEmail).sendKeys("testcardoes01@yopmail.com");
        driver.findElement(labelPassword).sendKeys("1234567890");
        driver.findElement(btnSingIn).click();
        Thread.sleep(2000);

        driver.findElement(btnShopKids).click();
        Thread.sleep(2000);
        //selecionar  zapatilla
        driver.findElement(btnShoesKid01).click();
        Thread.sleep(1000);
        //selecionar  talla
        driver.findElement(btnSizeM).click();
        driver.findElement(btnColourPur).click();
        driver.findElement(btnAddCart).click();
        Thread.sleep(2000);
        driver.findElement(linkHome).click();
        Thread.sleep(2000);

        //otro objeto women
        driver.findElement(btnShopWomen).click();
        driver.findElement(btnShoesKid01).click();
        driver.findElement(btnSizeM).click();
        driver.findElement(btnColourPur).click();
        driver.findElement(btnAddCart).click();
        Thread.sleep(2000);
        driver.findElement(linkHome).click();
        Thread.sleep(2000);

        //zapatillas hombres
        driver.findElement(btnShopMan).click();
        driver.findElement(btnShoesKid01).click();
        Thread.sleep(1000);
        driver.findElement(btnSizeM).click();
        Thread.sleep(1000);
        driver.findElement(btnColourPur).click();
        Thread.sleep(1000);
        driver.findElement(btnAddCart).click();
        Thread.sleep(2000);
        driver.findElement(linkHome).click();
        Thread.sleep(2000);

        //pagar
        driver.findElement(btnBuyCar).click();
        driver.findElement(btnCheckOut).click();
        Thread.sleep(4000);

        //llenar formulario
        driver.findElement(fieldName).sendKeys("Carlos prueba uno");
        Thread.sleep(2000);
        driver.findElement(fieldPhone).sendKeys("1234567890");
        driver.findElement(fieldAddress).sendKeys("calle las pruebas 123");
        driver.findElement(fieldCity).sendKeys("Lima");
        driver.findElement(checklistCountry).click();
        driver.findElement(checklistCountryChina).click();
        driver.findElement(listProvince).click();
        driver.findElement(listProvinceAnhui).click();
        Thread.sleep(2000);
        driver.findElement(labelPostcode).sendKeys("1234");

        //realizar scroll
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 500)");

        driver.findElement(checkBoxShipping).click();
        driver.findElement(btnContinuePayment).click();
        /*
        aqui sale la ventana
        */

        Thread.sleep(10000);

        driver.findElement(checkBoxVisa).click();
        Thread.sleep(2000);
        driver.findElement(testSucceful).click();
        Thread.sleep(10000);


        //+++++++++++++++++++++++++++++++++++++++++++++


        By cardDetailsFrame = By.xpath("//iframe[contains(@name,'privateStripeFrame')]");


        WebElement cardDetailsFrame1 = driver.findElement(cardDetailsFrame);
        driver.switchTo().frame(cardDetailsFrame1);

        Thread.sleep(2000);

        driver.findElement(By.xpath("(//input[@placeholder='Número de tarjeta'])[1]")).sendKeys("4242424242424242");
        driver.findElement(By.name("exp-date")).sendKeys("1024");
        driver.findElement(By.xpath("(//input[@placeholder='CVC'])[1]")).sendKeys("242");

        driver.switchTo().defaultContent();

        Thread.sleep(4000);




        //+++++++++++++++++++++++++++++++++++++++++++++

        driver.findElement(btnPlaceOrder).click();
        Thread.sleep(20000);

        WebElement element = driver.findElement(By.cssSelector("div[class='check flex justify-center self-center text-interactive'] svg"));
        if (element.isDisplayed()) {
            System.out.println("El elemento es visible.");
        } else {
            System.out.println("El elemento no es visible.");
        }



    }

    @After
    public void tearDown(){
        driver.quit();
    }

}
