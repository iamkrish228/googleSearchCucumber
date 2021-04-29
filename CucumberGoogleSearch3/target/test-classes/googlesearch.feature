Feature: Search a word in Google

  Background: 
    Given On the Google Search Page

  Scenario: Search a word in Google
    When Type Ducks and click on the Search
    Then Check for the Search Results

  Scenario: Verify the Search link
    When Type Ducks and click on the Search
    Then Check for the Search Results
    Then Verify the search link

  Scenario: Click the Search link
    When Type Ducks and click on the Search
    Then Check for the Search Results
    Then Click the search link

  #Search for a word other than "Ducks" and check if we get the same link (Negative)
  Scenario: Check for a different search word
    When Type Eagle and click on the Search
    Then Check for the Search Results

  #Type Special characters and check if we get the same link (Negative)
  Scenario: Check for a Special characters search
    When Type special characters and click on the Search
    Then Check for the Search Results