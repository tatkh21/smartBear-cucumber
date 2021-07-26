package com.smartBear.step_definitions;

import com.smartBear.pages.BasePage;
import com.smartBear.pages.LoginPage;
import com.smartBear.pages.OrderPage;
import com.smartBear.utilities.ConfigurationReader;
import com.smartBear.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Login_Steps {
    LoginPage loginPage = new LoginPage();
    OrderPage orderPage = new OrderPage();

    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));



    }
    @When("user enters valid credentials")
    public void user_enters_valid_credentials() {
        loginPage.loginToSmartBear();


    }
    @Then("user should be able to see WebOrders page")
    public void user_should_be_able_to_see_web_orders_page() {
        String expectedPage = "Web Orders";
        String actualPage = orderPage.webOrdersHeading.getText();
        Assert.assertEquals(expectedPage, actualPage);

    }

    @Given("user logged in to the SmartBear app")
    public void userLoggedInToTheSmartBearApp() {
        loginPage.loginToSmartBear();
    }
}
