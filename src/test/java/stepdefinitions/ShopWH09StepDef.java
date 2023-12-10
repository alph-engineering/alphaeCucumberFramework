package stepdefinitions;


import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import pageobjects.*;
import utils.BrowserFactory;
import utils.GenericMethods;

import static utils.ReadData.propertyShip;

public class ShopWH09StepDef {
    //  Before Class

    WebDriver driver;

    HomePage homePage;
    ProductPage productPage;
    ProductDetailsPage productDetailsPage;
    CheckoutShippingPage checkoutShippingPage;
    CheckoutPaymentPage checkoutPaymentPage;
    CheckoutFinalPage checkoutFinalPage;

//    public ShopWH09StepDef(WebDriver driver){
//        this.driver = driver;
//        PageFactory.initElements(driver, this);
//    }

    // Launch Browser
    @Before
    public void driverInitiated(){
        driver = BrowserFactory.launchGivenBrowser("browser");
        homePage = new HomePage(driver);
        productPage = new ProductPage(driver);
        productDetailsPage = new ProductDetailsPage(driver);
        checkoutShippingPage = new CheckoutShippingPage(driver);
        checkoutPaymentPage = new CheckoutPaymentPage(driver);
        checkoutFinalPage = new CheckoutFinalPage(driver);

    }
    @Given("WebDriver is initiated")
    @Then("Browser launches")
    public void confirmApplicationLaunch() {
        driver.get("https://magento.softwaretestingboard.com/");
        GenericMethods.pauseExecutionFor(1);
        try {
            Assert.assertTrue(homePage.verifyFooterIsAvailable());
            System.out.println("- Application Launched Successfully");
        }catch (AssertionError e){
            System.out.println("- Application Failed");
        }
    }
    // Navigate to Shop Eco-Friendly Products
    @Given("The HomePage is loaded")
    public void confirmProductsListed(){

        System.out.println(" ");
        System.out.println("- Current URL: "+homePage.getCurrentUrl());
        System.out.println(" ");
        Assert.assertTrue((homePage.verifyEcoFriendlyProductsAvailable()));
        System.out.println("- Shop Eco Friendly Products Available");
    }
    @When("User selects Shop Eco-Friendly")
    public void userSelectsEcoFriendly(){
        homePage.clickEcoFriendlyProductsButton();
        System.out.println("- Button 'Shop Eco-Friendly' Clicked");
        GenericMethods.pauseExecutionFor(1);
    }
    @Then("User gets navigated to Eco_Friendly Products Page")
    public void confirmLinkNavigation(){
        System.out.println(" ");
        System.out.println("- Current URL: "+productPage.getCurrentUrl());
        System.out.println(" ");
        try {
            Assert.assertNotSame(productPage.getCurrentUrl(), homePage.getCurrentUrl());
            System.out.println("- URL Navigation Successful");
        }catch (AssertionError e){
            System.out.println("- URL Navigation Failed");
        }

    }

    // Select Product #WH09
    //@Given("The Product Page Shop Eco-Friendly is loaded 1")
    //    public void scenarioProductPage(){ // Use for Solo Test - Product Page
//        driver.get("https://magento.softwaretestingboard.com/collections/eco-friendly.html");
//        GenericMethods.pauseExecutionFor(2);
//    }
    @Given("The Product Page Shop Eco-Friendly is loaded 1")
    public void loadProductPage(){
        GenericMethods.pauseExecutionFor(2);
    }
    @When("User selects Product #WH09")
    public void selectProductWH09() {
        //productPage.selectProduct(); // driver
        productPage.actionSelectProduct(); // Actions
        GenericMethods.pauseExecutionFor(2);
        System.out.println("- Product 'Ariel Roll Sleeve Sweatshirt' Selected");
    }
    @Then("User gets navigated to Product #WH09 Details Page")



    // Select Product Size
    //    @Given("The Product Page Shop Eco-Friendly is loaded 2") // Solo Test Scenario - Product Details Page
//    public void productPageDetailsLoaded() {
//        driver.get("https://magento.softwaretestingboard.com/ariel-roll-sleeve-sweatshirt.html");
//        GenericMethods.pauseExecutionFor(2);
//    }
    @Given("The Product #WH09 Details Page is loaded 2")
    public void productPageDetailsLoaded(){
        GenericMethods.pauseExecutionFor(2);
        System.out.println("- [Add to Cart] button is displayed");
        System.out.println(" ");
        System.out.println("- Current URL: " + productDetailsPage.getCurrentUrl());
        System.out.println(" ");
        System.out.println("- Product: " + productDetailsPage.productInfo());
        System.out.println("- Description: " + productDetailsPage.productDescription());
        System.out.println(" ");
        GenericMethods.pauseExecutionFor(2);
    }
    @When("User selects the size: M")
    public void confirmSizeSelection(){

        productDetailsPage.sizeSelection();
        GenericMethods.pauseExecutionFor(1);
    }
    @Then("Size Medium is selected")

    // Select Product Color
    @Given("The Product #WH09 Details Page is loaded 3")
    //    @Given("The Product Page Shop Eco-Friendly is loaded") // Solo Test Scenario - Product Details Page
//    public void productPageLoaded() {
//        driver.get("https://magento.softwaretestingboard.com/ariel-roll-sleeve-sweatshirt.html");
//        GenericMethods.pauseExecutionFor(2);
//    }
    @When("User selects the color: Green")
    public void confirmColorSelection() {

        productDetailsPage.colorSelection();
        GenericMethods.pauseExecutionFor(1);

    }@Then("The color Green is selected")


    // Update QTY
    @Given("Both Size and Color are Selected")
    //    @Given("The Product Page Shop Eco-Friendly is loaded") // Solo Test Scenario - Product Details Page
//    public void productPageLoaded() {
//        driver.get("https://magento.softwaretestingboard.com/ariel-roll-sleeve-sweatshirt.html");
//        GenericMethods.pauseExecutionFor(2);
//    }
    @When("User select the QTY input field")
    public void editQTY() {

        productDetailsPage.inputQTY();
        GenericMethods.pauseExecutionFor(1);

    }
    @And("Current entry is cleared")
    @Then("User updates entry")


    // Add Product #WH09 to Cart
    @Given("The Product #WH09 Details Page is loaded 4")
    public void loadProductDetailsPage(){
        GenericMethods.pauseExecutionFor(1);
    }
    @When("User clicks the Add-to-Cart button")
    public void addItemToCart() {
        productDetailsPage.addProductToCart();
        GenericMethods.pauseExecutionFor(4);
    }
    @Then("Product #WH09 with Selections is added to cart")


    // Proceed to checkout
    @Given("The Product #WH09 is added to cart")
    public void cartIsPresent(){
        productDetailsPage.cartIsPresent();
        GenericMethods.pauseExecutionFor(2);

    }
    @When("User clicks Shopping Cart button")
    public void proceedToCheckout() {
        productDetailsPage.proceedToCheckout();
        GenericMethods.pauseExecutionFor(2);
    }
    @Then("User gets navigated to Shipping Checkout Page")



    // Confirm Shipping Details
    @Given("User is on Shipping Checkout Page")
    public void confirmShipping(){
        Assert.assertTrue(checkoutShippingPage.verifyOrderSummary());
        checkoutShippingPage.orderSummary();
    }
    @When("User enters shipping data information")
    public void enterShippingData() {
        checkoutShippingPage.enterShippingDetails();
    }

    @And("UserName {} is used")
    public void usernameIsUsed(String user) {
        user = propertyShip.getProperty("userName");
        System.out.println("- UserName '"+user+"' is used");
    }
    @And("User selects Shipping Method")
    @And("User clicks Next")
    @Then("User gets navigated to Payment Checkout Page")
    public void userNavigatedToPaymentCheckout(){
        GenericMethods.pauseExecutionFor(3);
        checkoutPaymentPage.finalOrderSummary();
    }



    // Confirm Payment Details
    @Given("The Shipping and Billing Information is Synced")
    public void verifyShippingBillingSync(){
        checkoutPaymentPage.verifyBillingShippingSync();
    }
    @When("User input Coupon Code")
    public void userInputCouponCode() {
        checkoutPaymentPage.inputCouponCode();
    }
    @And("User clicks Place Order")
    public void userClicksPlaceOrder() {
        checkoutPaymentPage.finalizeOrder();
    }
    @Then("User is navigated to Final Checkout Page")



    // Final Checkout Summary
    @Given("The user navigated successfully to the Final Checkout Page")
    @Then("Order confirmation # is displayed")
    public void confirmOrderSuccess() {
        checkoutFinalPage.confirmOrderComplete();
    }

    // Teardown

    @After
    public void tearDown(){
        driver.quit();
    }



}
