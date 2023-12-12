  Feature: Add-to-Cart Functionality

  Background: Browser Launch
    Given WebDriver is initiated
    Then Browser launches

  Scenario Outline: Load Application
    Given The HomePage is loaded
    When User selects Shop Eco-Friendly
    Then User gets navigated to Eco_Friendly Products Page
  #Scenario: Select Product WH09 Details (A)
    Given The Product Page Shop Eco-Friendly is loaded 1
    When User selects Product WH09
    Then User gets navigated to Product WH09 Details Page
  #Scenario: Select Product WH09 Details (B)
    Given The Product WH09 Details Page is loaded 2
    When User selects the size: M
    Then Size Medium is selected
  #Scenario: Select Product WH09 Details (C)
    Given The Product WH09 Details Page is loaded 3
    When User selects the color: Green
    Then The color Green is selected
  #Scenario: Select Product WH09 Details (D)
    Given Both Size and Color are Selected
    When User select the QTY input field
    And Current entry is cleared
    Then User updates entry

    Given The Product WH09 Details Page is loaded 4
    When User clicks the Add-to-Cart button
    Then Product WH09 with Selections is added to cart

    Given The Product WH09 is added to cart
    When User clicks Shopping Cart button
    Then User gets navigated to Shipping Checkout Page

    Given User is on Shipping Checkout Page
    When User enters shipping data information
    And UserName "<example>" is used
    And Shipping Method is selected
    And User clicks Next
    Then User gets navigated to Payment Checkout Page

    Given The Shipping and Billing Information is Synced
    When User input Coupon Code
    And User clicks Place Order
    Then User is navigated to Final Checkout Page

    Given The user navigated successfully to the Final Checkout Page
    Then Order confirmation number is displayed

    Examples:
      | example           |
      | test@engineer.com |
