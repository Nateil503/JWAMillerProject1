Feature: Planet & Moon Removal

  Scenario: The user is able to add and remove Planets & Moons
    Given   the user is on the home page
    When    the user clicks the add button
    When    the user provides planet name "Ketzar"
    Then    the user should be redirected to the home page.

  Scenario: The user adds their first moon
    Given   the user is on the home page
    When    the user clicks the add button
    And     the user provides moon name "Khonsu"
    When    the user selects "Ketzar" from the planet dropdown
    And     the user attaches the moon "Khonsu" to the planet "Ketzar"
    Then    the user should be redirected to the home page.

  Scenario: The user is unable to add a planet
    Given   the user is on the home page
    When    the user clicks the add button
    When    the user provides planet name "<planetID>"
    And     the user provides invalid file type
    When    the user selects "Ketzar" from the planet dropdown
    And     the user attaches the moon "Khonsu" to the planet "Ketzar"
    Then    the user should be redirected to the home page.

  Scenario: The user is able to manage their Planets & Moons
    Given   the user is on the home page
    When    the user planets are visible
    And     the user moons are visible
    When    the user provides planet name "Ketzar"
    And     the user provides moon name "Khonsu"
    And     the user provides valid file type
    And     the user clicks the add button
    Then    an alert should appear saying "<name> added successfully"
    And     the user should be redirected to the home page.


  Scenario Outline: User is unable to add and remove Planets & Moons to update findings
    Given   the user is on the home page
    When    the user planets are visible
    And     the user moons are visible
    When    the user clicks the Manage button for the planet "<moonID>"
    And     the user clicks the Manage button for the moon "<planetID>"
    When    the user provides planet name "<planetID>"
    And     the user provides moon name "<moonID>"
    And     the user provides invalid "<filetype>"
    When    the user clicks the add button
    When    the user clicks the remove button
    Then    an alert should appear saying "Invalid Planet/Moon"
    Then    an alert should appear saying "<message>"
    And     the user should be redirected to the home page.


# This allows for Cucumber to run through each test case
    Examples:
      |planetID  | moonID | filetype      |   message        |
      | Ketzar   | Luna   |   .JPEG       |Invalid moon name|
      | Ketzar   | Luna   |    .JPEG      |Invalid moon name|
      | Ketzar   | Luna   |   .JPEG       |Invalid moon name|
      | Ketzar   | Luna   |   .JPEG       |Invalid moon name|
      | Pluto    | Khonsu |   .PNG        |Invalid planet name|
      | Pluto    | Khonsu |    .PNG       |Invalid planet name|
      | Pluto    | Khonsu |  .PNG         |Invalid planet name|
      | Pluto    | Khonsu |   .PNG        |Invalid planet name|
      | Ketzar   | Khonsu |   .GIF        |Invalid file type  |
      | Ketzar   | Khonsu |   .TIFF       |Invalid file type  |
      | Ketzar   | Khonsu |   .BMP        |Invalid file type  |


