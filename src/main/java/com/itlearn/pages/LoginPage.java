package com.itlearn.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.xml.xpath.XPath;

public class LoginPage {
    WebDriver driver;
    //constructor
    public LoginPage(WebDriver driver1)
    {
        this.driver = driver1;
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath="//a[contains(text(),'Log in')]")
    WebElement loginLink;

    @FindBy(xpath = "//input[@name=\"log\"]")
    WebElement usernameField;

    @FindBy(xpath = "//input[@name='pwd']")
    WebElement passwordField;

    @FindBy(xpath = "//input[@type=\"submit\"]")
    WebElement loginButton;

    public void loginPortal(String username,String password)
    {
        loginLink.click();
        usernameField.sendKeys(username);
        passwordField.sendKeys(password);
        loginButton.click();
    }

}
