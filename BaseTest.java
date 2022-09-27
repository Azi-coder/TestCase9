package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pages.HomePage;
import pages.ProductsPage;
import pages.ResultPage;

public class BaseTest {
    WebDriver driver;
    protected HomePage homePage;
    protected ProductsPage productsPage;
    protected ResultPage resultPage;

    @BeforeClass
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","resources/chromedriver");
        driver = new ChromeDriver();
        driver.get("http://automationexercise.com");
        driver.manage().window().maximize();
        homePage = new HomePage(driver);
        productsPage = new ProductsPage(driver);
        resultPage = new ResultPage(driver);
    }
    @AfterClass
    public void quit(){
        driver.quit();
    }
}
