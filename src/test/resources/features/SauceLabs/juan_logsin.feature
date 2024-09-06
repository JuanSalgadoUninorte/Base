Feature: Login

  Rule: Customer need to provide valid credentials to access the product catalo@User_test3

    Background:
      Given Aldonosa enters and logs in to SauceLabs
      When A product is added to the cart

    @User_test3
    Scenario: Addition and deletion of products in Saucelabs e-commerce
      And It is removed
      Then The cart must be empty

    @User_test4
    Scenario: Addition and deletion of products in Saucelabs e-commerce
      And It is checked that is in the cart the element "Sauce Labs Backpack"
      Then The user must get out of it and check it again "Sauce Labs Backpack"