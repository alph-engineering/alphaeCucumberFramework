Feature: Add-to-Cart Functionality


  Scenario: Setup

    Given WebDriver is initiated
    Then Browser launches

  Scenario: Navigate to Shop Eco-Friendly Products

    Given The HomePage is loaded
    When User selects Shop Eco-Friendly
    Then User gets navigated to Eco_Friendly Products Page

  Scenario: Select Product #WH09

    Given The Product Page Shop Eco-Friendly is loaded
    When User selects on Product #WH09
    Then User gets navigated to Product #WH09 Details Page

  Scenario: Select Product Size

    Given The Product #WH09 Details Page is loaded 1
    When User selects the size: M
    Then Size Medium is selected

  Scenario: Select Product Color

    Given The Product #WH09 Details Page is loaded 2
    When User selects the color: Green
    Then The color Green is selected

  Scenario: Update QTY

    Given The Both Size and Color are Selected
    When User select the QTY input field
    And Current entry is cleared
    Then User updates entry

  Scenario: Add Product #WH09 to Cart

    Given The Product #WH09 Details Page is loaded
    When User clicks the Add-to-Cart button
    Then Product #WH09 with Selections is added to cart

  Scenario: Proceed to checkout

    Given The Product #WH09 is added to cart
    When User clicks Shopping Cart button
    And User clicks on Proceed to Checkout button
    Then User gets navigated to Shipping Checkout Page

  Scenario: Confirm Shipping Details

    Given User is on Shipping Checkout Page
    When User enters shipping data information
    And User selects Shipping Method
    And User clicks Next
    Then User gets navigated to Payment Checkout Page

  Scenario: Confirm Payment Details

    Given The Shipping and Billing Information is Synced
    When User input Coupon Code
    And User clicks Place Order
    Then User is navigated to Final Checkout Page

  Scenario: Final Checkout Summary

    Given The user navigated successfully to the Final Checkout Page
    Then Order confirmation # is displayed
