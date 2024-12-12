package org.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class firefoxTest {
    @Test
    public void openFirefox(){
        System.setProperty("webdriver.gecko.driver","C:\\Users\\leoni\\OneDrive\\Рабочий стол\\instalators\\drivers\\geckodriver.exe");
        WebDriver firefoxDriver = new FirefoxDriver();
        firefoxDriver.get("https://google.com");
        firefoxDriver.quit();

    }


}
