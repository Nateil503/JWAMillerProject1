Feature: User Registration

  Scenario: Valid credential data should allow for registration with the Planetarium
    Given   the user is on the login page
    When    the user clicks on the register link
    When    the user provides "Robin" while registering
    And     the user provides "Bobb1" while registering
    Then    an alert should appear saying "Account created successfully"
    And     the user should be redirected to the login page.


  Scenario Outline: Invalid credentials should not allow for registration with the Planetarium
    Given   the user is on the login page
    When    the user clicks on the register link
    When    the user provides username "<username>"
    And     the user provides password "<password>"
    Then    an alert should appear saying "<message>"
    And     the user should remain on the registration page

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