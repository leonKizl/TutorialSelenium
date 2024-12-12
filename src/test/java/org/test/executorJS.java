package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class executorJS {
    @Test
    public void executorJS(){
        WebDriver driver = DriverSelector.getDriver("firefox");
        driver.get("https://testeroprogramowania.github.io/selenium/");
        WebElement stronaZIframe = driver.findElement(By.linkText("Strona z iframe"));
//        stronaZIframe.click();
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();",stronaZIframe);
        driver.get("https://testeroprogramowania.github.io/selenium/basics.html");
        WebElement input = driver.findElement(By.name("fname"));
        executor.executeScript("arguments[0].setAttribute('value','KinoGO');",input);

    }
}
