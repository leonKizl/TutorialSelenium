package org.test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import java.security.Key;
import java.util.Set;

public class newWindows {
    @Test
    public void newWindowTest(){
        WebDriver driver = DriverSelector.getDriver("chrome");
        driver.get("https://testeroprogramowania.github.io/selenium/basics.html");
        String currentWindow = driver.getWindowHandle();
//        driver.manage().window().;
        driver.findElement(By.id("newPage")).click();
        Set<String> windowNames = driver.getWindowHandles();
        for (String window : windowNames){
            if (!window.equals(currentWindow)){
                driver.switchTo().window(window);
            }
        }
        driver.findElement(By.cssSelector("#L2AGLb")).click();
        driver.findElement(By.cssSelector("#APjFqb")).sendKeys("temporary mail");
        driver.findElement(By.cssSelector("#APjFqb")).sendKeys(Keys.ENTER);

        driver.switchTo().window(currentWindow);
        driver.findElement(By.cssSelector("#clickOnMe")).click();

        Alert alert = driver.switchTo().alert();
        alert.accept();
        driver.quit();

    }
}
