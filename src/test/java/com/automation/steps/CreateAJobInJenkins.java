package com.automation.steps;

import com.automation.pageobjects.JenkinksElements;
import com.automation.tools.Tools;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class CreateAJobInJenkins extends Tools {

    @And("^create new build job and configure it$")
    public void CreaANewBuildJobAndConfigureIt() throws Throwable {
        click(JenkinksElements.getTheNewItemButton());
        clear(JenkinksElements.getTheNameBox());
        sendKeys(JenkinksElements.getTheNameBox(), Tools.generateRandomName(7));
        click(JenkinksElements.getTheFreeStyleProjectOption());
        click(JenkinksElements.getTheOkButton());
        click(JenkinksElements.saveTheTask());
    }

    @Then("^make the build$")
    public void MakeTheBuild() throws Throwable{
        click(JenkinksElements.getTheBuildNowButton());
        Thread.sleep(5000);
        destroyDriver();
    }

}
