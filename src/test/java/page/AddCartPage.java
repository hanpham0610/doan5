package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddCartPage {
    private WebDriver driver;
    private By btnshop = By.xpath("//*[@id=\"navbar\"]/div/div/ul/li[2]/a");
    private By btnChose  = By.xpath("//*[@id=\"event-grid\"]/div[3]/div/div");
    private By btnChoseSize = By.xpath("//*[@id=\"variant-swatch-0\"]/div[2]/div/label");
    private By btnAdd = By.xpath("//*[@id=\"add-item-form\"]/div[3]/button[1]");
    public AddCartPage(WebDriver driver) {
        this.driver = driver;
    }
    public void AddCart() {
        WebElement btnshop =driver.findElement(By.xpath("//*[@id=\"navbar\"]/div/div/ul/li[2]/a"));
        btnshop.click();
        WebElement btnChose = driver.findElement(By.xpath("//*[@id=\"event-grid\"]/div[3]/div/div"));
        btnChose.click();
        WebElement btnChoseSize =driver.findElement(By.xpath("//*[@id=\"variant-swatch-0\"]/div[2]/div/label"));
        btnChoseSize.click();
        WebElement btnAdd = driver.findElement(By.xpath("//*[@id=\"add-item-form\"]/div[3]/button[1]"));
        btnAdd.click();
    }
}
