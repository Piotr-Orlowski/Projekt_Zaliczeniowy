Feature: MyStore user account
@login
  Scenario: Login to MyStore account

    Given I'm on MyStore main page
    When I enter valid username and password
    Then I'm logged in
@firstaddress
  Scenario Outline: Add first address
    Given I'm logged to account
    When I'm adding first address
    And I enter alias <alias> address <address> city <city> postcode <postcode> phone <phone>
    Then I save the form

  Examples:
    | alias | address | city     | postcode | phone     |
    | Mr    | Testowa | Testcity | 00000    | 999999999 |
