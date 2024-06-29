package testcase;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import page.EditAddressPage;

public class EditAddressTest {
    private WebDriver driver;
    private By userInput = By.xpath("//*[@id=\"customer_email\"]");
    private By passwordInput = By.xpath("//*[@id=\"customer_password\"]");
    public EditAddressPage objEditAddressPage;

    @BeforeTest
    public void beforeTest() {
        String url="https://www.vergency.vn/account/login";
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);
        driver.findElement(userInput).clear();
        driver.findElement(passwordInput).clear();
        WebElement userInput =driver.findElement(By.xpath("//*[@id=\"customer_email\"]"));
        WebElement passwordInput =driver.findElement(By.xpath("//*[@id=\"customer_password\"]"));
        WebElement btnLogin =driver.findElement(By.xpath("//*[@id=\"customer_login\"]/div[3]/input"));
        userInput.sendKeys("sakurakiss102@gmail.com");
        passwordInput.sendKeys("019061002");
        btnLogin.click();
        WebElement ItemEdit = driver.findElement(By.xpath("//*[@id=\"view_address\"]"));
        ItemEdit.click();
        WebElement ItembtnEdit = driver.findElement(By.xpath("//*[@id=\"view_address_1124327869\"]/p/span[1]"));
        ItembtnEdit.click();
    }

    @AfterTest
    public void afterTest() throws Exception {
        Thread.sleep(2000);
        driver.close();
    }

    @Test(priority = 1)
    public void Test1()  {
        objEditAddressPage=new page.EditAddressPage(driver);
        objEditAddressPage.EditAddressPageFull();
    }
}
