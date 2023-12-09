package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.GenericMethods;

public class ProductPage {
    WebDriver driver;
    public ProductPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(linkText = "https://magento.softwaretestingboard.com/collections/eco-friendly.html")
    WebElement linkShopEcoFriendly;
    @FindBy(xpath = "//div[@class='page-wrapper']//div[2]//div[4]//select[1]")
    WebElement buttonSortBy;
    @FindBy(xpath = "")
    WebElement listProducts;
    @FindBy(xpath = "//div[4]//div[2]//ul[1]//li[3]//a[1]")
    WebElement buttonNextListProducts;
    @FindBy(xpath = "//*[@id='maincontent']/div[3]/div[1]/div[4]/ol/li[9]/div/a/span/span/img")
    WebElement selectProduct;
    @FindBy(xpath = "//footer[@class='page-footer']")
    WebElement footerAllText;

    public String getCurrentUrl(){
        String productURL= driver.getCurrentUrl();
        return productURL;
    }
    public void actionSelectProduct(){ // Actions not working in Firefox
        Actions action = new Actions(driver);
        action.moveToElement(selectProduct).perform();
        GenericMethods.pauseExecutionFor(3);
        action.moveToElement(selectProduct).click().perform();
    }
    public void selectProduct(){
        WebElement selectProduct = driver.findElement(By.xpath("//*[@id='maincontent']/div[3]/div[1]/div[4]/ol/li[9]/div/a/span/span/img"));
        selectProduct.click();
        GenericMethods.pauseExecutionFor(2);
    }


}

