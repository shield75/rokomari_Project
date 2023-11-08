package pages;

import org.openqa.selenium.By;

public class Login_Page extends Base_Page {
    public By loginPageButton = By.xpath("//a[normalize-space()='Sign in']");
    public String loginPageUrl = "https://www.rokomari.com/login";
    public String loginPageTitle = " Login To Rokomari | Rokomari.com ";
    public By inputAccountEmail = By.xpath("//input[@placeholder='Email or phone']");
    public By loginNextButton = By.xpath("//button[@id='js--btn-next']");
    public By otp = By.xpath("//input[@placeholder='OTP']");
    public By loginButton = By.xpath("//form[@id='otp-login-form']//button[@type='submit'][normalize-space()='Login']");

    public By googleButton = By.xpath("//button[normalize-space()='Google']");
    public By gmailAccountSelect = By.xpath("//div[normalize-space()='istiaq.sarjil2@gmail.com']");

    public By inputGmailAddress = By.xpath("//input[@id='identifierId']");
    public By clickNextToPassword = By.xpath("//span[normalize-space()='Next']");
    public By inputPassword = By.xpath("//input[@name='Passwd']");
    public By clickNextToLogin = By.xpath("//*[@id=\"passwordNext\"]/div/button/span");
    public By loggedInAccountDetails = By.xpath("//span[@class='user-name']");

}
