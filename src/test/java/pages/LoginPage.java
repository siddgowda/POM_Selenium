package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }


    //Locators
    @FindBy(id = "email")
    private WebElement email;

    @FindBy(id = "pass")
    private WebElement password;

    @FindBy(xpath = "(//button[normalize-space()='Log in'])[1]")
    private WebElement loginButton;

    //Methods

    public void enterUserName(String userName) {
        email.sendKeys(userName);
    }

    public void enterPassword(String pass) {
        password.sendKeys(pass);
    }

    public void clickOnLogin() {
        loginButton.click();
    }

}
