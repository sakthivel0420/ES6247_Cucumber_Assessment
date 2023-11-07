Feature:Login to the demowebshop web application
Background:
Given User is in the home page 
And User clicks the log in button

  @ValidCredentials
 Scenario: User logins to the web application with valid credentials
    And User gives valid email
    And User gives valid password
    And User clicks the login button
    Then User is shown looged in to the website

  @InValidCredentials
   Scenario: User logins to the web application with Invalid credentials
    And User gives Invalid email
    And User gives Invalid password
    And User clicks the login button
    Then User is shown No customer account found message

    
