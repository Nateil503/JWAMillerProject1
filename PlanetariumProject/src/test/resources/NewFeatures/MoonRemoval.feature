Feature: Moon Removal

  Scenario: The user is able to remove moons from their page
    Given   the user is on the home page
    When    the user planets are visible
    And     the user moons are visible
    When    the user selects "Moon" from the dropdown
    When    the user provides moon name "Khonsu"
    And     the user provides valid Orbited Planet ID "1"
    When    the user clicks the delete button
    Then    the user should be redirected to the home page.

  Scenario Outline: The user is unable to remove moons from their page
    Given   the user is on the home page
    When    the user planets are visible
    And     the user moons are visible
    When    the user selects "Moon" from the dropdown
    When    the user provides moon name "<moonName>"
    When    the user clicks the delete button
    Then    an alert should appear saying "<message>"

    Examples:
      |                  moonName               |             message         |
      | Khonsuu                                 |       Invalid moon name     |
      | Khon_Zu157                              |       Invalid moon name     |
      | Khon-Zuu                                |       Invalid moon name     |
      | Khon Zuu                                |       Invalid moon name     |
      |                                         |       Invalid moon name     |
      | ThisIsALong-Namee                       |       Invalid moon name     |
      | This should1beWayM0rethan30Characters   |       Invalid moon name     |
      | IGuessThisCanWorkk                      |       Invalid moon name     |
      | *WellIGuess*%                           |       Invalid moon name     |
      | Will^This)Workh                         |       Invalid moon name     |
