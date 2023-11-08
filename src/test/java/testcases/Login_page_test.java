package testcases;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;
import pages.*;
import utilities.Driver;

public class Login_page_test extends Driver {

    Login_Page l1 = new Login_Page();
    Home_Page h1 = new Home_Page();
    Writers_Page w1 = new Writers_Page();
    Cart_Page c1 = new Cart_Page();
    Shipping_Page s1 = new Shipping_Page();

    @Test
    public void test1() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) getLocalDriver();
        h1.homePage();
        l1.takeScreenShot("Home Page");
        l1.click(l1.loginPageButton);
        l1.takeScreenShot("Sign-in Page");
        l1.click(l1.googleButton);
        l1.inputText(l1.inputGmailAddress,"testrokomari@gmail.com");
        l1.click(l1.clickNextToPassword);
        l1.inputText(l1.inputPassword, "testrokomari123");
        l1.click(l1.clickNextToLogin);
        Thread.sleep(2000);
        getLocalDriver().navigate().refresh();
        l1.takeScreenShot("Home Page After Sign-in");

        w1.hoverOnElement(w1.selectWriter);
        w1.takeScreenShot("Hovering on Writer Section");
        Thread.sleep(2000);
        w1.click(w1.selectHumayunAhmed);
        w1.takeScreenShot("Selecting Writer");
        Thread.sleep(2000);
        w1.takeScreenShot("Writer's Section");
        w1.click(w1.filterSomokalin);
        Thread.sleep(2000);
        js.executeScript("window.scroll(0,600)");
        Thread.sleep(2000);
        w1.click(w1.filterRochona);
        w1.takeScreenShot("Filtering Categories");
        Thread.sleep(2000);
        js.executeScript("window.scroll(0,4200)");
        Thread.sleep(3000);
        w1.click(w1.nextButton);
        Thread.sleep(5000);

        c1.hoverOnElement(c1.book1);
        c1.click(c1.buttonBook1);
        Thread.sleep(2000);
        js.executeScript("window.scroll(0,600)");
        Thread.sleep(2000);
        /*c1.hoverOnElement(c1.book2);
        Thread.sleep(2000);
        c1.click(c1.buttonBook2);*/
        js.executeScript("window.scroll(600,0)");
        c1.takeScreenShot("Adding Books to Cart");
        Thread.sleep(2000);
        c1.click(c1.cartButton);
        Thread.sleep(2000);
        c1.takeScreenShot("Cart Page");
        c1.click(c1.orderButton);
        Thread.sleep(5000);

        s1.inputText(s1.inputName,"Sarj");
        s1.inputText(s1.inputPhone,"01234567890");
        s1.inputText(s1.inputAlternatePhone,"09876543210");
        s1.selectWithVisibleText(s1.selectCountry,"Bangladesh");
        s1.selectWithVisibleText(s1.selectCity,"ঢাকা");
        s1.selectWithVisibleText(s1.selectArea,"শাহজাদপুর");
        s1.inputText(s1.inputAddress,"Shahjadpur, Dhaka.");
        js.executeScript("window.scroll(0,700)");
        s1.takeScreenShot("Shipping Page");
        Thread.sleep(2000);
        s1.click(s1.selectPaymentMethod);
        Thread.sleep(1000);
        s1.click(s1.checkbox);
        s1.takeScreenShot("Payment Section");
        Thread.sleep(2000);
        s1.click(s1.loggedInAccountDetails);
        s1.click(s1.logOut);
        Thread.sleep(2000);
    }

}
