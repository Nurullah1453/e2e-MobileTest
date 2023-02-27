package pages;

import io.appium.java_client.pagefactory.AppiumFieldDecorator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

import java.time.Duration;

public class Allpages {

    public Allpages(){

        PageFactory.initElements(new AppiumFieldDecorator(Driver.getAppiumDriver(), Duration.ofSeconds(15)),this);

    }
    @FindBy(xpath = "//*[@aria-label='Agree and close: Agree to our data processing and close']")
    public WebElement cookie;

    @FindBy(xpath = "//span[@class='allfont allfont-perso']")
    public WebElement myAccountButton;

    @FindBy(xpath = "//*[text()='My Alltricks']")
    public WebElement myAlltrickLink;

    @FindBy(xpath ="//input[@id='email']")
    public WebElement emailAddressKutusu;

    @FindBy(xpath = "//button[@class='ant-btn atds-btn']")
    public WebElement nextButton;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement passwordKutusu;

    @FindBy(xpath = "//span[text()='Log in']")
    public WebElement loginLink;



}