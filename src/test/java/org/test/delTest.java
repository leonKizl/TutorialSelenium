package org.test;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Set;

public class delTest {
    @Test

    public void detest() throws IOException {
        WebDriver driver = DriverSelector.getDriver("chrome");
//        driver.get("https://testeroprogramowania.github.io/selenium/basics.html");
//        WebElement selecorElement = driver.findElement(By.cssSelector("select"));
//        Select selectors = new Select(selecorElement);
//
//
//        List<WebElement> allSelectors = selectors.getOptions();
//        for (WebElement el : allSelectors){
//            el.click();
//            System.out.println(el.getText());
//        }
//        String amount = driver.findElement(By.cssSelector("tr > td:last-child")).getText();
//        System.out.println(amount);
//        driver.findElement(By.cssSelector("input[value*='Submit']")).click();
//        Alert alert = driver.switchTo().alert();
//        alert.accept();
//        alert.accept();
//        String currentBrows = driver.getWindowHandle();
//        String secondBrows = null;
//        driver.findElement(By.cssSelector("#newPage")).click();
//        Set<String> allBrows = driver.getWindowHandles();
//        for (String el : allBrows){
//            if (!el.equals(currentBrows)){
//                secondBrows = el;
//            }
//        }
//        driver.switchTo().window(secondBrows);
//        driver.findElement(By.cssSelector("button#L2AGLb")).click();
//        driver.findElement(By.cssSelector("div.FPdoLc.lJ9FBc input[name='btnI']")).click();
//        driver.close();
//        driver.switchTo().window(currentBrows);
//        driver.get("https://testeroprogramowania.github.io/selenium/");
//        JavascriptExecutor jsexec = (JavascriptExecutor) driver;
//        WebElement plik = driver.findElement(By.linkText("Załadowanie pliku"));
//        jsexec.executeScript("arguments[0].click();",plik);
//        driver.findElement(By.cssSelector("input")).sendKeys("C:\\Users\\leoni\\OneDrive\\Рабочий стол\\1.png");
//
//        TakesScreenshot screenshot = (TakesScreenshot) driver;
//        File srcfile = screenshot.getScreenshotAs(OutputType.FILE);
//        FileUtils.copyFile(srcfile,new File("src/test/resources/myfuckingscreeen.png"));

//        driver.get("https://testeroprogramowania.github.io/selenium/doubleclick.html");
        Actions actions = new Actions(driver);
//        WebElement el = driver.findElement(By.id("bottom"));
//        actions.doubleClick(el).perform();

        driver.get("https://testeroprogramowania.github.io/selenium/basics.html");
        WebElement elHover = driver.findElement(By.cssSelector("h1"));
        actions.moveToElement(elHover).perform();



    }


}
