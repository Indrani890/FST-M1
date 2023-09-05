import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

public class PrjActivity9 {
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
        System.out.println("Lead page open");
        List<WebElement> table = driver.findElements(By.xpath("//table[contains(@class, 'list view table-responsive')]/tbody"));
        System.out.println("Lead table found");
        System.out.println("Name column values for 1st 10 rows");
        WebElement Firstrow= driver.findElement(By.xpath("//table[contains(@class, 'list view table-responsive')]/tbody/tr[1]/td[3]"));
        WebElement Secondrow= driver.findElement(By.xpath("//table[contains(@class, 'list view table-responsive')]/tbody/tr[2]/td[3]"));
        WebElement thirdrow= driver.findElement(By.xpath("//table[contains(@class, 'list view table-responsive')]/tbody/tr[3]/td[3]"));
        WebElement forthrow= driver.findElement(By.xpath("//table[contains(@class, 'list view table-responsive')]/tbody/tr[4]/td[3]"));
        WebElement fifthrow= driver.findElement(By.xpath("//table[contains(@class, 'list view table-responsive')]/tbody/tr[5]/td[3]"));
        WebElement sixthrow= driver.findElement(By.xpath("//table[contains(@class, 'list view table-responsive')]/tbody/tr[6]/td[3]"));
        WebElement sevenrow= driver.findElement(By.xpath("//table[contains(@class, 'list view table-responsive')]/tbody/tr[7]/td[3]"));
        WebElement eightrow= driver.findElement(By.xpath("//table[contains(@class, 'list view table-responsive')]/tbody/tr[8]/td[3]"));
        WebElement ninethrow= driver.findElement(By.xpath("//table[contains(@class, 'list view table-responsive')]/tbody/tr[9]/td[3]"));
        WebElement tenthrow= driver.findElement(By.xpath("//table[contains(@class, 'list view table-responsive')]/tbody/tr[10]/td[3]"));
        System.out.println("User column values for 1st 10 rows");
        WebElement Userone= driver.findElement(By.xpath("//table[contains(@class, 'list view table-responsive')]/tbody/tr[1]/td[7]"));
        WebElement Usertwo= driver.findElement(By.xpath("//table[contains(@class, 'list view table-responsive')]/tbody/tr[2]/td[7]"));
        WebElement userthree= driver.findElement(By.xpath("//table[contains(@class, 'list view table-responsive')]/tbody/tr[3]/td[7]"));
        WebElement userfour= driver.findElement(By.xpath("//table[contains(@class, 'list view table-responsive')]/tbody/tr[4]/td[7]"));
        WebElement userfive= driver.findElement(By.xpath("//table[contains(@class, 'list view table-responsive')]/tbody/tr[5]/td[7]"));
        WebElement usersix= driver.findElement(By.xpath("//table[contains(@class, 'list view table-responsive')]/tbody/tr[6]/td[7]"));
        WebElement userseven= driver.findElement(By.xpath("//table[contains(@class, 'list view table-responsive')]/tbody/tr[7]/td[7]"));
        WebElement usereight= driver.findElement(By.xpath("//table[contains(@class, 'list view table-responsive')]/tbody/tr[8]/td[7]"));
        WebElement userninth= driver.findElement(By.xpath("//table[contains(@class, 'list view table-responsive')]/tbody/tr[9]/td[7]"));
        WebElement userten= driver.findElement(By.xpath("//table[contains(@class, 'list view table-responsive')]/tbody/tr[10]/td[7]"));
        driver.quit();
    }
    }

