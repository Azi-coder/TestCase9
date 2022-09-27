package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.List;

public class ResultPage {
    WebDriver driver;
    private By searchedProductsText = By.xpath("//h2[text()='Searched Products']");
    private By resultProducts = By.xpath("//div[2]/div/div[1]/div[1]/p");

    public ResultPage(WebDriver driver){
        this.driver = driver;
    }
    public String getText(){
        return driver.findElement(resultProducts).getText();
    }
}
