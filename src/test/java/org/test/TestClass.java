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
        WebDriver sfe = DriverSelector.getDriver("chrome");
        sfe.get("https://dev.datalexing.sa/en/register/");

        // Ожидаем, что ссылка "Terms of Service" станет кликабельной
        WebDriverWait wait = new WebDriverWait(sfe, Duration.ofSeconds(10));
        //checkbox
        By agreementCheckBox = By.cssSelector("use[href='/sprite.svg#Checkbox_unchecked']");
        //Terms of service link
        By termsOfServiceLink = By.cssSelector("span#terms a[href*='terms']");
        //login button
        By logInButton = By.cssSelector("span a[href*='login']");
        WebElement checkbox = wait.until(ExpectedConditions.elementToBeClickable(agreementCheckBox));
//        sfe.findElement(termsOfServiceLink).click();
        List<By> checkboxes = new ArrayList<>();
        checkboxes.add(agreementCheckBox);
        checkboxes.add(logInButton);
        for (By el:checkboxes){
            sfe.findElement(el).click();

        }
//
//        // Кликаем по ссылке "Terms of Service"
//        checkbox.click();
    }
}
