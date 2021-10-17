package com.nextbasecrm.step_definitions;

import com.nextbasecrm.pages.LoginPage;
import com.nextbasecrm.utils.ConfigReader;
import com.nextbasecrm.utils.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.stream.Collectors;

public class Login_StepDefinitions {

    WebDriver driver = Driver.getDriver();

    @Given("Users login with valid credentials")
    public void users_login_with_valid_credentials() {
        LoginPage loginPage = new LoginPage();
        driver.get(ConfigReader.getProperty("url"));
        loginPage.loginInput.sendKeys(ConfigReader.getProperty("userName"));
        loginPage.passwordInput.sendKeys(ConfigReader.getProperty("password"));
        loginPage.loginButton.click();
        System.out.println("Title: "+driver.getTitle());

    }
    @When("Users cannot login with invalid credentials")
    public void users_cannot_login_with_invalid_credentials() {

    }
    @When("Users can check {string} option")
    public void users_can_check_option(String string) {

    }
    @Then("Users access to {string} link page")
    public void users_access_to_link_page(String string) {

    }


}