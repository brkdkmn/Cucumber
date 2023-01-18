Feature:US1013 kullanici web tablosundan istedigi degerin varligini test eder

  Scenario: TC18 kulanici tablodan deger test eebilmeli

    Given kullanici "guru99Url" anasayfaya gider
    And guru99 cookies kabul eder
   And 2 saniye bekler
    Then Company listesini consola yazdirir
    And "Bata India" in listede oldugunu test eder
