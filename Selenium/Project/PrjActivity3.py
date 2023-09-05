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
footertext= driver.find_element(By.ID("admin_options"))
copyrighttext = footertext.text
print("The 1st footer text is "+copyrighttext)
driver.quit()
