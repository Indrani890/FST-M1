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
print("Account page is found")
Table=driver.find_element(By.XPATH("//table[contains(@class, 'list view table-responsive')]/tbody"))
print("Table is found")
FirstRow=driver.find_element(By.XPATH("//table[contains(@class, 'list view table-responsive')]/tbody/tr[1]/td[3]"))
print("First row,First coloum value is "+FirstRow.get_attribute("innerHTML"))
ThirdRow=driver.find_element(By.XPATH("//table[contains(@class, 'list view table-responsive')]/tbody/tr[3]/td[3]"))
print("Third row,First coloum value is "+ThirdRow.get_attribute("innerHTML"))
FifthRow=driver.find_element(By.XPATH("//table[contains(@class, 'list view table-responsive')]/tbody/tr[5]/td[3]"))
print("Fifth row,First coloum value is "+FifthRow.get_attribute("innerHTML"))
SeventhRow=driver.find_element(By.XPATH("//table[contains(@class, 'list view table-responsive')]/tbody/tr[7]/td[3]"))
print("Seventh row,First coloum value is "+SeventhRow.get_attribute("innerHTML"))
NinthRow=driver.find_element(By.XPATH("//table[contains(@class, 'list view table-responsive')]/tbody/tr[9]/td[3]"))
print("Ninth row,First coloum value is "+NinthRow.get_attribute("innerHTML"))
driver.quit()
