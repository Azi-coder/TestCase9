package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductsPage {
        private WebDriver driver;
        private By searchBar = By.cssSelector("input[id = search_product]");
        private By search = By.cssSelector("button[id=submit_search]");
        private By productsText = By.cssSelector("h2[class = 'title text-center']");
        public ProductsPage(WebDriver driver){
            this.driver = driver;
        }

        public void sendText(String text){
            driver.findElement(searchBar).sendKeys(text);
        }
        public void clickSearch(){
            driver.findElement(search).click();
        }
        public String getText(){
            return driver.findElement(productsText).getText();
        }

    }

