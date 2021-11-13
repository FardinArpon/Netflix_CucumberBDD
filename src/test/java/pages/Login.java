package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
    WebDriver driver;

    //###___Login-modals___###
    @FindBy(xpath = "//a[contains(text(),'Sign In')]")
    WebElement linkLogin;
    @FindBy(xpath = "//input[@id='id_userLoginId']")
    WebElement txtEmail;
    @FindBy(xpath = "//input[@id='id_password']")
    WebElement txtPassword;
    @FindBy(xpath = "//button[contains(text(),'Sign In')]")
    WebElement btnSubmit;
    @FindBy(xpath = "//a[contains(text(),'Sign Out')]")
    WebElement btnSignOut;

    //###___More options From Modal___###
    @FindBy(xpath = "//label[@for='bxid_rememberMe_true']")
    WebElement remBox;
    @FindBy(xpath = "//a[@class='link login-help-link']")
    WebElement needHelp;
    @FindBy(xpath = "//button[@class='recaptcha-terms-of-use--link-button']")
    WebElement learnMore;
    @FindBy(xpath = "//*[@class='svg-icon svg-icon-netflix-logo']")
    WebElement netflixHome;
    @FindBy(xpath = "//span[@class='fbBtnText']")
    WebElement fbLogin;
    @FindBy(xpath = "//a[contains(text(),'Sign up now')]")
    WebElement signUp;

    //###___Prompt-Message___###
    @FindBy(xpath = "//span[contains(text(),'Welcome back!')]")
    WebElement welcomeMsg;
    @FindBy(xpath = "//div[@class='ui-message-contents']")
    WebElement regError;
    @FindBy(xpath = "//div[@class='ui-message-contents']")
    WebElement passError;



    //####___Footer-Part___####
    @FindBy(xpath = "//a[@class='footer-top-a']")
    WebElement contactUs;
    @FindBy(xpath = "//span[contains(text(),'FAQ')]")
    WebElement FAQ;
    @FindBy(xpath = "//span[contains(text(),'Cookie Preferences')]")
    WebElement cookie;
    @FindBy(xpath = "//button[@class='save-preference-btn-handler onetrust-close-btn-handler']")
    WebElement saveCookie;
    @FindBy(xpath = "//span[contains(text(),'Help Center')]")
    WebElement helpCenter;
    @FindBy(xpath = "//span[contains(text(),'Corporate Information')]")
    WebElement corInfo;
    @FindBy(xpath = "//span[contains(text(),'Terms of Use')]")
    WebElement termsUse;
    @FindBy(xpath = "//span[contains(text(),'Privacy')]")
    WebElement privacy;


    public Login(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void doLogin(String email, String password) throws InterruptedException {

        linkLogin.click();
        txtEmail.sendKeys(email);
        txtPassword.sendKeys(password);
        remBox.click();
        btnSubmit.click();

    }

}