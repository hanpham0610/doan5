package testcase;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import page.BuyProductPage;

public class BuyProductTest {
    private WebDriver driver;
    public BuyProductPage objBuyProductPage;

    @BeforeTest
    public void beforeTest() {
        String url="https://www.vergency.vn/";
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);
    }

    @AfterTest
    public void afterTest() throws Exception {
        Thread.sleep(2000);
        driver.close();
    }

    @Test
    public void Test1()  {
        objBuyProductPage=new page.BuyProductPage(driver);
        objBuyProductPage.BuyProduct();
    }
}
