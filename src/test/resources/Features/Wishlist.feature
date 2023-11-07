Feature: Adding and removing items from wishlist

  @Adding
  Scenario: Adding items to wishlist
    Given user is in the home page
    And user clicks on apparels and shoes
    And user clicks  on one item
    And User clicks on add to wishlist  
    And User clicks on Wishlist 
    Then The item is shown on the wishlist
  @Removing
  Scenario: removing items from wishlist
    Given user is in the home page
    When User clicks on Wishlist
    And the remove option is clicked
    And the update wish list is clicked
    Then the wishlist is empty message is shown
    

    
