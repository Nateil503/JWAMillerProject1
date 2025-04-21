Feature: Planet & Moon Removal

  Scenario: The user is able to manage their Planets & Moons
    Given   the user is on the home page
    When    the user's planets/moons are visible in the Planets & Moons directory
    When    the user clicks on the manage Planets & Moons link
    And     the user clicks remove Planet/Moon
    Then    an alert should appear saying "(PlanetMoon) removed successfully"
    And     the user should be redirected to the Planets & Moons directory


  Scenario Outline: User is unable to remove Planets & Moons to update findings
    Given   the user is on the home page
    When    the user clicks on Planets & Moons directory link
    When    the user clicks on the manage Planets & Moons link
    And     the user clicks remove Planet/Moon
    Then    an alert should appear saying "<message>"
    And     the user should be redirected to the Planets & Moons directory

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