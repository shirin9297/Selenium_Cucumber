Feature: US1009 Ck Hotels Login
  Scenario: TC11 kullanici gecerli bilgilerle giris yapar
    Given kullanici bluerentacar ana sayfasinda
    Then Login yazisina tiklar
    And gecersiz username girer
    And gecersiz password girer
    And Login butonuna basar
    Then sayfaya giris yapilamadigini kontrol eder
    And kulllanici sayfayi kapatir

  #Kullanici adi  Manager5@gmail.com  Manager6@gmail.com  Manager7@gmail.com  Manager8@gmail.com  Manager9@gmail.com
  #Password  Manager5!  Manager6!  Manager7!  Manager8!  Manager9!