package StepDefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.After;
import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;

public class Loginclass extends BaseClass {
    @Given("User is on the login page")
    public void OpenLoginpage(){
        driver.get("https://www.training-support.net/selenium/login-form");
        //Assert
        Assert.assertEquals("Login From", driver.getTitle());
    }
    @When("User enters {string} and {string}")
    public void enterCredential(String username, String password){
        driver.findElement(By.id("username")).sendKeys(username);
        driver.findElement(By.id("password")).sendKeys(password);
        driver.findElement(By.xpath("//button[@type='submit']")).click();
    }
@Then("Read the page title and configaration message")
    public void VerifyMessage(){
        String Loginmessage =driver.findElement(By.id("action-confirmation")).getText();
    Assertions.assertEquals("welcome Back, admin", Loginmessage);
}
//@After
//public void method1(scenario scenario) {
  //  String screenshotPath = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE).getAbsolutePath();
   // scenario.attach(screenshotPath, "image/png", "screenshot");
//}

}
