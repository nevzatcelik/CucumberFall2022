
Feature: US1010 Kullanici liste olarak verilen urunleri amazonda aratir

 Scenario Outline: TC17 Kullanici liste olarak arama testi yapanbilmeli

   Given Kullanici "amazonUrl" anasayfaya gider
   Then Arama cubuguna "<istenenKelime>" yazip aratir
   And  Arama sonuclarinin "<istenenKelime>" icerdigini test eder
   Then sayfayi kapatir

   Examples:
   |istenenKelime|
   |Nutella|
   |Java|
   |Apple|
   |Samsung|
   |Lg|
