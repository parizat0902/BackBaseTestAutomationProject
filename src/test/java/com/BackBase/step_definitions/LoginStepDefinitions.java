package com.BackBase.step_definitions;

import com.BackBase.pages.HomePage;
import com.BackBase.pages.SignInPage;
import com.BackBase.utills.Browser;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginStepDefinitions {
    HomePage homePage = new HomePage();
    SignInPage signInPage = new SignInPage();

    static String expect;
    static String actual;

    @Given("user logged in")
    public void user_logged_in() {
        homePage.login();

    }

    @When("user click sign in")
    public void user_click_sign_in() {
        Browser.wait(3);//fixMe
        homePage.click_signIn();
    }

    @Then("user enter {string} and {string} and click sign in")
    public void user_enter_and_and_click_sign_in(String string, String string2) {
        signInPage.signIn(string, string2);
    }

    @Then("user click Global Feed")
    public void user_click_Global_Feed() {
        homePage.click_GlobalFeedButton();

    }

    @Then("user click on article title")
    public void user_click_on_article_title() {
        Browser.wait(2);//fixMe
        expect=homePage.get_firstArticleTitle();
        homePage.click_firstArticle();

    }

    @Then("user click on the favor button")
    public void user_click_on_the_favor_button() {
        Browser.wait(2);//fixMe
        homePage.click_favoriteButton();
    }

    @Then("user click userPage")
    public void user_click_userPage() {
        homePage.click_navigateBarUserName();
    }

    @Then("user clicked favor article")
    public void user_clicked_favor_article() {
        Browser.wait(5);//fixMe
        signInPage.click_favoritedArticles();

    }

    @Then("verify user should see the favor article")
    public void verify_user_should_see_the_favor_article() {
        Browser.wait(2);//fixMe
        actual = signInPage.get_favoriteFirstArticlesTitle();
        System.out.println("actual = " + actual);
        System.out.println("expect = " + expect);
        Assert.assertEquals(actual, expect);




    }
}


