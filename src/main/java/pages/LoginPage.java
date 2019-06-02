package pages;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {

    public LoginPage(AppiumDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "btn_skip")
    private WebElement btnCLose;

    public void skipLogin() {
        waitForElementsToBeVisible(btnCLose);
        btnCLose.click();
    }
}