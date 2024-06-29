package page;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BuyProductPage {
    private WebDriver driver;

    private By btnBuy = By.xpath("//*[@id=\"cart\"]/div[2]/div/a");
    private By txtHoten = By.xpath("//*[@id=\"billing_address_full_name\"]");
    private By txtSdt = By.xpath("//*[@id=\"billing_address_phone\"]");
    private By txtDiachi = By.xpath("//*[@id=\"billing_address_address1\"]");
    private By cbboxTinh = By.xpath("//*[@id=\"customer_shipping_province\"]");
    private By ccbHuyen = By.xpath("//*[@id=\"customer_shipping_district\"]");
    private By cbbXa = By.xpath("//*[@id=\"customer_shipping_ward\"]");
    private By OKBuy = By.xpath("//*[@id=\"form_next_step\"]");
    private By btnshop1 = By.xpath("//*[@id=\"navbar\"]/div/div/ul/li[2]/a");
    private By btnChose1 = By.xpath("//*[@id=\"event-grid\"]/div[3]/div/div");
    private By btnChoseSize1 = By.xpath("//*[@id=\"variant-swatch-0\"]/div[2]/div/label");
    private By btnBuyNow = By.xpath("//*[@id=\"add-item-form\"]/div[3]/button[2]");

    public BuyProductPage(WebDriver driver) {
        this.driver = driver;
    }

    public void BuyProduct() {

        WebElement btnshop1 = driver.findElement(By.xpath("//*[@id=\"navbar\"]/div/div/ul/li[2]/a"));
        btnshop1.click();
        WebElement btnChose1 = driver.findElement(By.xpath("//*[@id=\"event-grid\"]/div[3]/div/div"));
        btnChose1.click();
        WebElement btnChoseSize1 = driver.findElement(By.xpath("//*[@id=\"variant-swatch-0\"]/div[2]/div/label"));
        btnChoseSize1.click();
        WebElement btnBuyNow = driver.findElement(By.xpath("//*[@id=\"add-item-form\"]/div[3]/button[2]"));
        btnBuyNow.click();
        WebElement btnBuy = driver.findElement(By.xpath("//*[@id=\"cart\"]/div[2]/div/a"));
        btnBuy.click();

        try {
            Thread.sleep(1000);
            WebElement txtHoten = driver.findElement(By.xpath("//*[@id=\"billing_address_full_name\"]"));
            txtHoten.sendKeys("Hanne");

            Thread.sleep(1000);
            WebElement txtSdt = driver.findElement(By.xpath("//*[@id=\"billing_address_phone\"]"));
            txtSdt.sendKeys("0812345678");

            Thread.sleep(1000);
            WebElement txtDiachi = driver.findElement(By.xpath("//*[@id=\"billing_address_address1\"]"));
            txtDiachi.sendKeys("Hung Yen, Viet Nam");

            Thread.sleep(1000);
            WebElement cbboxTinh = driver.findElement(By.xpath("//*[@id=\"customer_shipping_province\"]"));
            cbboxTinh.click();
            WebElement option1 = driver.findElement(By.xpath("//*[@id=\"customer_shipping_province\"]/option[24]"));
            option1.click();

            Thread.sleep(1000);
            WebElement ccbHuyen = driver.findElement(By.xpath("//*[@id=\"customer_shipping_province\"]"));
            ccbHuyen.click();
            WebElement option2 = driver.findElement(By.xpath("//*[@id=\"customer_shipping_district\"]/option[2]"));
            option2.click();

            Thread.sleep(1000);
            WebElement cbbXa = driver.findElement(By.xpath("//*[@id=\"customer_shipping_province\"]"));
            cbbXa.click();
            WebElement option3 = driver.findElement(By.xpath("//*[@id=\"customer_shipping_ward\"]/option[2]"));
            option3.click();

            Thread.sleep(2000);
            WebElement OKBuy = driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div[2]/div[2]/div[2]/form/button"));
            OKBuy.click();

        } catch (InterruptedException e) {
            System.out.println("codeKoCanTest " + e);
            throw new RuntimeException(e);
        }

    }
}
