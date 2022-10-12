package stepDefinitions;

import io.cucumber.java.en.And;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.Driver;

import java.time.Duration;

public class TheInternetHerokuStepDefition {
    @And("User goes do direct {string}")
    public void userGoesDoDirect(String arg0) {
    }

    @And("{string} butona basin")
    public void butonaBasin(String arg0) {
    }

    @And("delete butonu gorunur oluncaya kadar bekleyin")
    public void butonuGorunurOluncayaKadarBekleyin(String arg0) {

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf())
    }

    @And("delete butonunun gorunur oldugunu test edin")
    public void butonununGorunurOldugunuTestEdin(String arg0) {
    }

    @And("Delete butonuna basarak butonu silin")
    public void deleteButonunaBasarakButonuSilin() {
    }

    @And("Delete butonunun gorunmedigini test edin")
    public void deleteButonununGorunmediginiTestEdin() {
    }
}
