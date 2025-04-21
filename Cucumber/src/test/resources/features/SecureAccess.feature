Feature: Secure Access

  Scenario: Valid credential data should allow for access to the Planetarium's home page
    Given   the user is on the login page
    When    the user provides a valid username "Robin" while logging in
    And     the user provides a valid password "Bobb1" while logging in
    Then    an alert should appear saying "Welcome back! <username>"
    And     the user should be redirected to the home page.


  Scenario Outline: Invalid credentials should not allow for access to the Planetarium's home page
    Given   the user is on the login page
    When    the user clicks on the register link
    When    the user provides username "<username>"
    And     the user provides password "<password>"
    Then    an alert should appear saying "<message>"
    And     the user should remain on the login page

# This allows for Cucumber to run through each test case
    Examples:
      | username | password | message          |
      | Batman   | Bobb1    | Invalid Username |
      | bobb     | Bobb1    | Invalid Username |
      | Robin!%? | Bobb1    | Invalid Username |
      | 3obin    | Bobb1    | Invalid Username |
      | Robin    | Bob3     | Invalid Password |
      | Robin    | bobby    | Invalid Password |
      | Robin    | Bobby    | Invalid Password |
      | Robin    | bobb3    | Invalid Password |
      | Robin    | BOBB3    | Invalid Password |
      | Robin    | Bobb3!?  | Invalid Password |
      | Robin    | 3obbY    | Invalid Password |
