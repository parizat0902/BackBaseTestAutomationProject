package com.BackBase.pages;

import com.BackBase.utills.ConfigurationReader;
import com.BackBase.utills.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
    @FindBy(xpath = "//a[.='Sign in']")
    private WebElement signIn;

    @FindBy(xpath = "/html/body/app-root/app-home/div/div[2]/div/div[1]/div/ul/li[2]/a")
    private WebElement globalFeedButton;

    @FindBy(xpath = "//app-article-list//app-article-list-item[1]//button[@class='btn btn-sm pull-xs-right btn-primary']")
    private WebElement likeButton;

@FindBy(xpath ="//div[@class='article-preview']//a[@class='preview-link']//h1")
private WebElement firstArticle;

    @FindBy(xpath = "//div[1]/div/app-article-meta/div/span[2]/button[2]")
    private WebElement favoriteButton;

    @FindBy(xpath = "//ul/li[2]/a")
    private WebElement navigateBarUserName;




    public void login() {
        String user = ConfigurationReader.getProperty("userName");
        String password = ConfigurationReader.getProperty("password");
        Driver.getDriver().get("https://" + user + ":" + password + "@qa-task.backbasecloud.com/");

    }

    public void click_signIn() {
        signIn.click();
    }

    public void click_GlobalFeedButton() {
        globalFeedButton.click();

    }
    public void click_firstArticle(){
        firstArticle.click();
    }

    public String get_firstArticleTitle(){
       return firstArticle.getText();
    }
    public void click_favoriteButton() {
        favoriteButton.click();

    }

    public void click_navigateBarUserName() {
        navigateBarUserName.click();

    }
}
