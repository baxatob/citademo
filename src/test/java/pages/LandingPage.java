package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;


public class LandingPage {
    WebDriver driver;
    String URL_LV = "https://www.citadele.lv/lv/";
    String URL_LT = "https://www.citadele.ee/en/";
    String URL_EE = "https://www.citadele.lt/en/";

    public LandingPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(how = How.LINK_TEXT, using = "\nPIN calculator")
    private WebElement link_PINcalculator;

    @FindBy(how = How.LINK_TEXT, using = "\nID-Card")
    private WebElement link_IDcard;

    @FindBy(how = How.ID, using = "internet_banking_user_name")
    private WebElement textbox_userName;

    @FindBy(how = How.ID, using = "internet_banking_password")
    private WebElement textbox_password;

    @FindBy(how = How.CLASS_NAME, using = "submit")
    private WebElement button_submit;

    public void navigate(String state) {
        if (state == "ee") {
            this.driver.get(URL_EE);
        }
        else if (state == "lv") {
            this.driver.get(URL_LV);
        }
        else if (state == "lt") {
            this.driver.get(URL_LT);
        }
    }

    public void login(Boolean method, String name, String password) {
        textbox_userName.sendKeys(name);
        if (method) {
            textbox_password.sendKeys(password);
        }
        button_submit.click();

    }
}
