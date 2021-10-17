Feature: Login feature

  @wip
  Scenario: Login functionality under different roles verification
    Given Users login with valid credentials
    When Users cannot login with invalid credentials
    And Users can check "Remember me on this computer" option
    Then Users access to "FORGOT YOUR PASSWORD?" link page


