package com.smartBear.pages;

import com.smartBear.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {
    public BasePage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy (xpath = "//h1")
    public WebElement webOrdersHeading;

    @FindBy (xpath = "//a[.='View all orders']")
    public WebElement viewAllOrders;

    @FindBy(xpath = "//a[.='View all products']")
    public WebElement viewAllProducts;

    @FindBy(xpath = "//a[.='Order']")
    public WebElement orders;
}
