@pt1
Feature: US1001 Amazon arama testi

  Scenario: TC01 Kullanıcı Amazonda arama yapabilmeli
    Given Kullanici amazon anasayfaya gider
    When Arama cubuguna Nutella yazip aratir
    Then Arama sonuclarinin Nutella icerdigini test eder
