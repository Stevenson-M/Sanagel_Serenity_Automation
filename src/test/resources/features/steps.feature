Feature: Test Sanagel website
           As user i want to validate the shopping car on the website

  Scenario: Add one product with quantity 2 to the shopping cart
   Given User enters the sanagel webpage
   When User select a product
    And User adds the "2" quantities of the product to the shopping cart
   Then User sees the "2" quantities of the product in the shopping cart page

  Scenario: Add two product with quantity 5 to the shopping cart
    Given User enters the sanagel webpage
    When User select a product
    And User adds the add another product to the shopping cart
    And User adds the "5" quantities of the two product to the shopping cart
    Then User sees the "5" quantities of the product in the shopping cart page






