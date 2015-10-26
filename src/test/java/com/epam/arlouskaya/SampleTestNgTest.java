package com.epam.arlouskaya;

import org.openqa.selenium.WebDriver;

import org.springframework.context.support.AbstractApplicationContext;

import com.epam.arlouskaya.pages.HomePage;

public class SampleTestNgTest  {

  private HomePage homepage;
  private AbstractApplicationContext ctx;
 // WebDriver driver;

/*
    @BeforeSuite
    public void initContext() {
        ctx = new ClassPathXmlApplicationContext("beans.xml");

    }



  @Test
  public void testHomePageHasAHeader() {
 //   WebDriver driver = FirefoxDriverProvider.getFirefoxDriver();
    WebDriver driver = (WebDriver) ctx.getBean("driverProvider");
    driver.get("https://gmail.com/");
    try {
      Thread.sleep(2000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }

  @Test
  public void test2() {
   // WebDriver driver = FirefoxDriverProvider.getFirefoxDriver();
      WebDriver driver = (WebDriver) ctx.getBean("driverProvider");
    driver.get("https://tut.by");
    try {
      Thread.sleep(2000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }
*/

}
