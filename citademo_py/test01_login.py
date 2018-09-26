from base_test import BaseTest, unittest
from pages import Page01_Landing


class Test01_Login(BaseTest):

    def testing_login_with_invalid_credentials(self):
        landing_page = Page01_Landing(self.driver)
        start_page = landing_page.login('FAKE', 'FAKE')
        start_page.check_user_not_found()


if __name__ == "__main__":
    unittest.main()
