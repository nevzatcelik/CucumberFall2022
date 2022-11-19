package stepdefinitions;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.MyCoursedemyPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class MycoursedemyStepdefinitions {
    MyCoursedemyPage myCoursedemyPage=new MyCoursedemyPage();

    //Cookies ekle

    @Then("myCourse anasayfa login linkine tiklar")
    public void my_course_anasayfa_login_linkine_tiklar() {

        myCoursedemyPage.loginLinki.click();

    }
    @Then("myCourse kullanici adi olarak {string} girer")
    public void my_course_kullanici_adi_olarak_girer(String verilenEmail) {
        myCoursedemyPage.emailKutusu.sendKeys(ConfigReader.getProperty(verilenEmail));
    }
    @Then("myCourse password olarak {string} girer")
    public void my_course_password_olarak_girer(String verilenPassword) {
        myCoursedemyPage.passwordKutusu.sendKeys(ConfigReader.getProperty(verilenPassword));

    }
    @Then("myCourse login butonuna basar")
    public void my_course_login_butonuna_basar() {
        ReusableMethods.bekle(1);
        Actions actions=new Actions(Driver.getDriver());
        actions.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).
                sendKeys(Keys.ARROW_DOWN).click(myCoursedemyPage.loginButonu).perform();
    }
    @Then("myCourse giris yapabildigini test eder")
    public void my_course_giris_yapabildigini_test_eder() {
        Assert.assertTrue(myCoursedemyPage.coursesLinki.isDisplayed());
    }

    @Then("myCourse cookies linkine tiklar")
    public void mycourseCookiesLinkineTiklar() {
        myCoursedemyPage.cookies.click();
    }

    @Then("myCourse giris yapilamadigini test eder")
    public void mycourseGirisYapilamadiginiTestEder() {
        Assert.assertTrue(myCoursedemyPage.loginLinki.isDisplayed());
    }

    @Then("Kullanici cookiesi kabul eder")
    public void kullaniciCookiesiKabulEder() {
        myCoursedemyPage.cookies.click();
        ReusableMethods.bekle(2);
    }
}