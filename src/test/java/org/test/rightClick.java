package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.util.Set;

public class rightClick {
    @Test
    public void rightClick(){
        WebDriver driver = DriverSelector.getDriver("chrome");
        driver.get("https://testeroprogramowania.github.io/selenium/basics.html");
        Actions actions = new Actions(driver);
        actions.contextClick(driver.findElement(By.id("fname"))).perform();
        driver.get("https://testeroprogramowania.github.io/selenium/doubleclick.html");
        String currentBrows = driver.getWindowHandle();
        WebElement buttonClickMeTwice = driver.findElement(By.id("bottom"));
        actions.doubleClick(buttonClickMeTwice).perform();
        Set<String> allBrows = driver.getWindowHandles();
        for (String el : allBrows){
            if (!el.equals(currentBrows)){
                driver.switchTo().window(el);
            }
        }
        driver.findElement(By.cssSelector("#L2AGLb")).click();
        driver.findElement(By.cssSelector("div.FPdoLc input.RNmpXc")).click();
        driver.close();
        driver.switchTo().window(currentBrows);
        driver.quit();
    }
}
