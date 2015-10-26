package com.epam.arlouskaya.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Abstract class representation of a Page in the UI. Page object pattern
 */
public abstract class Page {

  protected WebDriver driver;

  /*
   * Constructor injecting the WebDriver interface
   * 
   * @param webDriver
   */
  public Page(WebDriver driver) {
    this.driver = driver;
  }

  public String getTitle() {
    return driver.getTitle();
  }

  public Boolean isElementPresent(By locator) {
    return this.driver.findElements(locator).size() > 0;
  }

  public void waitForElementIsDisplayed(By locator){
    Wait wait = new WebDriverWait(driver, 200);
    System.out.println("waiting..."+driver.getCurrentUrl()+ " title="+driver.getTitle());
    wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
  }
}
