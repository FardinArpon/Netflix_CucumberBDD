Feature: Login to Netflix website

  Scenario Outline: Verify users can login to portal with valid credentials
    Given User visits website
    When User enters valid "<username>" and "<password>"
    Then User can logged in successfully

    Examples:
      | username           | password |
      | xyzabc@abc.net     | abc123   |