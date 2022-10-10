package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "stepDefinitions",
        tags = "@gp1", // iki tag'i ayni anda calistirmak isterseniz "@gp1 or @gp2"
        dryRun = false
)


public class Runner {
    /*
    Runner Class'i TestNG'deki XML mantigi ile calisir. Calistirmak istedigimiz senaryolara
    tag belirtiriz ve belirttigimiz tag'lari calistirir. XML'deki istedigimiz testleri calistirmak icin
    kullaniriz. Runner class body'si bostur ve runner class'ini ekleyecegimiz notasyonlar active eder.
    Bu class'ta kullanacagimiz 2 adet notasyon vardir
    -@RunWith(Cucumber.class) notasyonu Runner class'ina calisma ozelligi ekler.
    Bu notasyon oldugu icin Cucumber frameworkumuzde JUnit kullanmayi tercih ederiz.
    -@CucumberOptions notasyonu icinde
    features : Runner dosyasinin feature dosyasini nereden bulacagini tarif eder
    glue : stepDefinitions yolunu belirtiriz
    tags : Hangi tag'i calistirmak istiyorsak onu belli eder

    dryRun : iki secenek vardir
    dryRun = true; dersek testimizi calistirmadan eksik adimlari bize verir
    dryRun = false; testlerimizi driver ile calistirir.
     */

}
