package org.test;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class screenShotTest {
    @Test
    public void ScreenShotTrst() throws IOException {
        WebDriver driver = DriverSelector.getDriver("chrome");
        driver.get("https://testeroprogramowania.github.io/selenium/");
        TakesScreenshot screenshot = (TakesScreenshot) driver;
        File srcFile = screenshot.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(srcFile,new File("src/test/resources/screenshot.png"));
        WebElement podstawowaStrona = driver.findElement(By.linkText("Podstawowa strona testowa"));
        JavascriptExecutor jsExec = (JavascriptExecutor) driver;
        jsExec.executeScript("arguments[0].click();",podstawowaStrona);
        File screenWithJS = screenshot.getScreenshotAs(OutputType.FILE);
        String filename = "screenshot" + String.valueOf((int) (Math.random() * 1000)) + ".png";
        FileUtils.copyFile(screenWithJS,new File("src/test/resources/" +filename));

    }
}
