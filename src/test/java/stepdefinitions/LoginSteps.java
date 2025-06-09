package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.pages.LoginPage;

public class LoginSteps {
    @Autowired
    LoginPage loginPage;

    @Given("User is on login page")
    public void userIsOnLoginPage() {
        loginPage.open();
        loginPage.seeLoginTitle();
    }

    @When("User insert username and password")
    public void userInsertUsernameAndPassword() {
        loginPage.fillUsernameField("tomsmith");
        loginPage.fillPasswordField("SuperSecretPassword!");
    }

    @And("User clicks on login button")
    public void userClicksOnLoginButton() {
        loginPage.clickLoginBtn();
    }

    @Then("User should login to the application")
    public void userShouldLoginToTheApplication(){
        loginPage.seeSuccessLoginTitle();
    }

    @When("User insert invalid username and password")
    public void userInsertInvalidUsernameAndPassword() {
        loginPage.fillUsernameField("asal");
        loginPage.fillPasswordField("asal!");
    }

    @Then("User should see error username message")
    public void userShouldSeeErrorUsernameMessage() {
        loginPage.seeErrorUsernameMsg();
    }

    @Then("User should see error password message")
    public void userShouldSeeErrorPasswordMessage() {
        loginPage.seeErrorPasswordMsg();
    }

    @When("User insert empty username and password")
    public void userInsertEmptyUsernameAndPassword() {
        loginPage.fillUsernameField("");
        loginPage.fillPasswordField("");
    }

    @When("User insert insensitive username and password")
    public void userInsertInsensitiveUsernameAndPassword() {
        loginPage.fillUsernameField("TOmSmITH");
        loginPage.fillPasswordField("SUpeRSeCReTPAssWOrd!");
    }

    @When("User insert username max length and password")
    public void userInsertUsernameMaxLengthAndPassword() {
        loginPage.fillUsernameField("tomsmithtomsmithtomsmithtomsmithtomsmithtomsmithtomsmithtomsmithtomsmithtomsmithtomsmithtomsmithtomsmithtomsmithtomsmithtomsmithtomsmithtomsmithtomsmithtomsmithtomsmithtomsmithtomsmithtomsmithtomsmithtomsmithtomsmithtomsmithtomsmithtomsmithtomsmithtomsmithtomsmithtomsmithtomsmithtomsmithtomsmithtomsmithtomsmithtomsmithtomsmithtomsmithtomsmithtomsmith");
        loginPage.fillPasswordField("SuperSecretPassword!");
    }

    @When("User insert username and password max length")
    public void userInsertUsernameAndPasswordMaxLength() {
        loginPage.fillUsernameField("tomsmith");
        loginPage.fillPasswordField("SuperSecretPassword!SuperSecretPassword!SuperSecretPassword!SuperSecretPassword!SuperSecretPassword!SuperSecretPassword!SuperSecretPassword!SuperSecretPassword!SuperSecretPassword!SuperSecretPassword!SuperSecretPassword!SuperSecretPassword!SuperSecretPassword!SuperSecretPassword!SuperSecretPassword!SuperSecretPassword!SuperSecretPassword!SuperSecretPassword!SuperSecretPassword!SuperSecretPassword!SuperSecretPassword!SuperSecretPassword!SuperSecretPassword!SuperSecretPassword!SuperSecretPassword!SuperSecretPassword!SuperSecretPassword!SuperSecretPassword!SuperSecretPassword!SuperSecretPassword!");
    }
}
