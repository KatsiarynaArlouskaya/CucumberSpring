package com.epam.arlouskaya.runner;

import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Katsiaryna_Arlouskay on 10/26/2015.
 */
public class MyStepdefs {
//    private AbstractApplicationContext ctx;
  /*  @Before
    public void setUp() {
        ctx = new ClassPathXmlApplicationContext("beans.xml");
    }*/

    @Given("^I am on website$")
    public void I_am_on_https_gmail_com_website() throws Throwable {
     //   WebDriver driver = (WebDriver) ctx.getBean("driverProvider");
        WebDriver driver = new FirefoxDriver();
                driver.get("https://gmail.com/");
    }


    @When("^I login as '(.+)' with password '(.+)'$")
    public void I_login_as_user_with_password_pass_(String arg1, String arg2) throws Throwable {
        // Express the Regexp above with the code you wish you had
        throw new PendingException();
    }

    @And("^I send email to '(.+)'$")
    public void I_send_email_to_user_(String arg1) throws Throwable {
        // Express the Regexp above with the code you wish you had
        throw new PendingException();
    }

    @And("^I mark latter from '(.+)' as a spam$")
    public void I_mark_latter_from_user_as_a_spam(String arg1) throws Throwable {
        // Express the Regexp above with the code you wish you had
        throw new PendingException();
    }

    @Then("^Check, I have a spam letter from '(.+)'$")
    public void Check_I_have_a_spam_letter_from_user_(String arg1) throws Throwable {
        // Express the Regexp above with the code you wish you had
        throw new PendingException();
    }

    @Then("^All good$")
    public void All_good() throws Throwable {
        Assert.assertTrue(true);
    }
}
