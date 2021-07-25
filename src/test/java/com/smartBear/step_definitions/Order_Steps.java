package com.smartBear.step_definitions;

import com.smartBear.pages.OrderPage;
import com.smartBear.pages.ViewAllOrders;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class Order_Steps {
    OrderPage orderPage = new OrderPage();
    ViewAllOrders viewAllOrders = new ViewAllOrders();

    @Given("User clicks to {string}")
    public void user_clicks_to(String string) {
        switch (string.toLowerCase()) {
            case "order":
                orderPage.orders.click();
                break;
            case "view all products":
                orderPage.viewAllProducts.click();
                break;
            case "View all orders":
                orderPage.viewAllOrders.click();
                break;

        }

    }
    @Given("User selects {string} from product dropdown")
    public void user_selects_from_product_dropdown(String string) {
    orderPage.selectFromDropdown(string);

    }

    @Given("User enters {string} to costumer name")
    public void user_enters_to_costumer_name(String string) {
orderPage.customerName.sendKeys(string);
    }
    @Given("User enters {string} to street")
    public void user_enters_to_street(String string) {
    orderPage.street.sendKeys(string);
    }
    @Given("User enters {string} to city")
    public void user_enters_to_city(String string) {
    orderPage.city.sendKeys(string);
    }
    @Given("User enters {string} to state")
    public void user_enters_to_state(String string) {
    orderPage.state.sendKeys(string);
    }
    @Given("User enters {int} to Zip")
    public void user_enters_to_zip(Integer int1) {
    orderPage.zip.sendKeys(int1 +"");
    }
    @Given("User selects {string} as card type")
    public void user_selects_as_card_type(String string) {
    orderPage.visaRadioButton.click();
    }

    @Given("User enters {string} to expiration date")
    public void user_enters_to_expiration_date(String string) {
    orderPage.expireDate.sendKeys(string);
    }
    @Given("User clicks process button")
    public void user_clicks_process_button() {
    orderPage.processButton.click();
    }
    @Then("User verifies {string} is in the list")
    public void user_verifies_is_in_the_list(String name) {
    orderPage.viewAllOrders.click();
    String actualName = viewAllOrders.verifyName(name);
        Assert.assertEquals(name, actualName);
    }

    @And("User enters {string} to card number")
    public void userEntersToCardNumber(String cardNumber) {
        orderPage.cardNr.sendKeys(cardNumber);
    }

    @And("User enters {string} to quantity")
    public void userEntersToQuantity(String quantity) {
        orderPage.quantity.sendKeys(quantity);
    }

    @And("User enters {string} to Zip")
    public void userEntersToZip(String zip) {
        orderPage.zip.sendKeys(zip);
    }
}
