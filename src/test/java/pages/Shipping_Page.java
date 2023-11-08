package pages;

import org.openqa.selenium.By;

public class Shipping_Page extends Base_Page {
    public By inputName = By.xpath("(//input[@id='name'])[1]");
    public By inputPhone = By.xpath("(//input[@id='phone'])[1]");
    public By inputAlternatePhone = By.xpath("(//input[@id='phone2'])[1]");
    public By selectCountry = By.xpath("//select[@id='js--country']");
    public By selectCity = By.xpath("//select[@id='js--city']");
    public By selectArea = By.xpath("//select[@id='js--area']");
    public By inputAddress = By.xpath("(//textarea[@id='address'])[1]");
    public By selectPaymentMethod = By.xpath("//label[@for='B_KASH']");
    public By checkbox = By.xpath("//label[contains(text(),'এই শর্তগুলো মেনে অর্ডার প্রদান করছি।')]");

    public By loggedInAccountDetails = By.xpath("//span[@class='user-name']");
    public By logOut = By.xpath("//a[normalize-space()='Sign Out']");


}
