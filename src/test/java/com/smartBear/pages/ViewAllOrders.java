package com.smartBear.pages;

import com.smartBear.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class ViewAllOrders extends BasePage {
    public ViewAllOrders() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
    public String verifyName(String name) {
        WebElement nameInColumn = Driver.getDriver().findElement(By.xpath("//table/tbody/tr/td[.='" + name + "']"));
         String actualName = nameInColumn.getText();
        return actualName;
    }
}
