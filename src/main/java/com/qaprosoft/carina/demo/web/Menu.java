package com.qaprosoft.carina.demo.web;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractUIObject;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class Menu extends AbstractUIObject {

    @FindBy(xpath = "//*[text()=' Signup / Login']")
    private ExtendedWebElement singUpLogInBtn;

    @FindBy(xpath = "//*[text()=' Products']")
    private ExtendedWebElement productsBtn;
    @FindBy(xpath = "//*[text()=' Logged in as ']/b[text()='%s']")
    private ExtendedWebElement messageAboutAccount;
    @FindBy(xpath = "//*[text()=' Cart']")
    private ExtendedWebElement cartBtn;

    @FindBy(xpath = "//*[text()=' Contact us']")
    private ExtendedWebElement contactUsBtn;

    public Menu(WebDriver driver) {
        super(driver);
    }

    public Menu(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }

    public SingUpPage clickSingUpLogInBtn() {
        singUpLogInBtn.click();
        return new SingUpPage(getDriver());
    }

    public boolean isAccountDisplayed(String userName) {
        return messageAboutAccount.format(userName).isElementPresent();
    }

}