package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OnlineServisPage {
    public WebDriver driver;


    @FindBy(xpath = "(.//*[@class='aih-b2c-widget-block-description']//img)[1]")
    public WebElement zaCordonomElement;

    @FindBy(xpath = ".//*[@class='embed-responsive-item']")
    public WebElement insuranceIframe;

    public void productErvChoose() {
        zaCordonomElement.click();
    }

    public OnlineServisPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }
}