package com.BackBase.utills;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class Browser {
    private static WebDriverWait wait = new WebDriverWait(Driver.getDriver(),8);

    public static void wait(int sec){
        try {
            Thread.sleep(1000 * sec);
        } catch (InterruptedException e) {
            System.out.println("Browser.wait: time out error");
        }
    }

    public static void waitElementToBeClickableAndClick(WebElement element){
        wait.until(ExpectedConditions.elementToBeClickable(element)).click();
    }

    public static void waitToVisible(List<WebElement> element){
        wait.until(ExpectedConditions.visibilityOfAllElements(element));
    }

    public static void waitElementToBeClickableJS(WebElement element){
        wait.until(ExpectedConditions.elementToBeClickable(element));
        ((JavascriptExecutor)(Driver.getDriver())).executeScript("arguments[0].click()",element);
    }

    public static void waitEnterTextWhenVisible(WebElement element, String text){
        wait.until(ExpectedConditions.visibilityOf(element));
        element.clear();
        element.sendKeys(text);
        wait.until(ExpectedConditions.attributeToBe(element, "value", text));
        System.out.println("Entering text: " + text);
    }

    public static void scrollToJS(WebElement element) {
        ((JavascriptExecutor) Driver.getDriver()).executeScript("arguments[0].scrollIntoView(true);", element);
    }

    public static void scrollTo(WebElement element) {
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(element);
        actions.perform();
    }

}


