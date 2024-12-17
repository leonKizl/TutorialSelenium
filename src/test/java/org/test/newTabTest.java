package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Set;

public class newTabTest {
    @Test
    public void TempMailInNewTab(){
        WebDriver driver = DriverSelector.getDriver("chrome");
        driver.get("https://testeroprogramowania.github.io/selenium/basics.html");
        String currentBrows = driver.getWindowHandle();
        String seconBrows = null;
        JavascriptExecutor jsexecutor = (JavascriptExecutor) driver;
        jsexecutor.executeScript("window.open('about:blank', '_blank');");
        Set<String> allBrows_s = driver.getWindowHandles();
        for (String el : allBrows_s){
            if (!el.equals(currentBrows)){
                seconBrows = el;
                driver.switchTo().window(seconBrows);
            }
        }
        driver.get("https://temp-mail.org/");
        String text = driver.findElement(By.cssSelector("div.temp-emailbox>h2")).getText();
        driver.switchTo().window(currentBrows);
        driver.findElement(By.id("fname")).sendKeys(text);
        driver.switchTo().window(seconBrows);
        driver.switchTo().window(currentBrows);
        driver.get("https://code-basics.com/ru/languages/html/lessons/checkbox");
        List<WebElement> allcheckboxes = driver.findElements(By.cssSelector("form>label"));
        for (WebElement el : allcheckboxes){
            el.click();
        }



    }
}
