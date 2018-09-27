package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;


public class LandingPage {
    WebDriver driver;
    String URL_LV = "https://www.citadele.lv/lv/";
    String URL_LT = "https://www.citadele.lt/en/";
    String URL_EE = "https://www.citadele.ee/en/";

    public LandingPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(how = How.XPATH, using = "//input[@value='default']/ancestor::div[contains(@class, 'service')]/a")
    private WebElement link_PINcalculator;

    @FindBy(how = How.XPATH, using = "//input[@value='id_card']/ancestor::div[contains(@class, 'service')]/a")
    private WebElement link_IDcard;

    @FindBy(how = How.ID, using = "internet_banking_user_name")
    private WebElement textbox_userName;

    @FindBy(how = How.ID, using = "internet_banking_id_card")
    private WebElement textbox_userIDcard;

    @FindBy(how = How.ID, using = "internet_banking_password")
    private WebElement textbox_password;

    @FindBy(how = How.CLASS_NAME, using = "submit")
    private WebElement button_submit;

    @FindBy(how = How.XPATH, using = "//div[@class='internet-banking']/p[@class='submit']")
    private WebElement button_submit_ee;

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

    public void login(String method, String name, String password) {
        if (method=="PIN") {
            //link_PINcalculator.click();
            textbox_userName.sendKeys(name);
            textbox_password.sendKeys(password);
            button_submit.click();
        }
        else if (method=="ID") {
            link_IDcard.click();
            textbox_userIDcard.sendKeys(name);
            button_submit_ee.click();
        }
    }
}
