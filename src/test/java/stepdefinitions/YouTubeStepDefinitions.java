package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import pages.YouTubePage;
import utilities.ConfigReader;
import utilities.Driver;

import java.security.Key;

public class YouTubeStepDefinitions {

    YouTubePage youTubePage=new YouTubePage();
    @And("sayfayi kapatir")
    public void sayfayiKapatir() {
        Driver.closeDriver();

    }
    @Given("Kullanici youtube anasayfaya gider")
    public void kullaniciAnasayfayaGider() {
        Driver.getDriver().get("https://www.youtube.com");
    }


    @Then("Kullanici cookiesleri kabul eder")
    public void kullaniciCookiesleriKabulEder() throws InterruptedException {
        youTubePage.youtubeCookies.click();
        Thread.sleep(5000);
    }


    @Then("Kullinici shortsa tiklar")
    public void kulliniciShortsaTiklar() {
        youTubePage.Shorts.click();
    }
}
