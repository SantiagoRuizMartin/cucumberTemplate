Feature: template feature

  Background:
    Given the background is ready


  Scenario Outline:
    Given the <parameters> are ready
    And additional Step
    When The functionality is used
    Then The functionality should work
    Examples:
      | parameters |
      | parameter  |

  Scenario Outline:
    Given the <parameters> are ready
    When The functionality is used
    Then The functionality should work
    Examples:
      | parameters |
      | parameter  |