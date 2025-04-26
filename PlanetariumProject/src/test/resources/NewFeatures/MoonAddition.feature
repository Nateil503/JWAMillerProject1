Feature: Moon Addition

  Scenario: The user is able to add moons to their page
    Given   the user is on the home page
    When    the user planets are visible
    And     the user moons are visible
    When    the user selects "Moon" from the dropdown
    When    the user provides moon name "Khonsu"
    And     the user provides valid Orbited Planet ID "1"
    When    the user clicks the submit button
    Then    the user should be redirected to the home page.

  Scenario Outline: The user is unable to add planets to their page
    Given   the user is on the home page
    When    the user planets are visible
    And     the user moons are visible
    When    the user selects "Moon" from the dropdown
    When    the user provides moon name "<moonName>"
    And     the user provides invalid Orbited Planet ID "<planetID>"
    When    the user clicks the submit button
    Then    an alert should appear saying "<message>"

    Examples:
      |                  moonName               |             planetID             |             message         |
      | Khonsu                                  |                1                 |       Invalid moon name     |
      | Khon_Zu15                               |                1                 |       Invalid moon name     |
      | Khon-Zu                                 |                1                 |       Invalid moon name     |
      | Khon Zu                                 |                1                 |       Invalid moon name     |
      |                                         |                1                 |       Invalid moon name     |
      | ThisIsALong-Name                        |                1                 |       Invalid moon name     |
      | This shouldbeWayM0rethan30Characters    |                1                 |       Invalid moon name     |
      | IGuessThisCanWork                       |                1                 |       Invalid moon name     |
      | *WellIGuess*                            |                1                 |       Invalid moon name     |
      | Will^This)Work                          |                1                 |       Invalid moon name     |
      | Khonsu                                  |                5                 |       Invalid planet ID     |
      | Khonsu                                  |                4                 |       Invalid planet ID     |
      | Khonsu                                  |                8                 |       Invalid planet ID     |
      | Khonsu                                  |                2                 |       Invalid planet ID     |
      | Khonsu                                  |                7                 |       Invalid planet ID     |
      | Khonsu                                  |                6                 |       Invalid planet ID     |
      | Khonsu                                  |                3                 |       Invalid planet ID     |