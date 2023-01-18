package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.AutomationExercisePage;
import utilities.Driver;

public class AutomationExerciseStepdefinitions {

    AutomationExercisePage automationExercisePage = new AutomationExercisePage();
    String kullaniciEmail;
    String kullaniciIsim;
    String password;
    Faker faker = new Faker();
    Actions actions;

    @And("user signUpLink linkine tiklar")
    public void userSignUpLinkLinkineTiklar() {
        automationExercisePage.signUpLink.click();

    }

    @And("user Create and account bolumune email adresi girer")
    public void userCreateAndAccountBolumuneEmailAdresiGirer() {
        kullaniciEmail = faker.internet().emailAddress();
        kullaniciIsim = faker.name().firstName();

        automationExercisePage.isimKutusu.sendKeys(kullaniciIsim);
        automationExercisePage.emailKutusu.sendKeys(kullaniciEmail);

    }

    @Given("Create an Account butonuna basar")
    public void create_an_account_butonuna_basar() {
        automationExercisePage.signUpButon.click();
    }

    @Given("user kisisel bilgilerini ve iletisim bilgilerini girer")
    public void user_kisisel_bilgilerini_ve_iletisim_bilgilerini_girer() {
        actions = new Actions(Driver.getDriver());
        password = faker.internet().password();
        actions.click(automationExercisePage.mrRadioButon)
                .sendKeys(Keys.TAB)
                .sendKeys(kullaniciIsim)
                .sendKeys(Keys.TAB)
                .sendKeys(password)
                .sendKeys(Keys.TAB)
                .sendKeys("15")
                .sendKeys(Keys.TAB)
                .sendKeys("May")
                .sendKeys(Keys.TAB)
                .sendKeys("1998")
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys(kullaniciIsim)
                .sendKeys(Keys.TAB)
                .sendKeys(faker.name().lastName())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.company().name())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.address().fullAddress())
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys("United states")
                .sendKeys(Keys.TAB)
                .sendKeys("Ankara")
                .sendKeys(Keys.TAB)
                .sendKeys("Cebeci")
                .sendKeys(Keys.TAB)
                .sendKeys("06065")
                .sendKeys(Keys.TAB)
                .sendKeys(faker.phoneNumber().cellPhone())
                .perform();


    }

    @And("user CreateAccount butonuna basar")
    public void userCreateAccountButonunaBasar() {
        automationExercisePage.createAccountButon.click();

    }


    @Then("hesap olustugunu test edelim")
    public void hesapOlustugunuTestEdelim() {
        Assert.assertTrue(automationExercisePage.createAccountElementYazisi.isDisplayed());
    }



}
