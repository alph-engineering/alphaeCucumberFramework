package stepdefinitions;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ShopWH09StepDef {

    // Launch Browser
    @Given("WebDriver is initiated")
    public void setUp() {
    }
    @Then("Browser launches")
    public void confirmApplicationLaunch() {
    }

    // Navigate to Shop Eco-Friendly Products
    @Given("The HomePage is loaded")
    public void confirmProductsListed(){
    }
    @When("User selects Shop Eco-Friendly")
    @Then("User gets navigated to Eco_Friendly Products Page")
    public void confirmLinkNavigation(){

    }


    // Select Product #WH09
    @Given("The Product Page Shop Eco-Friendly is loaded")
    public void selectProductWH09() {

    }
    @When("User selects on Product #WH09")
    public void confirmAddToCartSelection() {

    }
    @Then("User gets navigated to Product #WH09 Details Page")
    public void getProductDetails() {
    }

    // Select Product Size
    @Given("The Product #WH09 Details Page is loaded 1")
    @When("User selects the size: M")
    @Then("Size Medium is selected")
    public void confirmSizeSelection() {
    }

    // Select Product Color
    @Given("The Product #WH09 Details Page is loaded 2")
    @When("User selects the color: Green")
    @Then("The color Green is selected")
    public void confirmColorSelection() {
    }

    // Update QTY
    @Given("The Both Size and Color are Selected")
    @When("User select the QTY input field")
    @And("Current entry is cleared")
    @Then("User updates entry")
    public void editQTY() {

    }

    // Add Product #WH09 to Cart
    @Given("The Product #WH09 Details Page is loaded")
    @When("User clicks the Add-to-Cart button")
    @Then("Product #WH09 with Selections is added to cart")
    public void addItemToCart() {

    }
    // Proceed to checkout
    @Given("The Product #WH09 is added to cart")
    public void viewFooter() {
    }
    @When("User clicks Shopping Cart button")

    @And("User clicks on Proceed to Checkout button")

    @Then("User gets navigated to Shipping Checkout Page")
    public void proceedToCheckout() {
    }

    // Confirm Shipping Details
    @Given("User is on Shipping Checkout Page")
    @When("User enters shipping data information")
    public void confirmShipping() {
    }
    @And("User selects Shipping Method")
    public void userSelectsShippingMethod() {
    }
    @And("User clicks Next")
    public void userClicksNext() {
    }
    @Then("User gets navigated to Payment Checkout Page")
    public void userNavigatedToPaymentCheckoutPage() {
    }
    // Confirm Payment Details
    @Given("The Shipping and Billing Information is Synced")
    @When("User input Coupon Code")
    public void userInputCouponCode() {
    }
    @And("User clicks Place Order")
    public void userClicksPlaceOrder() {
    }
    @Then("User is navigated to Final Checkout Page")
    public void confirmPayment() {
    }
    // Final Checkout Summary
    @Given("The user navigated successfully to the Final Checkout Page")
    public void confirmOrderSuccess() {
    }

    @Then("Order confirmation # is displayed")
    public void orderConfirmationIsDisplayed() {
    }



}
