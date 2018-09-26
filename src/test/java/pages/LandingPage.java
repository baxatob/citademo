package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import static org.junit.Assert.assertTrue;


public class LandingPage {
    WebDriver driver;

    public LandingPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(how = How.ID, using = "internet_banking_user_name")
    private WebElement textbox_userName;

    @FindBy(how = How.ID, using = "internet_banking_password")
    private WebElement textbox_password;

    @FindBy(how = How.CLASS_NAME, using = "submit")
    private WebElement button_submit;

    public void navigate() {
        this.driver.get("https://www.citadele.lv/lv/");
    }

    public void login(String name, String password) {
        textbox_userName.sendKeys(name);
        textbox_password.sendKeys(password);
        button_submit.click();

    }
}
