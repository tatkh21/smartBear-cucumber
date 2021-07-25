Feature: SmartBear order process with Scenario Outline

  Background: Assuming user logged in with valid credentials
    Given user logged in to the SmartBear app

@wip
  Scenario Outline: User is logged into SmartBear Tester account and on Order page
    Given User clicks to "Order"
    And User selects "<product>" from product dropdown
    And User enters "<quantity>" to quantity
    And User enters "<name>" to costumer name
    And User enters "<street>" to street
    And User enters "<city>" to city
    And User enters "<state>" to state
    And User enters "<zip>" to Zip
    And User selects "<card type>" as card type
    And User enters "<card number>" to card number
    And User enters "<experation date>" to expiration date
    And User clicks process button
    Then User verifies "<name>" is in the list

    Examples: form fields we are going to use
      | name            | street             | city        | state | zip   | card number      | expiration date | quantity | product     | card type        |experation date|
      | John Wick       | Kenzie Ave         | Chicago     | IL    | 60056 | 1111222233334444 | 12/22           | 1        | FamilyAlbum | Visa             |12/23          |
      | Ken Adams       | San Luis Ave       | San Jose    | CA    | 95117 | 2311222237434444 | 08/22           | 10       | MyMoney     | MasterCard       |11/22          |
      | Rachel Green    | Santa Teressa blvd | Chicago     | IL    | 60966 | 5691222233334444 | 12/22           | 9        | ScreenSaver | American Express |10/25          |
      | Luis Garcia     | Olive Hill Drive   | San Jose    | CA    | 95117 | 7811222237434444 | 08/22           | 3        | MyMoney     | Visa             |10/23          |
      | Elariz Memmedov | Axirinci povorot   | Chicago     | IL    | 71966 | 5691759233334444 | 12/22           | 7        | ScreenSaver | MasterCard       |11/23          |
      | Zelimxan Yagub  | Sinonimler Toplusu | Los Angelas | CA    | 85117 | 7811222237434444 | 08/22           | 21       | MyMoney     | American Express |12/24          |