package steps;

import Base.BaseUtil;
import Pages.LoginPage;
import Transformation.AmounttodigitConvert;
import Transformation.EmailConvert;
import cucumber.api.DataTable;
import cucumber.api.Transform;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;

import java.util.ArrayList;
import java.util.List;

public class LoginStepdef extends BaseUtil {
    private BaseUtil baseUtil;

    public LoginStepdef(BaseUtil baseUtil) {
        this.baseUtil = baseUtil;
    }


    @Given("^User navigated to login page of the application$")
    public void User_navigated_to_login_page_of_the_application() {

        System.out.println("Navigating to Login page");
        baseUtil.driver.get("http://www.executeautomation.com/sign-in");
    }

    @And("^User clicked on ok button$")
    public void userClickedOnOkButton() {
        LoginPage loginPage = new LoginPage(baseUtil.driver);
        loginPage.ClickLogin();
    }

    @Then("^User should be able to see the userform page$")
    public void userShouldBeAbleToSeeTheUserformPage() {
        Assert.assertEquals("didn't open the form page", baseUtil.driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div/div/div/div[1]/div[2]")).isDisplayed(), true);
    }

    @And("^User entered the creds$")
    public void userEnteredTheCreds(DataTable table) {
        List<List<String>> data = table.raw();
//        System.out.println("Username is "+data.get(1).get(0));
//        System.out.println("Username is "+data.get(1).get(1));

        List<User> users = new ArrayList<User>();
        users = table.asList(User.class);
        LoginPage loginPage = new LoginPage(baseUtil.driver);
        for (User user : users) {
            loginPage.Login(user.username, user.password);
        }
    }


    @And("^User entered EmailAddress:([^\"]*)$")
    public void userEnteredEmailAddressAdmin(@Transform(EmailConvert.class) String email) {
        System.out.println("The email id of the user is :" + email);
    }


    @And("^User Wants to count the amount of rs (\\d+) in digits$")
    public void userWantsToCountTheAmountOfRsInDigits(@Transform(AmounttodigitConvert.class) int count) {
        System.out.println("No of digits in salary are: " + count);
    }

    public class User {
        public String username;
        public String password;


        public User(String username, String password) {
            this.username = username;
            this.password = password;
        }


    }
}
