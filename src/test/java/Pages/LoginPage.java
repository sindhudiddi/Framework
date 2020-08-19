package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public LoginPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
    @FindBy(how = How.NAME, using = "email")
    public WebElement txtUsername;
    @FindBy(how = How.NAME, using = "password")
    public WebElement txtPassword;
    @FindBy(how = How.CLASS_NAME, using = "ct-btn-blue")
    public WebElement btnsubmit;

    public void Login(String userName, String password) {
        txtUsername.sendKeys(userName);
        txtPassword.sendKeys(password);
    }

    public void ClickLogin(){
        btnsubmit.click();
    }
}
