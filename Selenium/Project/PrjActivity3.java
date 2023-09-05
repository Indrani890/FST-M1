import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class PrjActivity3 {
    public static void main (String[] args) throws InterruptedException {
        //download the gecko driver, but geckodriver is not downloaded, so download that and provide the path
        WebDriverManager.firefoxdriver().setup();
        System.setProperty("Webdriver.gecko.driver", "C:\\Gecko Driver\\geckodriver.exe");
        //Initialize the firefox driver
        WebDriver driver = new FirefoxDriver();
        //open a page
        driver.get("https://alchemy.hguy.co/crm/");
        //Get the image url
        String footerfirstText =driver.findElement(By.id("admin_options")).getText();
        //print the footer 1st text
        System.out.println("The 1st footer text is "+footerfirstText);
        driver.quit();
    }
}

