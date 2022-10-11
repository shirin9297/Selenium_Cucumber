Feature: US006 kullanici amazonda istedigi kelimeleri aratir

  Scenario Outline: TC01 Kullanici istedigi kelimeleri aratir

    Given Kullanici amazon sayfasina gider
    Then kullanici "<istenenKelime>" icin arama yapar
    And sonuclarin "<istenenKelimeKontrol>" icerdigini test eder
    And sayfayi kapatir
    Examples:
      | istenenKelime | istenenKelimeKontrol |
      | nutella | nutella |
      | selenium | selenium |
      | sql | sql |

    # TestNG deki dataProvider kullanimindaki gibi Cucumberda da Scenario Outline kullaniriz
  # Bu sekilde birden fazla kelimeyi tek seferde aratabiliriz.
  # Tirnak icinde birden fazla kelimeyi tek seferde aratabiliriz.

    # Feature dosyasinda yazdigimiz komutta eger ""(tirnak) kullanirsak stepDefinition da parametreli
  # bir method olusuturur. Ve artik stepDefintin'i kullanmadan Feature dosyasinda
  # ""(tirnak) icindeki string'i degistirerek istedigim kelimeyi aratabilirim.
  # Scenario Outline'da ise yine ""(tirnak) icinde birden fazla kelime
  # aratacaksam "<>" kullanim ile "<>" icine yazdigim herhangi bir kelimeyi  Scenario Outline'in
  # asagida olusturdugu Examples altinda aratmak istedigim kelimeleri yazar ve sirasiyla aratbiliriz.