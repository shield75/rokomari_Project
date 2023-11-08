package pages;

import org.openqa.selenium.By;

public class Cart_Page extends Base_Page{
    public By book1 = By.xpath("/html/body/div[6]/div/div/div/section[1]/div[2]/div/div[3]");
    public By book2 = By.xpath("//div[@title='তোমাদের এই নগরে হুমায়ূন আহমেদ']");
    public By buttonBook1 = By.xpath("//div[@title='মেঘের ওপর বাড়ি হুমায়ূন আহমেদ']//div[1]//div[2]//button[1]");
    public By buttonBook2 = By.xpath("//div[@title='তোমাদের এই নগরে হুমায়ূন আহমেদ']//div[1]//div[2]//button[1]");
    public By cartButton = By.xpath("//a[@id='js-cart-menu']");

    public By orderButton = By.xpath("//a[@id='js-continue-to-shipping']");

}
