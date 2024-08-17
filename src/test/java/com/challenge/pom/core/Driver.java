package com.challenge.pom.core;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class Driver {
    protected WebDriver driver;
    public Driver(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements( driver, this);
    }

    public WebElement findElement (By locator){
        return driver.findElement(locator);
    }

    public List<WebElement> findElements(By locator){
        return driver.findElements(locator);
        //ojo
    }

    public String getText(WebElement element){
        return element.getText();
    }

    public String getText(By locator){
        return driver.findElement(locator).getText();
    }

    public void type(String inputText, By locator){
        driver.findElement(locator).sendKeys(inputText);
    }

    public void click(By locator){
        driver.findElement(locator).click();
    }

    public Boolean isDisplayed(By locator) {
        try {
            return driver.findElement(locator).isDisplayed();
        } catch (org.openqa.selenium.NoSuchElementException e){
            return false;
        }
    }

    public void visit(String url){

        if (driver != null) {
            driver.get(url);
        } else {
            throw new IllegalStateException("Driver no está inicializado.");
        }
    }


}
