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
A="//span[@title=\"Additional Details\"]"
driver.find_element(By.XPATH(A)).click()
Phone=driver.find_element(By.XPATH("//span[@class= 'phone']"))
Phonenumber=Phone.text
print("Phone number is" +Phonenumber)
driver.quit()

