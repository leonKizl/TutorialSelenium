package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class UploadTest {
    @Test
    public void uploadTest(){
        //Remember it
        WebDriver driver = DriverSelector.getDriver("chrome");
        driver.get("https://testeroprogramowania.github.io/selenium/fileupload.html");
        driver.findElement(By.cssSelector("#myFile")).sendKeys("C:\\Users\\leoni\\OneDrive\\Рабочий стол\\DSC_0319.NEF");
    }
}
