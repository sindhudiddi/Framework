Feature: LoginFeature
  User tries to login

  Scenario: Login with correct user name and password
    Given User navigated to login page of the application
    And User entered the creds
      | Username | Password |
      | admin2@gmail.com    | 12345678     |
    And User clicked on ok button
    Then User should be able to see the userform page

