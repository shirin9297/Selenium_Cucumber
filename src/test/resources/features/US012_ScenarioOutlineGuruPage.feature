Feature: US012 Class Work

  Scenario Outline: TC01_kullanici_sutun_basligi_ile_liste_alabilmeli
    Given kullanici "guruUrl" anasayfasinda
    Then "<Basliklar>" sutunundaki tum degerleri yazdirir
    Examples:
      | Basliklar          |
      | Company            |
      | Group              |
      | Prev Close (Rs)    |
      | Current Close (Rs) |
      | % Change           |

  Scenario: Kullanici sayfayi kapatir
    Given sayfayi kapatir