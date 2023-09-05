package activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;


public class Activity7 {
    public static void main(String[] args) throws InterruptedException {
        //download the gecko driver, but geckodriver is not downloaded, so download that and provide the path
        WebDriverManager.firefoxdriver().setup();
        System.setProperty("Webdriver.gecko.driver", "C:\\Gecko Driver\\geckodriver.exe");
        //Initialize the firefox driver
        WebDriver driver = new FirefoxDriver();
        //Initialize Action object
        Actions builder =new Actions(driver);
        //open a page
        driver.get("https://www.training-support.net/selenium/drag-drop");
        //Get the page title
        System.out.println("The page title is :" +driver.getTitle());
        //Find the football and dropzone
        WebElement football= driver.findElement(By.id("draggable"));
        WebElement dropzone1= driver.findElement(By.id("droppable"));
        WebElement dropzone2= driver.findElement(By.id("dropzone2"));
        //Perform drag and drope
        builder.dragAndDrop(football, dropzone1).build().perform();
        //Verify if the football is droped
        String message=driver.findElement(By.xpath("//div[@id='droppable']/p")).getText();
        System.out.println(message);
        //Perform drag and drope
        builder.dragAndDrop(football, dropzone2).build().perform();
        //Verify if the football is droped
        String message1 =driver.findElement(By.xpath("//div[@id='dropzone2']/p")).getText();
        System.out.println(message1);
    }
}
