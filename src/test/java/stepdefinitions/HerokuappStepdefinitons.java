package stepdefinitions;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.NoSuchElementException;
import pages.HerokuappPage;
import utilities.ReusableMethods;

public class HerokuappStepdefinitons {

    HerokuappPage herokuappPage = new HerokuappPage();

    @Then("Herokuapp Add Element butonuna basar")
    public void herokuapp_add_element_butonuna_basar() {
        herokuappPage.addElementButton.click();
    }

    @Then("Herokuapp Delete butonu gorunmesini bekler")
    public void herokuapp_delete_butonu_gorunmesini_bekler() throws InterruptedException {
        ReusableMethods.bekle(1);
    }

    @Then("HerokuappDelete butonunun gorunur oldugunu test eder")
    public void herokuapp_delete_butonunun_gorunur_oldugunu_test_eder() {
        Assert.assertTrue(herokuappPage.deleteButton.isDisplayed());
    }

    @Then("Herokuapp Delete butonuna basarak butonu silin")
    public void herokuapp_delete_butonuna_basarak_butonu_silin() {
        herokuappPage.deleteButton.click();
    }

    @Then("Herokuapp Delete butonunun gorunmedigini test eder")
    public void herokuapp_delete_butonunun_gorunmedigini_test_eder() {
        boolean flag=false;
        try {
            Assert.assertFalse(herokuappPage.deleteButton.isDisplayed());
        } catch (NoSuchElementException e) {
           flag=true;
        }
        Assert.assertTrue(flag);
    }
}
