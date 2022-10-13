package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.DatabaseOutlinePages;
import utilities.Driver;

public class DatabaseOutlineStepDef {
    DatabaseOutlinePages page = new DatabaseOutlinePages();
    Actions actions = new Actions(Driver.getDriver());
    @When("kullanici {string} adresine gider")
    public void kullaniciAdresineGider(String istenenUrl) {
        Driver.getDriver().get(istenenUrl);
    }
    @Then("new butonuna basar")
    public void newButonunaBasar() {
     page.newButton.click();
    }

    @And("isim bolumune {string} girer")
    public void isimBolumuneGirer(String istenenIsim) {
        page.firstName.sendKeys(istenenIsim);
    }

    @And("soyisim bolumune {string} girer")
    public void soyisimBolumuneGirer(String lastname) {
        actions.sendKeys(Keys.TAB).sendKeys(lastname).perform();
    }

    @And("position bolumune{string} girer")
    public void positionBolumuneGirer(String position) {
        actions.sendKeys(Keys.TAB).sendKeys(position).perform();
    }

    @And("ofis bolumune {string} girer")
    public void ofisBolumuneGirer(String ofisbilgisi) {
        actions.sendKeys(Keys.TAB).sendKeys(ofisbilgisi).perform();
    }

    @And("extension bolumune {string} girer")
    public void extensionBolumuneGirer(String extension) {
        actions.sendKeys(Keys.TAB).sendKeys(extension).perform();
    }

    @And("startdate bolumune{string}  girer")
    public void startdateBolumuneGirer(String Stardate) {
        actions.sendKeys(Keys.TAB).sendKeys(Stardate).perform();
    }

    @And("salary bolumune {string} girer")
    public void salaryBolumuneGirer(String Salary) {
        actions.sendKeys(Keys.TAB).sendKeys(Salary).perform();
    }

    @And("Create tusuna basar")
    public void createTusunaBasar() {
        actions.sendKeys(Keys.TAB).sendKeys(Keys.ENTER).perform();
    }

    @When("kullanici {string} ile arama yapar")
    public void kullaniciIleAramaYapar(String firstname) {
       page.searchButton.sendKeys(firstname);
    }

    @Then("isim bolumunde {string} oldugunu dogrular")
    public void isimBolumundeOldugunuDogrular(String isim) {
        Assert.assertTrue(page.isimVar.getText().contains(isim));
    }


}
