package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.Allpages;
import utils.ConfigReader;
import utils.Driver;

public class HomePageStepDefs {

    Allpages allpages = new Allpages();


    @Given("Alltricks anasayfasina git")
    public void alltricks_anasayfasina_git() throws InterruptedException {

        Driver.getAppiumDriver().get(ConfigReader.getProperty("Url"));

        Thread.sleep(2000);
        allpages.cookie.click();
        Thread.sleep(3000);


    }

    @Given("Profil sekmesine geç")
    public void profil_sekmesine_geç() throws InterruptedException {
        allpages.myAccountButton.click();
        Thread.sleep(2000);
        allpages.myAlltrickLink.click();
        Thread.sleep(3000);
    }

    @Then("Adresim kismina emaili gir")
    public void adresim_kismina_emaili_gir() throws InterruptedException {
        Thread.sleep(2000);
        allpages.emailAddressKutusu.click();
        Thread.sleep(1000);
        allpages.emailAddressKutusu.sendKeys(ConfigReader.getProperty("gecerliMail"));
        allpages.nextButton.click();

    }


    @Then("Gecerli sifre gir ve giris yap")
    public void gecerliSifreGirVeGirisYap() throws InterruptedException {
        Thread.sleep(2000);
        allpages.passwordKutusu.sendKeys(ConfigReader.getProperty("gecerliPassword"));
        allpages.loginLink.click();

    }
}