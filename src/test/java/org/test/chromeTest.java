package org.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class chromeTest {

    @Test
    public void openBrowser() {
        // Устанавливаем путь к драйверу Chrome
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\leoni\\OneDrive\\Рабочий стол\\instalators\\drivers\\chromedriver-win64\\chromedriver.exe");

        // Инициализация опций для Chrome
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");

        // Инициализация драйвера с опциями
        WebDriver driverChrome = new ChromeDriver(options);

        // Открываем сайт (например, форум)
        driverChrome.get("https://google.com");

        // Закрываем браузер
        driverChrome.quit();
    }
}
