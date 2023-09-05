# Import webdriver from selenium
from selenium import webdriver
from selenium.webdriver.common.by import By
from webdriver_manager.firefox import GeckoDriverManager

# Set up Firefox driver
GeckoDriverManager().setup()
# Create a new instance of the Firefox driver
driver = webdriver.Firefox()

# Open the page
driver.get("https://alchemy.hguy.co/jobs/")
usernameField= driver.find_element(By.className("form-control"))
usernameField.send_Keys("admin")
passwordField = driver.find_element(By.name("username_password"))
passwordField.send_keys("pa$$w0rd")
driver.find_element(By.NAME("Login")).click()
driver.find_element(By.ID("grouptab_0")).click()
driver.find_element(By.ID("moduleTab_9_Leads")).click()
print("Lead page has open")
driver.find_element(By.XPATH("//table[contains(@class, 'list view table-responsive')]/tbody"))
print("Lead table found")
print("10 Name values for Name coloum")
driver.find_element(By.XPATH("//table[contains(@class, 'list view table-responsive')]/tbody/tr[1]/td[3]"))
driver.find_element(By.XPATH("//table[contains(@class, 'list view table-responsive')]/tbody/tr[2]/td[3]"))
driver.find_element(By.XPATH("//table[contains(@class, 'list view table-responsive')]/tbody/tr[3]/td[3]"))
driver.find_element(By.XPATH("//table[contains(@class, 'list view table-responsive')]/tbody/tr[4]/td[3]"))
driver.find_element(By.XPATH("//table[contains(@class, 'list view table-responsive')]/tbody/tr[5]/td[3]"))
driver.find_element(By.XPATH("//table[contains(@class, 'list view table-responsive')]/tbody/tr[6]/td[3]"))
driver.find_element(By.XPATH("//table[contains(@class, 'list view table-responsive')]/tbody/tr[7]/td[3]"))
driver.find_element(By.XPATH("//table[contains(@class, 'list view table-responsive')]/tbody/tr[8]/td[3]"))
driver.find_element(By.XPATH("//table[contains(@class, 'list view table-responsive')]/tbody/tr[9]/td[3]"))
driver.find_element(By.XPATH("//table[contains(@class, 'list view table-responsive')]/tbody/tr[10]/td[3]"))
print("10 User values for User coloum")
driver.find_element(By.XPATH("//table[contains(@class, 'list view table-responsive')]/tbody/tr[1]/td[7]"))
driver.find_element(By.XPATH("//table[contains(@class, 'list view table-responsive')]/tbody/tr[2]/td[7]"))
driver.find_element(By.XPATH("//table[contains(@class, 'list view table-responsive')]/tbody/tr[3]/td[7]"))
driver.find_element(By.XPATH("//table[contains(@class, 'list view table-responsive')]/tbody/tr[4]/td[7]"))
driver.find_element(By.XPATH("//table[contains(@class, 'list view table-responsive')]/tbody/tr[5]/td[7]"))
driver.find_element(By.XPATH("//table[contains(@class, 'list view table-responsive')]/tbody/tr[6]/td[7]"))
driver.find_element(By.XPATH("//table[contains(@class, 'list view table-responsive')]/tbody/tr[7]/td[7]"))
driver.find_element(By.XPATH("//table[contains(@class, 'list view table-responsive')]/tbody/tr[8]/td[7]"))
driver.find_element(By.XPATH("//table[contains(@class, 'list view table-responsive')]/tbody/tr[9]/td[7]"))
driver.find_element(By.XPATH("//table[contains(@class, 'list view table-responsive')]/tbody/tr[10]/td[7]"))
driver.quit()
