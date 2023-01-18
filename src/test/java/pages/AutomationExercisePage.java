package pages;

import io.cucumber.java.cy_gb.A;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import javax.xml.xpath.XPath;

public class AutomationExercisePage {

    public AutomationExercisePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//i[@class='fa fa-lock']")
    public WebElement signUpLink;

    @FindBy(xpath = "//input[@name='name']")
    public  WebElement isimKutusu;

    @FindBy(xpath = "(//input[@name='email'])[2]")
    public WebElement emailKutusu;

    @FindBy(xpath = "/button[text()='Signup']")
    public WebElement signUpButon;

    @FindBy(xpath = "//*[@value='Mr']")
    public WebElement mrRadioButon;

    @FindBy(xpath = "//*[text()='Create Account']")
    public WebElement createAccountButon;

    @FindBy(xpath = "//b[text()='Account Created!']")

    public WebElement createAccountElementYazisi;


}
