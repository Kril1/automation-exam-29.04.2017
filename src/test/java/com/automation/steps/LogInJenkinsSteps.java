package com.automation.steps;

import com.automation.pageobjects.JenkinksElements;
import com.automation.tools.Tools;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LogInJenkinsSteps extends Tools {

    String userNameAndPassword = "ceco";

    @Given("^user with access to Jenkins$")
    public void userWithAccesToJenkins() throws Throwable {
        buildDriver();
        Thread.sleep(1000);
        clear (JenkinksElements.getTheUserNameBox());
        sendKeys(JenkinksElements.getTheUserNameBox(),userNameAndPassword);
        clear(JenkinksElements.getThePasswordBox());
        sendKeys(JenkinksElements.getThePasswordBox(), userNameAndPassword);
    }

    @When("^login in Jenkins$")
    public void LogInJenkins() throws Throwable {
        click(JenkinksElements.getTheLogInButton());
        Thread.sleep(1000);
//        assertTextPresent("New Item");
    }

    @Then("^logout from Jenkins$")
    public void logOutFromJenkins() throws Throwable{
        click(JenkinksElements.getTheLogOutButton());
        Thread.sleep(3000);
        destroyDriver();
    }

}
