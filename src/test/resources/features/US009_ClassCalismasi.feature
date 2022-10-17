Feature:Class Calismasi

  Scenario Outline:
    When kullanici "https://editor.datatables.net/" adresine gider
    Then  new butonuna basar
    And isim bolumune "<firstname>" girer
    And soyisim bolumune "<lastname>" girer
    And position bolumune"<position>" girer
    And ofis bolumune "<ofisbilgisi>" girer
    And extension bolumune "<extension>" girer
    And startdate bolumune"<Stardate>"  girer
    And salary bolumune "<Salary>" girer
    And Create tusuna basar
    When kullanici "<firstname>" ile arama yapar
    Then isim bolumunde "<firstname>" oldugunu dogrular
    Examples:
      | firstname | lastname | position | ofisbilgisi | extension | Stardate   | Salary |
      | ALi       | Veli     | Qa       | Google      | Senior    | 2022-10-09 | 15000  |
      | Ahmet     | Mehmet   | Qa       | Google      | Junior    | 2022-10-04  | 10500  |
      | Hasan     | Duman    | Dev      | Amazon      | Junior    | 2020-11-12 | 25000  |
      | Akin      | Alkan    | Dev      | Amazon      | Senior    | 2009-12-05  | 50000  |
      | Orhan     | Duman    | PO       | WallMart    | Senior    | 2006-06-11  | 30000  |
    #5 farkli kullanici bilgisi girer