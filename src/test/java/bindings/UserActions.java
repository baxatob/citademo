package bindings;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import users.User;
import pages.LandingPage;
import pages.StartPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.util.concurrent.TimeUnit;


public class UserActions {

    WebDriver driver;
    LandingPage landingPage;
    StartPage startPage;
    User user;

    private void user_open_browser() {
        this.driver = new FirefoxDriver();
        this.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        this.driver.manage().window().maximize();
    }

    private void user_close_browser() {
        this.driver.close();
    }

    @Given("^that user on the LV landing page$")
    public void user_on_the_LV_landing_page() {
        user_open_browser();
        landingPage = new LandingPage(this.driver);
        landingPage.navigate("lv");
    }

    @Given("^that user on the LT landing page$")
    public void user_on_the_LT_landing_page() {
        user_open_browser();
        landingPage = new LandingPage(this.driver);
        landingPage.navigate("lt");
    }

    @Given("^that user on the EE landing page$")
    public void user_on_the_EE_landing_page() {
        user_open_browser();
        landingPage = new LandingPage(this.driver);
        landingPage.navigate("ee");
    }

    @When("^user login using PIN-calculator$")
    public void user_login_by_pin() {
        user = new User();
        landingPage.login("PIN", "FAKE", "FAKE");
    }

    @When("^user login using ID-card$")
    public void user_login_by_id() {
        user = new User();
        landingPage.login("ID", "FAKE", "FAKE");
    }

    @Then("^user can view a start page$")
    public void user_can_view_a_start_page() throws AssertionError {
        startPage = new StartPage(this.driver);
        try {
            startPage.check_user_loged_in();
        }
        finally {
            user_close_browser();
        }
    }
}
