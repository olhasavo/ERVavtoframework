import Pages.OnlineInsurancePacegesPage;
import Pages.OnlineServisPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class OnlineServisTests {
    WebDriver driver;

    @BeforeTest
    public void setup() {
        System.out.println("@BeforeTest");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
        driver.get(("https://eurotravelins.com.ua/ua/onlain-servis/pridbati-polis-onlain/"));
        driver.manage().window().maximize();
        OnlineServisPage onlineServisPage = new OnlineServisPage(driver);
        driver.switchTo().frame(onlineServisPage.insuranceIframe);
    }

    @Test
    public void test1() {
        OnlineServisPage onlineServisPage = new OnlineServisPage(driver);
        onlineServisPage.productErvChoose();
        OnlineInsurancePacegesPage onlineInsurancePacegesPage = new OnlineInsurancePacegesPage(driver);
        onlineInsurancePacegesPage.productErvPacegeChoose();


    }

    @AfterTest
    public void shutDown() {
//        driver.quit();
    }
}
