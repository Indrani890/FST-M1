package activities;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.net.MalformedURLException;

import static org.testng.AssertJUnit.assertEquals;
import static org.apache.commons.io.FileUtils.copyFile;


public class activity1 {
    //webdriver object
    WebDriver driver;

    @BeforeClass
    public void setUp() throws MalformedURLException { //Desired capabilities
        UiAutomator2Options capabilities = new UiAutomator2Options();
        capabilities.setPlatformName("anroid");
        capabilities.setAutomationName("UiAutomator2");
        capabilities.setAppPackage("com.android.calculator2");
        capabilities.setAppActivity(".Calculator");
        capabilities.noReset();

        //Server URL
        URL serverUrl = new URL("http://localhost:4723/wd/hub");

        //Initialize anroid driver
        driver = new AndroidDriver(serverUrl, capabilities);

    }

    @Test
    public void MultiTest() throws IOException {
        //find element 2
        driver.findElement(AppiumBy.id("com.android.calculator2:id/digit_2")).click();
        //find element *
        driver.findElement(AppiumBy.id("com.android.calculator2:id/op_mul")).click();
        //find element 6
        driver.findElement(AppiumBy.id("com.android.calculator2:id/digit_6")).click();
        //find the = button
        driver.findElement(AppiumBy.id("com.android.calculator2:id/eq")).click();
        //find the result test
        String result = driver.findElement(AppiumBy.id("com.android.calculator2:id/result")).getText();

        //Assertion
        takescreenshot(driver);
        assertEquals(result, "12");

    }

    public static void takescreenshot(WebDriver driver) throws IOException {
        //Temporary file
        File temp = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        //File location on my system
        File screenshot = new File("src/test/resources/screenshot.jpg");
        //copy tem file to parmanent locat
        copyFile(temp, screenshot);

    }

    @AfterClass
    public void teardown() {
        //close the app
        driver.quit();
    }
}
