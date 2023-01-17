package com.qaprosoft.carina.demo;

import com.qaprosoft.carina.core.foundation.IAbstractTest;
import com.qaprosoft.carina.demo.web.HomePage;
import com.qaprosoft.carina.demo.web.SingUpPage;
import com.zebrunner.carina.utils.R;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WebTest implements IAbstractTest {

    @Test
    public void loginTest() {
        HomePage homePage = new HomePage(getDriver());
        homePage.open();
        Assert.assertTrue(homePage.isPageOpened(), "Page is not opened");
        SingUpPage singUpLogInPage = homePage.getMenu().clickSingUpLogInBtn();
        Assert.assertTrue(singUpLogInPage.isPageOpened(), "Page is not opened");
        pause(5);
        singUpLogInPage.typeEmail(R.TESTDATA.get("email"));
        singUpLogInPage.typePassword(R.TESTDATA.get("password"));
        pause(5);
        singUpLogInPage.clickLogInBtn();
    }

    // Hello World
    // Wowwwww
}
