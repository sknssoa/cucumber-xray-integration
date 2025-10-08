Feature: Hello World

  @PO-542
  Scenario: Print greeting
    Given I have a greeting
    When I print the greeting
    Then I see "Hello BDD"
