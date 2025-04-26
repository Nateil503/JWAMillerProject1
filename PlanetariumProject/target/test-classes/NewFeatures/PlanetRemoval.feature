Feature: Planet Removal

  Scenario: The user is able to remove planets from their celestial table
    Given   the user is on the home page
    When    the user planets are visible
    And     the user moons are visible
    When    the user selects "Planet" from the dropdown
    When    the user provides planet name "Ketzar"
    When    the user clicks the delete button
    Then    the user should be redirected to the home page.

  Scenario Outline: The user is unable to remove planets from their celestial table
    Given   the user is on the home page
    When    the user planets are visible
    And     the user moons are visible
    When    the user selects "Planet" from the dropdown
    When    the user provides planet name "<planetName>"
    When    the user clicks the delete button
    Then    an alert should appear saying "<message>"

    Examples:
      |                 planetName              |             message           |
      | Ketzarr                                 |       Invalid planet name     |
      | Ket_Zar1                                |       Invalid planet name     |
      | Ket-Zar0                                |       Invalid planet name     |
      | Ket Zar4                                |       Invalid planet name     |
      | Kiltzar                                 |       Invalid planet name     |
      | ThisIsAVLong-Name                       |       Invalid planet name     |
      | This sho1uldbeWayM0rethan30Characters   |       Invalid planet name     |
      | IGuessThisCanWork:                      |       Invalid planet name     |
      | *WellIGuess*/                           |       Invalid planet name     |
      | Will^This)Work3                         |       Invalid planet name     |