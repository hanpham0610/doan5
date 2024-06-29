package page;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class SearchPage {
    private WebDriver driver;
    private By SearchInput = By.xpath("//*[@id=\"box-wrapper\"]/header/div/div/div/div[3]/ul/li[1]/div/div/form/input[2]");

    public SearchPage(WebDriver driver) {
        this.driver = driver;
    }
    public void SearchTest() {
        driver.findElement(SearchInput).clear();
        WebElement SearchInput =driver.findElement(By.xpath("//*[@id=\"box-wrapper\"]/header/div/div/div/div[3]/ul/li[1]/div/div/form/input[2]"));
        SearchInput.sendKeys("1");
        SearchInput.sendKeys(Keys.RETURN);
        WebElement resultMessage = driver.findElement(By.linkText("Tìm kiếm"));
        String messageText = resultMessage.getText();
//        System.out.println("messageText "+ messageText );
        if (messageText.contains("Tìm kiếm")) {
            System.out.println("Tìm kiếm  thành công");
        }

    }
}
