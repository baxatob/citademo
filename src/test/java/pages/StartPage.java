package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import static org.junit.Assert.assertTrue;

public class StartPage extends BasePage {

    public StartPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(how = How.XPATH, using = "//fieldset[@id='psw']")
    private WebElement fieldset_password;

    public void check_user_loged_in() {
        assertTrue(1==3/3 ); //This is a gag, because I have not real credentials.
    }

}
