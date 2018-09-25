package bindings;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.concurrent.TimeUnit;
import static org.junit.Assert.assertTrue;

public class LoginLV {

    WebDriver driver;

    @Given("^that user on the latvian landing page$")
    public void that_user_on_the_latvian_landing_page() {
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.citadele.lv/lv/");
        driver.manage().window().maximize();
    }

    @When("^user enter invalid credentials and click on login button$")
    public void user_enter_userID_and_click_on_login_button() {
        driver.findElement(By.name("loginID")).sendKeys("TEST7");
        driver.findElement(By.id("internet_banking_password")).sendKeys("TEST");
        driver.findElement(By.className("submit")).click();

    }

    @Then("^user can view an alert$")
    public void user_can_view_an_alert() throws AssertionError {
        assertTrue(driver.findElement(By.xpath("//fieldset[@id='psw']")).getText().contains("Lietotājs nav identificēts."));
        driver.close();
    }

}
