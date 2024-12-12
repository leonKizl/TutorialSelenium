package org.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

public class edgeTest {
    @Test
    public void openEdge(){
        // Устанавливаем путь к драйверу Edge
        System.setProperty("webdriver.edge.driver", "C:\\Users\\leoni\\OneDrive\\Рабочий стол\\instalators\\drivers\\msedgedriver.exe");

        // Инициализация опций для Edge
        EdgeOptions options = new EdgeOptions();
        options.addArguments("--disable-features=IsolateOrigins,site-per-process");
        options.addArguments("--remote-allow-origins=*");
        //options.addArguments("--disable-web-security"); // Дополнительно, если требуется
//        options.addArguments("--allow-running-insecure-content");

        // Создаем экземпляр EdgeDriver с указанными опциями
        WebDriver edgeDriver = new EdgeDriver(options);

        // Открываем сайт
        edgeDriver.get("https://google.com");

        // Закрываем браузер
        edgeDriver.quit();
    }
}
