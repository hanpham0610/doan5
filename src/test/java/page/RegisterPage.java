package page;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegisterPage {
    private WebDriver driver;
    private By LastNameInput = By.xpath("//input[@id='last_name']");
    private By FirstNameInput = By.xpath("//input[@id='first_name']");
    private By EmailInput = By.xpath("//input[@id='email']");
    private By PassInput = By.xpath("//input[@id='password']");

    public RegisterPage(WebDriver driver) {
        this.driver = driver;
    }
    public void RegisterTrue() {
        WebElement LastNameInput =driver.findElement(By.xpath("//input[@id='last_name']"));
        WebElement FirstNameInput=driver.findElement(By.xpath("//input[@id='first_name']"));
        WebElement EmailInput=driver.findElement(By.xpath("//input[@id='email']"));
        WebElement PassInput=driver.findElement(By.xpath("//input[@id='password']"));
        WebElement btnLogin=driver.findElement(By.xpath("//body/div[@id='box-wrapper']/main[1]/section[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[5]/input[1]"));
        LastNameInput.sendKeys("Han");
        FirstNameInput.sendKeys("Pham");
        EmailInput.sendKeys("sakurakiss1a@gmail.com");
        PassInput.sendKeys("019061002");
        btnLogin.click();
        WebElement resultMessage = driver.findElement(By.linkText("Tài khoản"));
        String messageText = resultMessage.getText();
        if (messageText.contains("Tài khoản của bạn !")) {
            System.out.println("Đăng ký thành công");
        }
    }
    public void RegisterWithFailFName() {
        driver.findElement(LastNameInput).clear();
        driver.findElement(FirstNameInput).clear();
        driver.findElement(EmailInput).clear();
        driver.findElement(PassInput).clear();
        WebElement LastNameInput =driver.findElement(By.xpath("//input[@id='last_name']"));
        WebElement FirstNameInput=driver.findElement(By.xpath("//input[@id='first_name']"));
        WebElement EmailInput=driver.findElement(By.xpath("//input[@id='email']"));
        WebElement PassInput=driver.findElement(By.xpath("//input[@id='password']"));
        WebElement btnLogin=driver.findElement(By.xpath("//body/div[@id='box-wrapper']/main[1]/section[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[5]/input[1]"));
        LastNameInput.sendKeys("");
        FirstNameInput.sendKeys("Pham");
        EmailInput.sendKeys("sakurakiss10a@gmail.com");
        PassInput.sendKeys("019061002");
        btnLogin.click();
    }
    public void RegisterWithFailLName() {
        driver.findElement(LastNameInput).clear();
        driver.findElement(FirstNameInput).clear();
        driver.findElement(EmailInput).clear();
        driver.findElement(PassInput).clear();
        WebElement LastNameInput =driver.findElement(By.xpath("//input[@id='last_name']"));
        WebElement FirstNameInput=driver.findElement(By.xpath("//input[@id='first_name']"));
        WebElement EmailInput=driver.findElement(By.xpath("//input[@id='email']"));
        WebElement PassInput=driver.findElement(By.xpath("//input[@id='password']"));
        WebElement btnLogin=driver.findElement(By.xpath("//body/div[@id='box-wrapper']/main[1]/section[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[5]/input[1]"));
        LastNameInput.sendKeys("Han");
        FirstNameInput.sendKeys("");
        EmailInput.sendKeys("sakurakiss10a@gmail.com");
        PassInput.sendKeys("019061002");
        btnLogin.click();
    }
    public void RegisterWithFailEmail() {
        driver.findElement(LastNameInput).clear();
        driver.findElement(FirstNameInput).clear();
        driver.findElement(EmailInput).clear();
        driver.findElement(PassInput).clear();
        WebElement LastNameInput =driver.findElement(By.xpath("//input[@id='last_name']"));
        WebElement FirstNameInput=driver.findElement(By.xpath("//input[@id='first_name']"));
        WebElement EmailInput=driver.findElement(By.xpath("//input[@id='email']"));
        WebElement PassInput=driver.findElement(By.xpath("//input[@id='password']"));
        WebElement btnLogin=driver.findElement(By.xpath("//body/div[@id='box-wrapper']/main[1]/section[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[5]/input[1]"));
        LastNameInput.sendKeys("Han");
        FirstNameInput.sendKeys("Pham");
        EmailInput.sendKeys("sakurakiss10");
        PassInput.sendKeys("019061002");
        btnLogin.click();
    }
    public void RegisterWithFailPassWord() {
        driver.findElement(LastNameInput).clear();
        driver.findElement(FirstNameInput).clear();
        driver.findElement(EmailInput).clear();
        driver.findElement(PassInput).clear();
        WebElement LastNameInput =driver.findElement(By.xpath("//input[@id='last_name']"));
        WebElement FirstNameInput=driver.findElement(By.xpath("//input[@id='first_name']"));
        WebElement EmailInput=driver.findElement(By.xpath("//input[@id='email']"));
        WebElement PassInput=driver.findElement(By.xpath("//input[@id='password']"));
        WebElement btnLogin=driver.findElement(By.xpath("//body/div[@id='box-wrapper']/main[1]/section[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[5]/input[1]"));
        LastNameInput.sendKeys("Han");
        FirstNameInput.sendKeys("Pham");
        EmailInput.sendKeys("sakurakiss10a@gmail.com");
        PassInput.sendKeys("    a");
        btnLogin.click();
    }
}
