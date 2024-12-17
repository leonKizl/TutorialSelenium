package org.test;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class executorJS {
    @Test
    public void executorJS() throws IOException {
        WebDriver driver = DriverSelector.getDriver("firefox");
        driver.get("https://testeroprogramowania.github.io/selenium/");
        WebElement stronaZIframe = driver.findElement(By.linkText("Strona z iframe"));
//        stronaZIframe.click();
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();",stronaZIframe);
        driver.get("https://testeroprogramowania.github.io/selenium/basics.html");
        WebElement input = driver.findElement(By.name("fname"));
        executor.executeScript("arguments[0].setAttribute('value','KinoGO');",input);
        TakesScreenshot scrF = (TakesScreenshot) driver;
        File srcFile = scrF.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(srcFile,new File("src/test/resources/screnJavaExec.png"));
        driver.quit();

    }
}
