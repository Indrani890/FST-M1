import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.tracing.Span;
import org.openqa.selenium.support.ui.Select;



import javax.swing.*;

public class PrjActivity7 {
    public static void main(String[] args) throws InterruptedException {
        //download the gecko driver, but geckodriver is not downloaded, so download that and provide the path
        WebDriverManager.firefoxdriver().setup();
        System.setProperty("Webdriver.gecko.driver", "C:\\Gecko Driver\\geckodriver.exe");
        //Initialize the firefox driver
        WebDriver driver = new FirefoxDriver();
        //open a page
        driver.get("https://alchemy.hguy.co/crm/");
        //Find the username Field
        WebElement usernameField = driver.findElement(By.className("form-control"));
        //Enter the username
        usernameField.sendKeys("admin");

        //Find the password field
        WebElement passwordField = driver.findElement(By.name("username_password"));
        //enter the password
        passwordField.sendKeys("pa$$w0rd");
        //click on Login
        driver.findElement(By.name("Login")).click();
        //Find the navigation bar
      driver.findElement(By.id("grouptab_0")).click();
      driver.findElement(By.id("moduleTab_9_Leads")).click();
      String A="//span[@title=\"Additional Details\"]";
     driver.findElement(By.xpath(A)).click();
       // String B="//*[@id=\"adspan_1bf01e91-1f26-5249-ed14-63294367a7e5\"]";
        String Phone= driver.findElement(By.xpath("//span[@class= 'phone']")).getText();
        System.out.println(Phone);
        driver.quit();
    }
}