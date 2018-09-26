from selenium.webdriver.common.by import By
from config import URL_LV
import time

class PageBase(object):
    def __init__(self, driver):
        self.driver = driver


class Page01_Landing(PageBase):

    textbox_userID = (By.NAME, 'loginID')
    textbox_password = (By.ID, 'internet_banking_password')
    button_submit = (By.CLASS_NAME, 'submit')

    def login(self, user_name, password):
        self.driver.get(URL_LV)
        self.driver.find_element(*self.textbox_userID).send_keys(user_name)
        self.driver.find_element(*self.textbox_password).send_keys(password)
        self.driver.find_element(*self.button_submit).click()
        time.sleep(3)
        return StartPage(self.driver)


class StartPage(PageBase):

    label_userNotFound = (By.XPATH, "//fieldset[@id='psw']")

    def check_user_not_found(self):
        if 'Lietotājs nav identificēts.' in self.driver.find_element(*self.label_userNotFound).text:
            print('TEST PASSED')
        else:
            print('TEST FAILED')
