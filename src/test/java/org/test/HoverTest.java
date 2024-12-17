package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class HoverTest {
    @Test
    public void hoverTest(){
        WebDriver driver = DriverSelector.getDriver("firefox");
        driver.get("https://testeroprogramowania.github.io/selenium/basics.html");
        WebElement heading = driver.findElement(By.tagName("h1"));
        Actions actions = new Actions(driver);
        actions.moveToElement(heading).perform();

    }
}
