package testcase;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import page.RegisterPage;

public class RegisterTest {
    private WebDriver driver;
    public RegisterPage objRegisterPage;

    @BeforeTest
    public void beforeTest() {
        String url="https://www.vergency.vn/";
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);
        WebElement ItemLogin = driver.findElement(By.xpath("//*[@id=\"box-wrapper\"]/header/div/div/div/div[3]/ul/li[2]/a"));
        ItemLogin.click();
        WebElement ItemRegister = driver.findElement(By.xpath("//*[@id=\"customer_login\"]/div[4]/a[2]"));
        ItemRegister.click();
    }

    @AfterTest
    public void afterTest() throws Exception {
        Thread.sleep(2000);
        driver.close();
    }

    @Test(priority = 1)
    public void Test1()  {
        objRegisterPage=new page.RegisterPage(driver);
        objRegisterPage.RegisterTrue();
    }
    @Test(priority = 2)
    public void Test2()  {
        objRegisterPage=new page.RegisterPage(driver);
        objRegisterPage.RegisterWithFailFName();
    }
    @Test(priority = 3)
    public void Test3()  {
        objRegisterPage=new page.RegisterPage(driver);
        objRegisterPage.RegisterWithFailLName();
    }
    @Test(priority = 4)
    public void Test4()  {
        objRegisterPage=new page.RegisterPage(driver);
        objRegisterPage.RegisterWithFailEmail();
    }
    @Test(priority = 5)
    public void Test5()  {
        objRegisterPage=new page.RegisterPage(driver);
        objRegisterPage.RegisterWithFailPassWord();
    }
}



