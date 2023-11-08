package pages;

import static utilities.Driver.getLocalDriver;

import io.qameta.allure.Allure;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.io.ByteArrayInputStream;

public class Base_Page {
    public WebElement getElement(By locator){
        return getLocalDriver().findElement(locator);
    }
    public void click(By locator){
        getElement(locator).click();
    }
    public void inputText(By locator, String text){
        getElement(locator).sendKeys(text);
    }

    public String getElementText(By locator){
        return getElement(locator).getText();
    }

    public Boolean elementVisible(By locator){
        try {
            return  getElement(locator).isDisplayed();
        }catch (Exception e){
            return false;
        }
    }

    public void hoverOnElement(By locator) {
        Actions action = new Actions(getLocalDriver());
        action.clickAndHold(getElement(locator)).build().perform();

    }

    public void hover(By locator) {
        Actions action = new Actions(getLocalDriver());
        action.moveToElement(getElement(locator)).build().perform();
    }


    public void takeScreenShot(String name){
        Allure.addAttachment(name, new ByteArrayInputStream(((TakesScreenshot)getLocalDriver()).getScreenshotAs(OutputType.BYTES)));
    }

    public void scrollUD(By locator) {
        Actions action = new Actions(getLocalDriver());
        JavascriptExecutor js = (JavascriptExecutor) getLocalDriver();
        WebElement element = getLocalDriver().findElement(locator);
        js.executeScript("arguments[0].scrollIntoView(true);", element);
    }

    public void selectWithVisibleText(By selectLocator, String visibleText){
        Select select = new Select(getElement(selectLocator));
        select.selectByVisibleText(visibleText);
    }


}
