Feature: Planet & Moon Removal

  Scenario: The user is able to manage their Planets & Moons to update findings
    Given   the user is on the home page
    When    the user's planets/moons are visible in the Planets & Moons directory
    When    the user clicks on the manage Planets & Moons link
    When    the user provides "<planetname>" name
    And     the user provides "<moonname>"
    And     the user clicks the remove button
    Then    an alert should appear saying "<name> removed successfully"
    And     the user should be redirected to the home page


  Scenario Outline: User is unable to manage their Planets & Moons to update findings
    Given   the user is on the home page
    When    the user's planets/moons are visible in the Planets & Moons directory
    When    the user clicks on the manage Planets & Moons link
    When    the user provides invalid "<planetID>"
    And     the user provides invalid "<moonID>"
    When    the user clicks the remove button
    Then    an alert should appear saying "Invalid Planet/Moon"
    And     the user should be remain on the Planets & Moons directory


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


