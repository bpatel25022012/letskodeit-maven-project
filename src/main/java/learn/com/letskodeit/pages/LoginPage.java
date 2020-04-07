package learn.com.letskodeit.pages;

import learn.com.letskodeit.utility.Utility;
import org.openqa.selenium.By;

/*
Created By Bhavesh
*/public class LoginPage extends Utility {

    By emailField = By.xpath("//input[@name='user[email]");
    By passwordField = By.id("user_password");
    By welcomeText = By.xpath("//h1[@class='text-center']");

    public String getWelcomeText(){

        return getTextFromElement(welcomeText);
    }
    public void setEmailField(){
        sendTextToElement(emailField,"tiger123@gmail.com");
    }
    public void setPasswordField(){
        sendTextToElement(passwordField,"Tiger123");
    }
}
