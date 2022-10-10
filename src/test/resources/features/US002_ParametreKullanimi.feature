Feature: US002 Parametre Kullanimi
  Background: Ortak kisimlar
    Given Kullanici amazon sayfasina gider
  @parametre
  Scenario: TC01 Kullanici amazonda parametreli arama yapar

    Then kullanici "nutella" icin arama yapar
    And sonuclarin "nutella" icerdigini test eder
    And sayfayi kapatir

  Scenario: TC02 Kullanici amazonda parametreli arama yapar

    Then kullanici "selenium" icin arama yapar
    And sonuclarin "selenium" icerdigini test eder
    And sayfayi kapatir

  Scenario: TC01 Kullanici amazonda parametreli arama yapar

    Then kullanici "java" icin arama yapar
    And sonuclarin "java" icerdigini test eder
    And sayfayi kapatir

  Scenario: TC02 Kullanici amazonda parametreli arama yapar

    Then kullanici "SQL" icin arama yapar
    And sonuclarin "SQL" icerdigini test eder
    And sayfayi kapatir

    # Feature dosyasinda parametreleri arama yaptigimizda ""(tirnak) icine aldigimiz string degeri stepDefintionda
  # bir kere parametreli method olusturur ve yeni bir arama yapmak istedigimizde
  #tekrar method olusturmadan feature dosyasindan ""(tirnka) icinde belirttigimizde string ifadeyi degistirmemiz
  #yeterli olucaktir. Boylece kodlarimiz dinamik olucaktir