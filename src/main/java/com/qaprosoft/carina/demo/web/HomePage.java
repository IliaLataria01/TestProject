package com.qaprosoft.carina.demo.web;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class HomePage extends AbstractPage {
    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[@class='logo pull-left']")
    private ExtendedWebElement logo;
    @FindBy(xpath = "//*[@class='nav navbar-nav']")
    private Menu menu;

    @FindBy(xpath = "//*[@class ='left control-carousel hidden-xs']")
    private ExtendedWebElement bannerPageLeftSwiper;

    @FindBy(xpath = "//*[@class='carousel-inner']/div[contains(@class, item)][%d]")
    private ExtendedWebElement banners;
    @FindBy(xpath = "//*[@class ='right control-carousel hidden-xs']")
    private ExtendedWebElement bannerPageRightSwiper;
    public boolean isBannerChanged(int i) {
        return banners.format(i).isVisible();
    }

    public Menu getMenu() {
        return menu;
    }
    @Override
    public boolean isPageOpened() {
        return logo.isElementPresent();
    }


    public void clickLeftSwiper() {
        bannerPageLeftSwiper.click();
    }

    public void clickRightSwiper() {
        bannerPageRightSwiper.click();
    }

}
