package org.test;

import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.Test;

public class driverSelectorTest {

    // Метод для выбора драйвера с поддержкой опций
    public static WebDriver driverSelector(String browser){
        if (browser.equalsIgnoreCase("chrome")) {
            ChromeOptions chromeOptions = new ChromeOptions();
            chromeOptions.addArguments("--remote-allow-origins=*");
            return new ChromeDriver(chromeOptions);

        } else if (browser.equalsIgnoreCase("firefox")) {
            FirefoxOptions firefoxOptions = new FirefoxOptions();
            return new FirefoxDriver(firefoxOptions);

        } else if (browser.equalsIgnoreCase("edge")) {
            EdgeOptions edgeOptions = new EdgeOptions();
            edgeOptions.addArguments("--remote-allow-origins=*");
            return new EdgeDriver(edgeOptions);

        } else {
            throw new InvalidArgumentException("Unsupported browser: " + browser);
        }
    }

    @Test
    public void testro() {
        // Установка путей к драйверам
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\leoni\\OneDrive\\Рабочий стол\\instalators\\drivers\\chromedriver-win64\\chromedriver.exe");
        System.setProperty("webdriver.edge.driver", "C:\\Users\\leoni\\OneDrive\\Рабочий стол\\instalators\\drivers\\msedgedriver.exe");
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\leoni\\OneDrive\\Рабочий стол\\instalators\\drivers\\geckodriver.exe");

        // Инициализация драйвера через метод driverSelector
        WebDriver driver = driverSelector("firefox");

        // Открываем сайт
        driver.get("https://google.com");
        driver.quit();
        System.out.println("New browser");
        WebDriver kozel = getDriver("chrome");
        kozel.get("https://www.selenium.dev/downloads/");


    }
    public WebDriver getDriver(String browser){
        switch (browser){
            case "chrome":
                ChromeOptions options = new ChromeOptions();
                options.addArguments("--remote-allow-origins=*");
                return new ChromeDriver(options);
            case "edge":
                return new EdgeDriver();
            case "firefox":
                return new FirefoxDriver();
            }
            throw new IllegalArgumentException();
        }
    }

