Feature: Test Google search functionality
    
Scenario: as a user i enter a search criteria in google
    Given Im on the Google search page
    When I enter a search criteria
    And clic on the search buttom
    Then The results match the criteria