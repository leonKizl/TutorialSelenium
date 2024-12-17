package org.test;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Set;

public class HomeWorkTest {
    @Test
    public void homeWorkTest(){
        WebDriver driver = DriverSelector.getDriver("chrome");
        driver.get("https://testeroprogramowania.github.io/selenium/");
        driver.findElement(By.linkText("Podstawowa strona testowa")).click();
        driver.findElement(By.id("clickOnMe")).click();
        Alert alert = driver.switchTo().alert();
        alert.accept();
        WebElement select = driver.findElement(By.cssSelector("select"));
        Select allSelectors = new Select(select);
        allSelectors.selectByValue("saab");
        allSelectors.selectByVisibleText("Volvo");
        List<WebElement> allOptions = allSelectors.getOptions();
        for (WebElement el : allOptions){
            System.out.println(el.getText());
            el.click();
        }
        driver.findElement(By.cssSelector("input[name*=username]")).clear();
        driver.findElement(By.cssSelector("input[name*=username]")).sendKeys("Swinskiswin");
        driver.findElement(By.cssSelector("input[type*=submit]")).sendKeys(Keys.ENTER);
//        driver.switchTo().alert();
        alert.accept();
        alert.accept();
        String currentBrows = driver.getWindowHandle();
        driver.findElement(By.cssSelector("button#newPage")).click();
        Set<String> allBrows = driver.getWindowHandles();




    }


}
