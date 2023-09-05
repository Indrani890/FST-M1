# Import webdriver from selenium
from _ast import Assert

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
Actualurl="https://alchemy.hguy.co/crm/index.php?module=Home&action=index"
expectedurl=driver.current_url
Assert.Equal(expectedurl, Actualurl)
driver.quit()

