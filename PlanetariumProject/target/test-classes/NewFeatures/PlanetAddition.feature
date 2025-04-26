Feature: Planet Addition

  Scenario: The user is able to add planets to their page
    Given   the user is on the home page
    When    the user planets are visible
    And     the user moons are visible
    When    the user selects "Planet" from the dropdown
    When    the user provides planet name "Ketzar"
    When    the user clicks the submit button
    Then    the user should be redirected to the home page.
    
  Scenario Outline: The user is unable to add planets to their page
    Given   the user is on the home page
    When    the user planets are visible
    And     the user moons are visible
    When    the user selects "Planet" from the dropdown
    When    the user provides planet name "<planetName>"
    When    the user clicks the submit button
    Then    an alert should appear saying "<message>"

    Examples:
    |                 planetName              |             message           |
    | Ketzar                                  |       Invalid planet name     |
    | Ket_Zar1                                |       Invalid planet name     |
    | Ket-Zar                                 |       Invalid planet name     |
    | Ket Zar                                 |       Invalid planet name     |
    |                                         |       Invalid planet name     |
    | ThisIsALong-Name                        |       Invalid planet name     |
    | This shouldbeWayM0rethan30Characters    |       Invalid planet name     |
    | IGuessThisCanWork                       |       Invalid planet name     |
    | *WellIGuess*                            |       Invalid planet name     |
    | Will^This)Work                          |       Invalid planet name     |