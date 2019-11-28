package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OnlineInsurancePacegesPage {

    public WebDriver driver;

    @FindBy(xpath = "(.//*[@class='thumbnail aih-b2c-package-block-description'])[1]")
    public WebElement economElement;


    public void productErvPacegeChoose() {
        economElement.click();
    }

    public OnlineInsurancePacegesPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }
}
