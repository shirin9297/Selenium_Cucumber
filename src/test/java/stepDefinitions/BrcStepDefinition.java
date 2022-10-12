package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import utilities.ConfigReader;
import utilities.Driver;

public class BrcStepDefinition {
    @And("{string} username girer")
    public void usernameGirer(String istenenUrl) {
        Driver.getDriver().get(ConfigReader.getProperty(istenenUrl));
    }

    @Given("kullanici {string} anasayfasina gider")
    public void kullaniciAnasayfasinaGider(String arg0) {
    }

    @And("{string} password girer")
    public void passwordGirer(String arg0) {
    }

    @And("brc Login butonuna basar")
    public void brcLoginButonunaBasar() {
    }

    @Then("brc sayfasina giris yapilamadigini kontrol eder")
    public void brcSayfasinaGirisYapilamadiginiKontrolEder() {
    }

    @And("kullanici {int} sn bekler")
    public void kullaniciSnBekler(int arg0) {
    }
}
