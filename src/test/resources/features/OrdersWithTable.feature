@wip
Feature: SmartBear order process with a table

  Background: Assuming user logged in with valid credentials
    Given user logged in to the SmartBear app

  Scenario:  User is logged into SmartBear Tester account and on Order page
    Given User clicks to "Order"
    And User selects "FamilyAlbum" from product dropdown
    And User enters "4" to quantity
    And user fills out all fields as below
      | name   | John Wick  |
      | street | Kinzie Ave |
      | city   | Chicago    |
      | state  | IL         |
      | zip    | 6005610    |
    And User selects "Visa" as card type and enters card information as below
      | cardNumber     | 1111222233334444 |
      | experationDate | 12/22            |
    And User clicks process button
    Then User verifies "John Wick" is in the list
