package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static utilities.Driver.getLocalDriver;

public class Home_Page extends Base_Page {
    public String homePageUrl = "https://www.rokomari.com/";
    public String homePageTitle = "Buy Book Online - Best Online Book Shop in Bangladesh | Rokomari.com";






    //Step 6 - Add to the cart any book
    public By addBookByLinkedText = By.linkText("শুভ্র সমগ্র");

    //scroll korar por book name locator diye always same thake na, that's why customized xpath create kora hoise.
    public By addBookByXPath = By.xpath("//section/div/div/div[4]");
    public By addToCartBook = By.xpath("//section/div/div/div[4]//div[1]//div[2]//button[1]");


    //Step 7 - Click Cart Icon
    public By cartIcon = By.cssSelector("#cart-icon");


    //Step 8 - Go to the Shipping page
    public By placeOrderButton = By.xpath("//span[normalize-space()='Place Order']");


    //Step 9 - Provide your Shipping Information
    public By inputPhone = By.xpath("//label[normalize-space()='Phone No']");
    public By inputAlternatePhone = By.xpath("//label[normalize-space()='Alternative Phone No']");
    public By selectCountry = By.xpath("//select[@id='js--country']");
    public By selectCity = By.xpath("//select[@id='js--city']");
    public By selectArea = By.xpath("//select[@id='js--area']");
    public By inputAddress = By.xpath("//label[normalize-space()='Address']");
    public By selectPaymentMethod = By.xpath("//img[@alt='Pay by Bkash']");


    //Step 10 - Log out
    public By logOut = By.xpath("//a[normalize-space()='Sign Out']");

    public WebDriver homePage(){
        getLocalDriver().get(homePageUrl);
        getLocalDriver().navigate().refresh();
        return getLocalDriver();
    }
}
