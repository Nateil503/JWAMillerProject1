Feature: Secure Access

  Scenario: Valid credential data should allow for access to the Planetarium's home page
    Given   the user is on the login page
    When    the user provides username "Batman" while logging in
    And     the user provides password "Iamthenight1939" while logging in
    When    the user clicks the login button
    And     the user should be redirected to the home page.
    Then    a personalized greeting should appear saying "Welcome to the Home Page Batman!"


  Scenario Outline: Invalid credentials should not allow for access to the Planetarium's home page
    Given   the user is on the login page
    When    the user clicks the login button
    When    the user provides username "<username>" while logging in
    And     the user provides password "<password>" while logging in
    Then    an alert should appear saying "Invalid credentials"
    And     the user should remain on the login page

# This allows for Cucumber to run through each test case
    Examples:
      | username | password |
      | Batman   | Bobb1    |
      | bobb     | Iamthenight1939|
      | Robin!%? | Bobb1    |
