package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import java.util.List;

public class cssSelctorTest {
    @Test
    public void findElement(){
        System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\leoni\\\\OneDrive\\\\Рабочий стол\\\\instalators\\\\drivers\\\\chromedriver-win64\\\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://testeroprogramowania.github.io/selenium/basics.html");

        //ID

        By clickMe = By.cssSelector("#clickOnMe");
        //$$("[id = 'clickOnMe']")
        driver.findElements(clickMe);

        //class
        driver.findElement(By.cssSelector(".topSecret"));
        //type
        List<WebElement> element = driver.findElements(By.cssSelector("input"));
        //name
        driver.findElement(By.cssSelector("[name = 'fname']"));
        driver.findElement(By.cssSelector("a[href='https://www.w3schools.com']"));

        //all css selectors
        driver.findElement(By.cssSelector("*"));
        driver.findElement(By.cssSelector("li"));

//        //аwill find form at any level direct child, grandchild, etc
//        driver.findElement(By.cssSelector("form input"));
//        //first child in tag
//        driver.findElement(By.cssSelector("tbody tr"));
//        //directly follows it, on the same level of nesting).(1st element)
//        driver.findElement(By.cssSelector("tbody + tr"));
//        //all el=ts after label
//        driver.findElement(By.cssSelector("tbody ~ tr"));
//        //Selects all <tr> elements that are direct children of a <tbody>.
//        driver.findElement(By.cssSelector("tbody > tr"));
//
//
//        //all inputs with name fname
//        driver.findElement(By.cssSelector("input[name = 'fname']"));
//        //all inputts where name includes part of the text
//        driver.findElement(By.cssSelector("input[name *= 'fname']"));
//        //text starts with text
//        driver.findElement(By.cssSelector("input[name^= 'fna']"));
//        //text ends with text
//        driver.findElement(By.cssSelector("input[id$= 'fname']"));
//        //first child
//        driver.findElement(By.cssSelector("li:first-child"));
//        //last child (foe all tags
//        driver.findElement(By.cssSelector("li:last-child"));
//        //n child
//        driver.findElement(By.cssSelector("li:nth-child(2)"));






        driver.quit();

    }
}
