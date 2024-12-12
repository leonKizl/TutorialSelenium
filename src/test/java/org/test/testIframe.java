package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import java.util.Set;

public class testIframe {
    @Test
    public void testToDelete(){
        WebDriver driver = DriverSelector.getDriver("chrome");
        driver.get("https://testeroprogramowania.github.io/selenium/iframe.html");
        driver.switchTo().frame(0);
        System.out.println(driver.findElement(By.cssSelector("h1")).getText());
        driver.switchTo().defaultContent();
        System.out.println(driver.findElement(By.cssSelector("h1")).getText());


    }
}
