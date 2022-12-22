package com.zerobank.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PayBillsPage extends  BasePage{

    @FindBy(id = "sp_payee")
    public WebElement payeeInput;

    @FindBy(id = "sp_account")
    public WebElement accountInput;

    @FindBy(id = "sp_amount")
    public WebElement amountInput;

    @FindBy(id = "sp_date")
    public WebElement dateInput;

    @FindBy(id = "sp_description")
    public WebElement descriptionInput;

    @FindBy(id = "pay_saved_payees")
    public WebElement payBtn;

    @FindBy(id = "alert_content")
    public WebElement messageText;

    @FindBy(id = "np_new_payee_name")
    public WebElement payeeName;

    @FindBy(id = "np_new_payee_address")
    public WebElement address;

    @FindBy(id = "np_new_payee_account")
    public WebElement account;

    @FindBy(id = "np_new_payee_details")
    public WebElement paydetails;

    @FindBy(id = "add_new_payee")
    public WebElement newPayBtn;

    public void payeeInput(String PayeeName,String PayeeAddress,String Account,String PayeeDetails){

        payeeName.sendKeys(PayeeName);
        address.sendKeys(PayeeAddress);
        account.sendKeys(Account);
        paydetails.sendKeys(PayeeDetails);

        newPayBtn.click();

    }

}
