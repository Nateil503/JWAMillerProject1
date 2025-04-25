Feature: Planet & Moon Removal

  Scenario: The user is able to view Planets & Moons
    Given   the user is on the home page
    Then    the user planets are visible
    And     the user moons are visible

  Scenario: The user adds a new planet and moon
    Given   the user is on the home page
    When    the user selects "Planet" from the dropdown
    And     the user provides planet name "Ketzar"
    When    the user clicks the submit button
    Then    the user should be redirected to the home page.
    When    the user selects "Moon" from the dropdown
    When    the user provides moon name "Khonsu"
    And     the user provides valid Orbited Planet ID "1"
    And     the user clicks the submit button
    Then    the user should be redirected to the home page.

  Scenario: The user is able to remove their Planets & Moons
    Given   the user is on the home page
    When    the user planets are visible
    And     the user moons are visible
    When    the user selects "Planet" from the dropdown
    And     the user provides planet name "Ketzar"
    When    the user selects "Moon" from the dropdown
    And     the user provides moon name "Khonsu"
    And     the user clicks the delete button
    And     the user should be redirected to the home page.


  Scenario Outline: User is unable to add new Planets and Moons to update findings
    Given   the user is on the home page
    When    the user planets are visible
    And     the user moons are visible
    When    the user selects "Planet" from the dropdown
    And     the user provides planet name "<planetName>"
    When    the user selects "Moon" from the dropdown
    And     the user provides moon name "<moonName>"
    When    the user uploads invalid "<filetype>"
    When    the user clicks the delete button
    Then    an alert should appear saying "<message>"


# This allows for Cucumber to run through each test case
    Examples:
      |planetName|moonName|  filetype     |   message         |
      | Pluto    | Luna   |   .jpeg       |Invalid planet name|
      | Ketzar   | Luna   |   .png        |Invalid moon name  |
      | Ketzar   | Khonsu |   .gif        |Invalid file type  |
      | Ketzar   | Khonsu |   .tiff       |Invalid file type  |
      | Ketzar   | Khonsu |   .bmp        |Invalid file type  |


