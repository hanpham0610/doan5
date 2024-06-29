package testcase;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import page.LogInPage;

public class LogInTest {
    private WebDriver driver;
    public LogInPage objLogInPage;

    @BeforeTest
    public void beforeTest() {
        String url = "https://www.vergency.vn/";
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);
        WebElement ItemLogin = driver.findElement(By.xpath("//*[@id=\"box-wrapper\"]/header/div/div/div/div[3]/ul/li[2]/a"));
        ItemLogin.click();
    }

    @AfterTest
    public void afterTest() throws Exception {
        Thread.sleep(2000);
        driver.close();
    }



    @Test(priority = 1)
    public void Test1() throws Exception{
        Thread.sleep(2000);
        objLogInPage = new page.LogInPage(driver);
        objLogInPage.LoginWithFailUser();
    }

    @Test(priority = 2)
    public void Test2() throws Exception{
        Thread.sleep(2000);
        objLogInPage = new page.LogInPage(driver);
        objLogInPage.LoginWithFailPassWord();
    }
    @Test(priority = 3)
    public void Test3() throws Exception{
        Thread.sleep(3000);
        objLogInPage = new page.LogInPage(driver);
        objLogInPage.LoginTrue();
    }
}


