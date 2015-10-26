package com.epam.arlouskaya.runner;

import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Katsiaryna_Arlouskay on 10/26/2015.
 */
public class MyStepdefs {
    private AbstractApplicationContext ctx;
    @Before
    public void setUp() {
        ctx = new ClassPathXmlApplicationContext("beans.xml");
    }

    @Given("^I am on 'https://gmail.com/' website$")
    public void I_am_on_https_gmail_com_website() throws Throwable {
        WebDriver driver = (WebDriver) ctx.getBean("driverProvider");
        driver.get("https://gmail.com/");
    }

    @When("^I login as '<user(\\d+)>' with password '<pass(\\d+)>'$")
    public void I_login_as_user_with_password_pass_(int arg1, int arg2) throws Throwable {
    }

    @And("^I send email to '<user(\\d+)>'$")
    public void I_send_email_to_user_(int arg1) throws Throwable {
    }

    @And("^I mark latter from '<user(\\d+)>' as a spam$")
    public void I_mark_latter_from_user_as_a_spam(int arg1) throws Throwable {
    }

    @And("^Check, I have a spam letter from '<user(\\d+)>'$")
    public void Check_I_have_a_spam_letter_from_user_(int arg1) throws Throwable {
    }
}
