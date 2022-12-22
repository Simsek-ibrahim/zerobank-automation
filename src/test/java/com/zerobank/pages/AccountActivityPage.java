package com.zerobank.pages;

import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class AccountActivityPage extends BasePage{

    @FindBy(css = "#aa_accountId")
    public WebElement dropDownElement;

    @FindBy(xpath = "//table//tr//th")
    public List<WebElement> rowHeader;

    public void navigateToAccount(String account){

        Driver.get().findElement(By.linkText(account)).click();
    }
    }