package com.smartBear.pages;

import com.smartBear.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class OrderPage extends BasePage{
public OrderPage () {
}
@FindBy (xpath = "//select")
    public WebElement dropdown;

@FindBy (id = "ctl00_MainContent_fmwOrder_txtQuantity")
    public WebElement quantity;

@FindBy (id = "ctl00_MainContent_fmwOrder_txtUnitPrice")
    public WebElement pricePerUnite;

@FindBy (id = "ctl00_MainContent_fmwOrder_txtDiscount")
    public WebElement discount;

@FindBy (id = "ctl00_MainContent_fmwOrder_txtTotal")
    public WebElement total;

@FindBy (xpath = "//input[@value='Calculate']")
    public WebElement calculateButton;

@FindBy (id = "ctl00_MainContent_fmwOrder_txtName")
    public WebElement customerName;

@FindBy (id = "ctl00_MainContent_fmwOrder_TextBox2")
    public WebElement street;
@FindBy (id = "ctl00_MainContent_fmwOrder_TextBox3")
    public WebElement city;
@FindBy (id = "ctl00_MainContent_fmwOrder_TextBox4")
    public WebElement state;
@FindBy (id = "ctl00_MainContent_fmwOrder_TextBox5")
    public WebElement zip;
@FindBy (id = "ctl00_MainContent_fmwOrder_cardList_0")
    public WebElement visaRadioButton;
@FindBy (id = "ctl00_MainContent_fmwOrder_cardList_1")
    public WebElement masterCard;
@FindBy (id = "ctl00_MainContent_fmwOrder_cardList_2")
    public WebElement americanExpress;
@FindBy (id = "ctl00_MainContent_fmwOrder_TextBox6")
    public WebElement cardNr;
@FindBy (id = "ctl00_MainContent_fmwOrder_TextBox1")
    public WebElement expireDate;
@FindBy (xpath = "//input[@value='Reset']")
    public WebElement resetButton;
    @FindBy (id = "ctl00_MainContent_fmwOrder_InsertButton")
    public WebElement processButton;





public void selectFromDropdown(String str) {
    Select select = new Select(dropdown);
    select.selectByVisibleText(str);
}
}
