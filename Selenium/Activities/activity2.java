package activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


import java.time.Duration;

public class activity2 {
    public static void main (String[] args) throws InterruptedException
    {
        //download the gecko driver, but geckodriver is not downloaded, so download that and provide the path
        WebDriverManager.firefoxdriver().setup();
        System.setProperty("Webdriver.gecko.driver", "C:\\Gecko Driver\\geckodriver.exe");
        //Initialize the firefox driver
        WebDriver driver =new FirefoxDriver();
        //webdriverWait wait =new WebDriver(driver, Duration.ofSeconds(10));
        //open a page
        driver.get("https://training-support.net/selenium/login-form");
        //Find the username Field
        WebElement usernameField= driver.findElement(By.id("username"));
        //Enter the username
        usernameField.sendKeys("admin");

        //Find the password field
        WebElement passwordField = driver.findElement(By.id("password"));
        //enter the password
       passwordField.sendKeys("password");
       //click on Login
        driver.findElement(By.cssSelector("button[type='submit']")).click();
        //Find the confirmation message
        String message = driver.findElement(By.id("action-confirmation")).getText();
        System.out.println("Login message is:" + message);

        //Interaction
        //Thread.sleep(10000);
        //Close the browser
        //driver.quit();

    }
}

