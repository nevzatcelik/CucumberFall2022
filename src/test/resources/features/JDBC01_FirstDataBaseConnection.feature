Feature: JDBC kullanarak yeterli bilgi ile database testi yapilabilir
  @dbt1
  Scenario: JDBC01 kullanici database de sorgu yapabilmeli

    Given Kullanici JDBC ile database ebaglanir
    Then  users tablosundaki isim verilerini alir
    And   isim verilerini test eder