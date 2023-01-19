Feature: US1014 Automation exercise sitesinde kullanici olusturma

  Scenario: TC19 Kullanici automation exercise sayfasinda kullanici olusturabilmeli




    Given kullanici "automationUrl" anasayfaya gider
    And user signUpLink linkine tiklar
    And user Create and account bolumune email adresi girer
    And Create an Account butonuna basar
    And user kisisel bilgilerini ve iletisim bilgilerini girer
    And user CreateAccount butonuna basar
    Then hesap olustugunu test edelim