package com.smartBear.pages;

import com.smartBear.utilities.ConfigurationReader;
import com.smartBear.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
   public LoginPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy (xpath = "//input[@type='text']")
    public WebElement userNameInput;

    @FindBy(xpath = "//input[@type='password']")
    public WebElement passwordInput;

    @FindBy (xpath = "//input[@type='submit']")
    public WebElement LoginButton;

    public void loginToSmartBear() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        userNameInput.sendKeys(ConfigurationReader.getProperty("username"));
        passwordInput.sendKeys(ConfigurationReader.getProperty("password"));
        LoginButton.click();
    }
}
