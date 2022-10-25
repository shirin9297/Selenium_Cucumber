package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.GuruPage;
import utilities.ConfigReader;
import utilities.Driver;

import java.util.List;

public class GuruStepDefinition {
    GuruPage guru = new GuruPage();
    @Given("kullanici {string} anasayfasinda")
    public void kullaniciAnasayfasinda(String istenenUrl) {
        Driver.getDriver().get(ConfigReader.getProperty("guruUrl"));
    }

    @And("{string} sutunundaki tum degerleri yazdirir")
    public void sutunundakiTumDegerleriYazdirir(String baslik) {
        int index=0;
        for (int i = 0; i <guru.basliklar.size(); i++) {
            if(guru.basliklar.get(i).getText().equals(baslik)){ //Feature'dan gelen string degeri i degerine esitledik
                System.out.println(guru.basliklar.get(i).getText()); //Feature'dan gelen basligi yazdirdik
                index = i+1; //feature'dan gelen ve i degerine esitledigimiz string'i ayni degere sahip sutunlarda yazdirabilmek icin
                // bos bir konteyner olusturup ona atadik. List te index(0) dan baslandigi icin ve webTable locate'imiz
                // 1-den basladigi icin i degerini bir arttirdik.
                List<WebElement> sutunElement =
                        Driver.getDriver().findElements(By.xpath("//tbody//tr//td[" +index+"]"));
                //Sonrasinda webTable'daki body'yi locate edip esitledigimiz index'i baslik altindaki sutunu getirebilmesi icin bu liste koyduk
                //Lambda ilede o sutunu yazdirdik
                sutunElement.forEach(t-> System.out.println(t.getText()));
               // for (WebElement w : sutunElement) {
                  //  System.out.println(w.getText());
               // }


            }
        }
    }
}
