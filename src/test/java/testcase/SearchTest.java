package testcase;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import page.SearchPage;

public class SearchTest {
    private WebDriver driver;
    public SearchPage objSearchPage;

    @BeforeTest
    public void beforeTest() {
        String url="https://www.vergency.vn/";
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);
        WebElement ItemSearch = driver.findElement(By.xpath("//*[@id=\"box-wrapper\"]/header/div/div/div/div[3]/ul/li[1]"));
        ItemSearch.click();
        WebElement txtSearch = driver.findElement(By.xpath("//*[@id=\"box-wrapper\"]/header/div/div/div/div[3]/ul/li[1]/div/div/form/input[2]"));
        txtSearch.click();
    }

    @AfterTest
    public void afterTest() throws Exception {
        Thread.sleep(5000);
        driver.close();
    }

    @Test
    public void Test1()  {
        objSearchPage=new page.SearchPage(driver);
        objSearchPage.SearchTest();
    }
}
