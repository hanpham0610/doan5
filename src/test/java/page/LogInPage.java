package page;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LogInPage {
    private WebDriver driver;
    private By userInput = By.xpath("//*[@id=\"customer_email\"]");
    private By passwordInput = By.xpath("//*[@id=\"customer_password\"]");
    public LogInPage(WebDriver driver) {
        this.driver = driver;
    }
    public void LoginTrue() {
        driver.findElement(userInput).clear();
        driver.findElement(passwordInput).clear();
        WebElement userInput =driver.findElement(By.xpath("//*[@id=\"customer_email\"]"));
        WebElement passwordInput =driver.findElement(By.xpath("//*[@id=\"customer_password\"]"));
        WebElement btnLogin =driver.findElement(By.xpath("//*[@id=\"customer_login\"]/div[3]/input"));
        userInput.sendKeys("sakurakiss102@gmail.com");
        passwordInput.sendKeys("019061002");
        btnLogin.click();
        WebElement resultMessage = driver.findElement(By.linkText("Tài khoản"));
        String messageText = resultMessage.getText();
        if (messageText.contains("Tài khoản")) {
            System.out.println("Đăng nhập thành công");
        }
    }
    public void LoginWithFailUser() {
        driver.findElement(userInput).clear();
        driver.findElement(passwordInput).clear();
        WebElement userInput=driver.findElement(By.xpath("//*[@id=\"customer_email\"]"));
        WebElement passwordInput=driver.findElement(By.xpath("//*[@id=\"customer_password\"]"));
        WebElement btnLogin=driver.findElement(By.xpath("//*[@id=\"customer_login\"]/div[3]/input"));
        userInput.sendKeys("han123");
        passwordInput.sendKeys("019061002");
        btnLogin.click();

    }
    public void LoginWithFailPassWord() {
        driver.findElement(userInput).clear();
        driver.findElement(passwordInput).clear();
        WebElement userInput=driver.findElement(By.xpath("//*[@id=\"customer_email\"]"));
        WebElement passwordInput=driver.findElement(By.xpath("//*[@id=\"customer_password\"]"));
        WebElement btnLogin=driver.findElement(By.xpath("//*[@id=\"customer_login\"]/div[3]/input"));
        userInput.sendKeys("sakurakiss102@gmail.com");
        passwordInput.sendKeys("123456");
        btnLogin.click();

    }
}
