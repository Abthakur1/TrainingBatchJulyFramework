package org.abstractComponents;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AbstractComponents {
    public WebDriver driver;

    public AbstractComponents(WebDriver driver){
        this.driver = driver;
    }

    // wait for element to load - explicit wait
    public void waitForElementToLoad(WebElement ele, int timeout){
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
            wait.until(ExpectedConditions.visibilityOf(ele));
        } catch (Exception e) {
            System.out.println("Element did not load with the provided timeout:"+ timeout + e.getMessage());
        }
    }

    // wait for element to be clickable
    public void waitForElementToBeClickable(WebElement ele, int timeout){
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
            wait.until(ExpectedConditions.elementToBeClickable(ele));
        } catch (Exception e) {
            System.out.println("Element is not in the clickable state:"+ timeout + e.getMessage());
        }
    }

    // to click on buttons. element
    public void clickOnElement(WebElement ele, int timeout){
        this.waitForElementToLoad(ele,timeout);
        this.waitForElementToBeClickable(ele,timeout);

        try {
            ele.click();
        } catch (Exception e) {
            System.out.println("Element could not be clicked"+ e.getMessage());
        }
    }

    // to enter text in the text Field
    public void enterTextInTheTextField(WebElement ele, int timeout, String text){
        this.waitForElementToLoad(ele,timeout);
        ele.sendKeys(text);
    }
}
