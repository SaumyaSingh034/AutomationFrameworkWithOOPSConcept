package myPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class BasePage extends Page{

    @Override
    public String getPageTitle() {
        return null;
    }

    @Override
    public String getPageHeader(By locator) {
        return null;
    }

    @Override
    public WebElement getElement(By locator) {
        return null;
    }

    @Override
    public void waitForElementToBeVisible(By locator) {

    }

    @Override
    public void waitForPageTitle(String title) {

    }
}
