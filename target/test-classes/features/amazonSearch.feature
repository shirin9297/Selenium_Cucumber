
Feature: Amazon Search

  Scenario: TC01 Kullanici amazonda  Nutella aratir

    Given Kullanici amazon sayfasina gider
    Then Kullanici nutella  aratir
    And Sonuclarin nutella icerdigini test eder


  Scenario: TC02 Kullanici amazonda  Selenium aratir

    Given Kullanici amazon sayfasina gider
    Then Kullanici Selenium  aratir
    And Sonuclarin Selenium icerdigini test eder

  @gp1
  Scenario: TC03 Kullanici amazonda iphone aratir

    Given Kullanici amazon sayfasina gider
    Then Kullanici iphone  aratir
    And Sonuclarin iphone icerdigini test eder
    And sayfayi kapatir


