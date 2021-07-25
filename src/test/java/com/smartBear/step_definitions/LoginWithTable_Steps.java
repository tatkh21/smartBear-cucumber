package com.smartBear.step_definitions;

import com.smartBear.pages.OrderPage;
import io.cucumber.java.en.Given;

import java.util.Map;

public class LoginWithTable_Steps {
    OrderPage orderPage = new OrderPage();

    @Given("user fills out all fields as below")
    public void user_fills_out_all_fields_as_below(Map<String,String> formInfo) {
        orderPage.customerName.sendKeys(formInfo.get("name"));
        orderPage.street.sendKeys(formInfo.get("street"));
        orderPage.city.sendKeys(formInfo.get("city"));
        orderPage.state.sendKeys(formInfo.get("state"));
        orderPage.zip.sendKeys(formInfo.get("zip"));

    }
    @Given("User selects {string} as card type and enters card information as below")
    public void user_selects_as_card_type_and_enters_card_information_as_below(String cardType, Map<String, String> cardInfo) {
       switch (cardType.toLowerCase()) {
           case "visa":
               orderPage.visaRadioButton.click();
               break;
           case "mastercard":
               orderPage.masterCard.click();
               break;
           case "American Express":
               orderPage.americanExpress.click();
       }
        orderPage.cardNr.sendKeys(cardInfo.get("cardNumber"));
        orderPage.expireDate.sendKeys(cardInfo.get("experationDate"));

    }
}
