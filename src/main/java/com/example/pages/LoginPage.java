package com.example.pages;

import net.serenitybdd.annotations.DefaultUrl;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import net.serenitybdd.core.pages.PageObject;

@DefaultUrl("https://the-internet.herokuapp.com/login")
public class LoginPage extends PageObject{

    private WebDriver driver;
    String usernameField = "//input[@id='username']";
    String passwordField = "//input[@id='password']";
    String loginBtn = "//button[@type='submit']";
    String errorUsernameMsg = "//div[@class='flash error']";
    String errorPasswordMsg = "//div[@class='flash error']";
    String loginTitle = "//h2[contains(text(),'Login Page')]";
    String successLoginTitle = "//h2[contains(text(),'Secure Area')]";

    public LoginPage(WebDriver driver) {
        this.driver = driver;

    }

    //visibility
    public void seeLoginTitle(){
        find(By.xpath(loginTitle)).waitUntilVisible().shouldBeVisible();
    }

    public void seeErrorUsernameMsg(){
        find(By.xpath(errorUsernameMsg)).waitUntilVisible().shouldBeVisible();
    }

    public void seeErrorPasswordMsg(){
        find(By.xpath(errorPasswordMsg)).waitUntilVisible().shouldBeVisible();
    }

    public void seeSuccessLoginTitle(){
        find(By.xpath(successLoginTitle)).waitUntilVisible().shouldBeVisible();
    }

    //click
    public void clickLoginBtn(){
        find(By.xpath(loginBtn)).click();
    }

    //type
    public void fillUsernameField(String username){
        find(By.xpath(usernameField)).type(username);
    }

    public void fillPasswordField(String password){
        find(By.xpath(passwordField)).type(password);
    }
}