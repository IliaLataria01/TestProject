package com.qaprosoft.carina.demo.web;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class SingUpPage extends AbstractPage {
    public SingUpPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "//*[@class ='login-form']//*[@name='email']")
    private ExtendedWebElement emailTextField;
    @FindBy(xpath = "//*[@name='password']")
    private ExtendedWebElement passwordTextField;
    @FindBy(xpath = "//*[text()='Login']")
    private ExtendedWebElement logInBtn;

    @FindBy(xpath = "//*[@class='nav navbar-nav']")
    private Menu menu;


    @Override
    public boolean isPageOpened() {
        return emailTextField.isElementPresent();
    }

    public void typeEmail(String email) {
        emailTextField.type(email);
    }

    public void typePassword(String password) {
        passwordTextField.type(password);
    }
    public void clickLogInBtn() {
        logInBtn.click();
    }
}
