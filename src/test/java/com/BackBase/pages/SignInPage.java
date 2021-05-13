package com.BackBase.pages;

import com.BackBase.utills.Browser;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignInPage extends BasePage{
    @FindBy(xpath ="//input[@type='text']")
    public WebElement inputUsername;

    @FindBy(xpath = "//input[@type='password']")
    public WebElement inputPassword;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement signInButton;

    @FindBy(xpath = "//a[.='Favorited Articles']")
    private WebElement favoritedArticles;

    @FindBy(xpath = "//div[@class='article-preview']//a[@class='preview-link']//h1")
    private WebElement favoriteFirstArticlesTitle;



    public void signIn(String username, String password){
        inputUsername.sendKeys(username);
        inputPassword.sendKeys(password);
        Browser.wait(1);
        signInButton.click();

    }
    public void click_favoritedArticles(){
        Browser.waitElementToBeClickableAndClick(favoritedArticles);
    }

    public String get_favoriteArticlesTitle(){

        return favoritedArticles.getText();


    }

    public String get_favoriteFirstArticlesTitle(){
        Browser.wait(2);
        return favoriteFirstArticlesTitle.getText();


    }


}
