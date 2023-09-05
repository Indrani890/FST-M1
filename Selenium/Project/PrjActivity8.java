import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import javax.swing.*;
import java.util.List;

public class PrjActivity8 {
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
        driver.findElement(By.id("moduleTab_9_Accounts")).click();
        System.out.println("Account page is found");
        List<WebElement> table = driver.findElements(By.xpath("//table[contains(@class, 'list view table-responsive')]/tbody"));
        System.out.println("table found");
        WebElement Firstrow= driver.findElement(By.xpath("//table[contains(@class, 'list view table-responsive')]/tbody/tr[1]/td[3]"));
        System.out.println("First row, first column value" + Firstrow.getAttribute("innerHTML"));
        WebElement ThirdRow= driver.findElement(By.xpath("//table[contains(@class, 'list view table-responsive')]/tbody/tr[3]/td[3]"));
        System.out.println("Third row, first column value" + ThirdRow.getAttribute("innerHTML"));
        WebElement Fifthtrow= driver.findElement(By.xpath("//table[contains(@class, 'list view table-responsive')]/tbody/tr[5]/td[3]"));
        System.out.println("Fifth row, first column value" + Fifthtrow.getAttribute("innerHTML"));
        WebElement Sevenrow= driver.findElement(By.xpath("//table[contains(@class, 'list view table-responsive')]/tbody/tr[7]/td[3]"));
        System.out.println("Seven row, first column value" + Sevenrow.getAttribute("innerHTML"));
        WebElement NineRow= driver.findElement(By.xpath("//table[contains(@class, 'list view table-responsive')]/tbody/tr[9]/td[3]"));
        System.out.println("Ninth row, first column value" + NineRow.getAttribute("innerHTML"));
        //WebElement l=driver.findElement(By.linkText("Waverly Trading House"));
        //String V= cells.getAttribute("href");
        //System.out.println("HREF value of the 1st row is "+V);
        driver.quit();
    }
}



