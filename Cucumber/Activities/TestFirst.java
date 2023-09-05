package StepDefination;

import io.cucumber.java.BeforeAll;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class TestFirst extends BaseClass {
    @BeforeAll
    public static void setUp() {
        WebDriverManager.firefoxdriver().setup();
        System.setProperty("Webdriver.gecko.driver","C:\\Gecko Driver\\geckodriver.exe");
        driver = new FirefoxDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    @Given("The user is on training support home page")
    public void openTSHomePage() {
        //open the ts homepage
        driver.get("https://www.training-support.net");
        //Assertion
        Assertions.assertEquals("Training Support",driver.getTitle());
    }

    @When("The user clicks on About Us link")
    public void clickAboutUSLink() {
        //check the link is active
       // if (driver.findElement(By.id("about-link")).isEnabled()) {
            //Find an element
            //driver.findElement(By.id("about-link")).click();

        //Check if the link is active and then click on the link
        wait.until(ExpectedConditions.elementToBeClickable(By.id("about-link"))).click();
    }

    @Then("They are redirected to About US page")
    public void VerifyAboutPage(){
        //assertion
        Assertions.assertEquals("About Training Support", driver.getTitle());
    }
    @Then("Close the browser")
    public void ClosetheBrowser(){
        driver.quit();
    }
}
