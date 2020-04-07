package learn.com.letskodeit.pages;

import learn.com.letskodeit.utility.Utility;
import org.openqa.selenium.By;

/*
Created By Bhavesh
*/public class HomePage extends Utility {

    By loginLink = By.xpath("//a[@class='navbar-link fedora-navbar-link']");
    By signUpBtn = By.xpath("//a[@class='btn btn-primary pull-right btn-lg']");

    public void clickOnLoginLink(){

        clickOnElement(loginLink);
    }
    public void clickOnSignUpButton(){

        clickOnElement(signUpBtn);
    }
}

