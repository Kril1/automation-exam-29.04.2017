package com.automation.pageobjects;

import com.automation.tools.Tools;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/**
 * Created by tsvetan.karchev on 08/11/2016.
 */
public class JenkinksElements extends Tools {

    static synchronized public WebElement getTheUserNameBox() {
        return findElementBy(By.id("j_username"));
    }

    static synchronized public WebElement getThePasswordBox() {
        return findElementBy(By.name("j_password"));
    }

    static synchronized public WebElement getTheLogInButton(){
        return findElementBy(By.id("yui-gen1-button"));
    }

    static synchronized public WebElement getTheLogOutButton(){
        return findElementBy(By.xpath("/html/body/div[2]/div[1]/div[2]/span/a[2]/b"));
    }

    static synchronized public WebElement getTheNewItemButton (){
        return findElementBy(By.className("task-link"));
    }

    static synchronized public WebElement getTheNameBox (){
        return findElementBy(By.id("name"));
    }

    static synchronized public WebElement getTheFreeStyleProjectOption(){
        return findElementBy(By.className("hudson_model_FreeStyleProject"));
    }

    static synchronized public WebElement getTheOkButton(){
        return findElementBy(By.id("ok-button"));
    }

    static synchronized public WebElement saveTheTask (){
        return findElementBy(By.id("yui-gen40-button"));
    }

    static synchronized public WebElement getTheBuildNowButton(){
        return findElementBy(By.className("task-link"));
    }

}
