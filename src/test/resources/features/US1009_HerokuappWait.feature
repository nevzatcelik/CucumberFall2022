
Feature: US1009 Heroquapp Wait Testleri

  Scenario: TC16

    Given Kullanici "herokuUrl" anasayfaya gider
    Then Herokuapp Add Element butonuna basar
    Then Herokuapp Delete butonu gorunmesini bekler
    Then HerokuappDelete butonunun gorunur oldugunu test eder
    Then Herokuapp Delete butonuna basarak butonu silin
    And  Herokuapp Delete butonunun gorunmedigini test eder
    Then sayfayi kapatir

