Feature: Login

  Rule: Customer need to provide valid credentials to access the product catalog
    @User_login
    Scenario: Colin log in with valid credentials
      Given Colin is on the login page
      When standard_user logs in with valid credentials
      Then she should be presented with the product catalog

    @User_login2
    Scenario: Access with correct credentials to Saucelabs
      Given The user access to the Saucelabs page
      When It is written user and password
      And Clicks on the login button
      Then Must be visualized the Saucelabs products page "Products"