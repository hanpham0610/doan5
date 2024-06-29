package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EditAddressPage {
    private WebDriver driver;
    private By AddressLastName = By.xpath("//*[@id=\"address_last_name_1124327869\"]");
    private By AddressFirstName = By.xpath("//*[@id=\"address_first_name_1124327869\"]");
    private By Address = By.xpath("//*[@id=\"address_address1_1124327869\"]");
    private By Country = By.xpath("//*[@id=\"address_country_1124327869\"]");
    private By Phone = By.xpath("//*[@id=\"address_phone_1124327869\"]");
    private By Accecpt = By.xpath("//*[@id=\"address_phone_1124327869\"]");
    public EditAddressPage(WebDriver driver) {
        this.driver = driver;
    }
    public void EditAddressPageFull() {
        WebElement AddressLastName =driver.findElement(By.xpath("//*[@id=\"address_last_name_1124327869\"]"));
        WebElement AddressFirstName=driver.findElement(By.xpath("//*[@id=\"address_first_name_1124327869\"]"));
        WebElement Address=driver.findElement(By.xpath("//*[@id=\"address_address1_1124327869\"]"));
        WebElement Country =driver.findElement(By.xpath("//*[@id=\"address_country_1124327869\"]"));
        WebElement Phone=driver.findElement(By.xpath("//*[@id=\"address_phone_1124327869\"]"));
        WebElement Accecpt=driver.findElement(By.xpath("//*[@id=\"address_phone_1124327869\"]"));
        AddressLastName.sendKeys("Han");
        AddressFirstName.sendKeys("Han");
        Address.sendKeys("Pham");
        Country.sendKeys("sakurakiss1a@gmail.com");
        Phone.sendKeys("019061002");
        Accecpt.click();

    }
}
