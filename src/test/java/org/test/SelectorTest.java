package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

import static org.test.DriverSelector.getDriver;

public class SelectorTest {
    @Test
    public void findElemet(){
        WebDriver driver = getDriver("firefox");
        driver.get("https://testeroprogramowania.github.io/selenium/basics.html");
        //ID

        //By clickMeButton = By.id("clickOnMe");
        WebElement ClickMeButton = driver.findElement(By.id("clickOnMe"));

        //NAME
        driver.findElement(By.name("fname"));
        //CLASS
        driver.findElement(By.className("topSecret"));
        List<WebElement> inputs = driver.findElements(By.tagName("input"));
        System.out.println(inputs.size());
        System.out.println(inputs);
        //Link
        driver.findElement(By.linkText("Visit W3Schools.com!"));
        driver.findElement(By.partialLinkText("Visit W3Sc"));




    }
}
