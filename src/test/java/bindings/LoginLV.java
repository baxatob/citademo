package bindings;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.LandingPage;
import pages.StartPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.util.concurrent.TimeUnit;


public class LoginLV {

    WebDriver driver;
    LandingPage landingPage;
    StartPage startPage;
    Boolean usingIDcard;

    @Given("^that user on the latvian landing page$")
    public void that_user_on_the_latvian_landing_page() {
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        landingPage = new LandingPage(driver);
        landingPage.navigate("lv");
    }

    @When("^user enter invalid credentials and click on login button$")
    public void user_enter_userID_and_click_on_login_button() {
        landingPage.login(true,"FAKE", "FAKE");

    }

    @Then("^user can view an alert$")
    public void user_can_view_an_alert() throws AssertionError {
        startPage = new StartPage(driver);
        startPage.check_user_not_found();
        driver.close();
    }

}
