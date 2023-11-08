package pages;


import org.openqa.selenium.By;

public class Writers_Page extends Base_Page {
    //Step 2 - Select লেখক from the menu
    public By selectWriter = By.xpath("//a[@id='js--authors']");

    //Step 3 - Select হুমায়ুন আহমেদ
    public By selectHumayunAhmed = By.xpath("//a[contains(text(),'হুমায়ূন আহমেদ')]");

    //Step 4 - Filter  Categories like সমকালীন উপন্যাস, রচনা সংকলন ও সমগ্র
    public By filterSomokalin = By.xpath("//div[contains(@data-search-key,'সমকালীন উপন্যাস Contemporary Novel')]");
    public By filterRochona = By.xpath("//label[contains(text(),'রচনা সংকলন ও সমগ্র')]");

    //Step 5 - Scroll Down and go to Next Page (IF Have)

    public By scrollElement = By.xpath("//div[@title='আগুনের পরশমণি হুমায়ূন আহমেদ']");
    public By nextButton = By.xpath("//a[normalize-space()='Next']");
}
