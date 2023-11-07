Feature: Register to the demowebshop web application

  Scenario: Registration to the web application
    Given User is in the home page
    When     User clicks the register button
    And User selects a gender
    When User provides valid credentials
    | firstname | lastname |    email           |password| conpassword|
    | sakthiasd   |   velasd   |lsfagasdae@gmail.com|admin12fdh3| admin12fdh3   |
    
    And User clicks Register 
    Then The User is shown Your registration completed message 
