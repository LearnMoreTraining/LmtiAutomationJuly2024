Feature: Learn More Page Automation

  @LMTI01
  Scenario: Validation UI and Alert Message
    Given user clicks the confirm box
    And user get confirm box text
    When user clicks on cancel button
    Then verify the UI text

    @LMTI02
  Scenario: error message Validation
    Given user enter username and password
    When user clicks the login button
    Then user validate the error message

      @lmti03
  Scenario: Text Validation
    Given user clicks on change text
    Then validate the text