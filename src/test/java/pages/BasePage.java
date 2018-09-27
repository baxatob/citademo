package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
    WebDriver driver;

    BasePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(how = How.XPATH, using = "//a[@hreflang='en']")
    public WebElement link_switchToEnglish;

    @FindBy(how = How.XPATH, using = "//a[@hreflang='ru']")
    public WebElement link_switchToRussian;

    @FindBy(how = How.XPATH, using = "//a[@hreflang='lv']")
    public WebElement link_switchToLatvian;

    @FindBy(how = How.XPATH, using = "//a[@hreflang='lt']")
    public WebElement link_switchToLithuanian;

    @FindBy(how = How.XPATH, using = "//a[@hreflang='et']")
    public WebElement link_switchToEstonian;

    public void switch_language(String lang) {
        if(lang=="en") {
            link_switchToEnglish.click();
        }
        else if(lang=="ru") {
            link_switchToRussian.click();
        }
        else if(lang=="lv") {
            link_switchToLatvian.click();
        }
        else if(lang=="lt") {
            link_switchToLithuanian.click();
        }
        else if(lang=="ee") {
            link_switchToEstonian.click();
        }
    }

}
