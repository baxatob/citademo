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
    private WebElement link_switchToEnglish;

    @FindBy(how = How.XPATH, using = "//a[@hreflang='ru']")
    private WebElement link_switchToRussian;

    @FindBy(how = How.XPATH, using = "//a[@hreflang='lv']")
    private WebElement link_switchToLatvian;

    @FindBy(how = How.XPATH, using = "//a[@hreflang='lt']")
    private WebElement link_switchToLithuanian;

    @FindBy(how = How.XPATH, using = "//a[@hreflang='et']")
    private WebElement link_switchToEstonian;

}
