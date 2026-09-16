package io.cucumber.glue;

import io.cucumber.core.Context;
import io.cucumber.core.Manager;
import io.cucumber.pages.HomePage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.HasAuthentication;
import org.openqa.selenium.UsernameAndPassword;
import io.cucumber.pages.BasicAuthPage;
import org.junit.jupiter.api.Assertions;


public class BasicAuthSteps extends Context {
  public BasicAuthSteps(Manager manager) {
    super(manager);

  }

  @When("valid credentials are supplied for 'Basic Auth'")
    public void validCredentialsAreSuppliedForBasicAuth() {
        HasAuthentication auth = (HasAuthentication) getDriver();
        auth.register(UsernameAndPassword.of("admin", "admin"));

    }

    @When("the user is redirected to 'Basic Auth' page")
    public void theUserIsRedirectedToBasicAuthPage() {
        HomePage homePage = new HomePage(getDriver());
        homePage.clickBasicAuthLink();

    }

    @Then("'Congratulations' message should be displayed")
    public void congratulationsMessageShouldBeDisplayed() {
        BasicAuthPage basicAuthPage = new BasicAuthPage(getDriver());
        String expectedText = "Congratulations! You must have the proper credentials.";
        Assertions.assertEquals(expectedText, basicAuthPage.getCongratulationsMessage());
        }

 }
