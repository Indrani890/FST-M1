import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PrjActivity6 {
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
        WebElement navigationbar = driver.findElement(By.id("toolbar"));
       String MenuName =driver.findElement(By.id("grouptab_3")).getText();
        System.out.println("One of the Navigation bar menu is:  "+MenuName);
        driver.findElement(By.id("grouptab_3")).click();
        driver.quit();
    }
}