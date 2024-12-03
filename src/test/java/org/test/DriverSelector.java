package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.Test;

public class DriverSelector {

    @Test
   public void openBrowser(){
        WebDriver driver = getDriver("edge");
        driver.get("http://seleniumdemo.com");
        driver.manage().window().fullscreen();
        driver.findElement(By.xpath("//span[text()='Shop']")).click();
        driver.quit();


    }
    public static WebDriver getDriver(String browser){
        if (browser.equals("chrome")){
            ChromeOptions chromeOptions = new ChromeOptions();
            chromeOptions.addArguments("--remote-allow-origins=*");
            System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\leoni\\\\OneDrive\\\\Рабочий стол\\\\instalators\\\\drivers\\\\chromedriver-win64\\\\chromedriver.exe");
            return new ChromeDriver(chromeOptions);
        } else if (browser.equals("firefox")) {
            FirefoxOptions firefoxOptions = new FirefoxOptions();
            System.setProperty("webdriver.gecko.driver","C:\\Users\\leoni\\OneDrive\\Рабочий стол\\instalators\\drivers\\geckodriver.exe");
            return new FirefoxDriver(firefoxOptions);
        } else if (browser.equals("edge")) {
            EdgeOptions edgeOptions = new EdgeOptions();
            edgeOptions.addArguments("--disable-features=IsolateOrigins,site-per-process","--remote-allow-origins=*");
            System.setProperty("webdriver.edge.driver", "C:\\Users\\leoni\\OneDrive\\Рабочий стол\\instalators\\drivers\\msedgedriver.exe");
            return new EdgeDriver(edgeOptions);
        } else {
            throw new InvalidArgumentException("Unsuported browser " + browser);
        }
    }
}
