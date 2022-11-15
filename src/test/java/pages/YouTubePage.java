package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class YouTubePage {
    public YouTubePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath = "(//*[text()='Shorts'])[1]")
    public WebElement Shorts;

    @FindBy(xpath = "(//div[@class='yt-spec-touch-feedback-shape__fill'])[12]")
    public WebElement youtubeCookies;
}
