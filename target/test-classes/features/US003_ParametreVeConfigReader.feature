Feature: Parametre Kullanimi
@gp1
  Scenario: TC01 Parametre kullaniminda ConfigReader Kullanimi

    Given kullanici "faceUrl" sayfasina gider
    Then kullanici 3 saniye bekler
    When url'in "facebook" icerdigini test edelim
    And sayfayi kapatir
@gp2
  Scenario: TC02 Parametre kullaniminda ConfigReader Kullanimi

    Given kullanici "google" sayfasina gider
    Then kullanici 3 saniye bekler
    When url'in "google" icerdigini test edelim
    And sayfayi kapatir
@gp1
  Scenario: TC03 Parametre kullaniminda ConfigReader Kullanimi
    Given kullanici "brcUrl" sayfasina gider
    Then kullanici 3 saniye bekler
    When url'in "blue" icerdigini test edelim
    And sayfayi kapatir
@gp2
  Scenario: TC04 Parametre kullaniminda ConfigReader Kullanimi
    Given kullanici "amazonUrl" sayfasina gider
    Then kullanici 3 saniye bekler
    When url'in "amazon" icerdigini test edelim
    And sayfayi kapatir