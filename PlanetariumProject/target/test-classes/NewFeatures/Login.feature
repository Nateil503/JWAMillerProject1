Feature: Login
  
  Scenario: Valid credential data should allow for successful login
    Given   the user is on the login page
    When    the user provides username "Batman" while logging in
    And     the user provides password "Iamthenight1939" while logging in
    When    the user clicks the login button
    Then    the user should be redirected to the home page.
    Then    a personalized greeting should appear saying "Welcome to the Home Page Batman"

  Scenario Outline: Invalid credential data should not allow for successful login
    Given   the user is on the login page
    When    the user provides username "<username>" while logging in
    And     the user provides password "<password>" while logging in
    When    the user clicks the login button
    Then    an alert should appear saying "Invalid credentials"
    And     the user should remain on the login page

  Examples:
      | username | password |
      | Batman   | Bobb1    |
      | bobb     | Iamthenight1939|
      | Robin!%? | Bobb1    |