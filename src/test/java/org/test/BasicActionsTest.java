package org.test;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.security.Key;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BasicActionsTest {
    @Test
    public void TestsBasicActions(){
        WebDriver driver = DriverSelector.getDriver("chrome");
        driver.get("https://testeroprogramowania.github.io/selenium/");

        driver.findElement(By.linkText("Podstawowa strona testowa")).click();
        driver.findElement(By.id("clickOnMe")).click();
        System.out.println("cliknuli");

        // Handle the alert
        Alert alert = driver.switchTo().alert();
        System.out.println("Alert text: " + alert.getText()); // Optional: to print alert text
        alert.accept(); // Accept the alert


        By inputField = By.name("username");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement checkbox = wait.until(ExpectedConditions.elementToBeClickable(inputField));
        driver.findElement(inputField).clear();
        System.out.println("oczist");
        driver.findElement(By.cssSelector("input[name='username']")).sendKeys("UsErNaMe");
        driver.findElement(By.cssSelector("input[name='username']")).sendKeys(Keys.ENTER);
        alert.accept();
        alert.accept();

        List<WebElement> radiobuttons = driver.findElements(By.cssSelector("form > input[type = 'radio']"));

        System.out.println(radiobuttons + "all elements");
        for (WebElement el: radiobuttons){
            el.click();
        }

        WebElement select = driver.findElement(By.cssSelector("select"));
        Select allElts = new Select(select);
        allElts.selectByValue("mercedes");
        List<WebElement> options = allElts.getOptions();
        for (WebElement el : options){
            System.out.println(el.getText());

        }
//        trorF("Audi",select);
//        System.out.println("HEAR!");
//        System.out.println(driver.findElement(By.cssSelector("form[onsubmit *='submit']")).getText());
//        System.out.println(driver.findElement(By.cssSelector(".topSecret")).getText());
//        System.out.println(driver.findElement(By.cssSelector(".topSecret")).getAttribute("value"));
//        System.out.println(driver.findElement(By.cssSelector(".topSecret")).getAttribute("textContent"));
        driver.quit();


    }
    @Test

    public void Kozl(){
        System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\leoni\\\\OneDrive\\\\Рабочий стол\\\\instalators\\drivers\\\\chromedriver-win64\\\\chromedriver.exe");
        ChromeOptions chrOptions = new ChromeOptions();
        chrOptions.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(chrOptions);


        driver.get("https://www.udemy.com/course/kurs-selenium-java/learn/lecture/25900574#questions");
        driver.get("https://temp-mail.org/");
        WebElement emailinput = driver.findElement(By.cssSelector("input.emailbox-input.opentip"));

        String copiedEmsil = emailinput.getAttribute("value");
        System.out.println(copiedEmsil);
        driver.close();

        // System.setProperty("webdriver.chrome.driver", "C:\\Users\\leoni\\OneDrive\\Рабочий стол\\instalators\\drivers\\chromedriver-win64\\chromedriver.exe");
        //
        //        // Инициализация опций для Chrome
        //        ChromeOptions options = new ChromeOptions();
        //        options.addArguments("--remote-allow-origins=*");
        //
        //        // Инициализация драйвера с опциями
        //        WebDriver driverChrome = new ChromeDriver(options);



    }

    public static boolean trueOrFalse(String compare){
        WebDriver driver = DriverSelector.getDriver("firefox");
        driver.get("https://testeroprogramowania.github.io/selenium/basics.html");
        WebElement inputMickey = driver.findElement(By.cssSelector("form>input[name*='name']"));
        String copiedText = inputMickey.getAttribute("value");
        System.out.println("Copied text = " + copiedText);
        if (compare.equals(copiedText)){
            return true;
        }
        driver.close();
        return false;
    }
    public static boolean trorF(String n,WebElement websel){
        Select sdf = new Select(websel);

        List<WebElement> sef = sdf.getOptions();
        for (WebElement el:sef){
            if (el.getText().equals(n)){
                System.out.println(el.getText());
                return true;
            }

        }
        return false;

    }
}
