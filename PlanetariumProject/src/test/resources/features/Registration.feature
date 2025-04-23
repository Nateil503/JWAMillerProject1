Feature: User Registration

  Scenario: Valid credential data should allow for registration with the Planetarium
    Given   the user is on the login page
    When    the user clicks on the register link
    When    the user provides username "Robin" while registering
    And     the user provides password "Robin1" while registering
    When    the user clicks the register button
    Then    an alert should appear saying "Account created successfully"
    And     the user should be redirected to the login page.


  Scenario Outline: Invalid credentials should not allow for registration with the Planetarium
    Given   the user is on the login page
    When    the user clicks on the register link
    When    the user provides username "<username>" while registering
    And     the user provides password "<password>" while registering
    When    the user clicks the register button
    Then    an alert should appear saying "<message>"
    And     the user should remain on the registration page

# This allows for Cucumber to run through each test case
    Examples:
      | username | password | message          |
      | Batman   | Bobb1    | Invalid username |
      | bobb     | Bobb1    | Invalid username |
      | Robin!%? | Bobb1    | Invalid username |
      | 3obin    | Bobb1    | Invalid username |
      | Robin    | Bob3     | Invalid password |
      | Robin    | bobby    | Invalid password |
      | Robin    | Bobby    | Invalid password |
      | Robin    | bobb3    | Invalid password |
      | Robin    | BOBB3    | Invalid password |
      | Robin    | Bobb3!?  | Invalid password |
      | Robin    | 3obbY    | Invalid password |