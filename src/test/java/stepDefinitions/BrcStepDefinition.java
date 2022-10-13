package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.BrcPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class BrcStepDefinition {
    BrcPage brcpage = new BrcPage();
    @Given("kullanici {string} anasayfasina gider")
    public void kullaniciAnasayfasinaGider(String istenenUrl) {
        Driver.getDriver().get(ConfigReader.getProperty(istenenUrl));
    }
    @And("{string} username girer")
    public void usernameGirer(String username) {
       brcpage.email.sendKeys(username);
    }

    @And("{string} password girer")
    public void passwordGirer(String password) {
        brcpage.passwordTextBox.sendKeys(password);
    }

    @And("brc Login butonuna basar")
    public void brcLoginButonunaBasar() {
        brcpage.login.click();
    }

    @Then("brc sayfasina giris yapilamadigini kontrol eder")
    public void brcSayfasinaGirisYapilamadiginiKontrolEder() {
        Assert.assertTrue(brcpage.ikinciLogin.isDisplayed());
    }


    @And("kullanici {int} sn bekler")
    public void kullaniciSnBekler(int seconds) {
        ReusableMethods.waitFor(seconds);
    }
}
