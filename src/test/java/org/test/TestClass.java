package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class TestClass {

    @Test
    public void signUp() {
        WebDriver sfe = DriverSelector.getDriver("firefox");
        sfe.get("https://dev.datalexing.sa/en/register/");

        // Ожидаем, что ссылка "Terms of Service" станет кликабельной
        WebDriverWait wait = new WebDriverWait(sfe, Duration.ofSeconds(10));
        //checkbox
        //By agreementCheckBox = By.cssSelector("use[href='/sprite.svg#Checkbox_unchecked']");
        By agreementCheckboxXp = By.xpath("//*[@href = '/sprite.svg#Checkbox_unchecked']");
        //Terms of service link
//        By termsOfServiceLink = By.cssSelector("span#terms a[href*='terms']");
        By termsOfServLink = By.xpath("//span[@id = 'terms']/a");
        //login button
        By logInButton = By.xpath("//a[@aria-label]");
        WebElement checkbox = wait.until(ExpectedConditions.elementToBeClickable(agreementCheckboxXp));
//        sfe.findElement(termsOfServiceLink).click();
        List<By> checkboxes = new ArrayList<>();
        checkboxes.add(agreementCheckboxXp);
        checkboxes.add(logInButton);
        for (By el:checkboxes){
            sfe.findElement(el).click();

        }
//
//        // Кликаем по ссылке "Terms of Service"
//        checkbox.click();
    }
}
