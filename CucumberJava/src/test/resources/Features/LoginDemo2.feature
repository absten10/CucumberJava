Feature: Test login functionality

  Scenario Outline: Check login is successful with valid credentials
    Given Browser is open
    And User is on login page
    When user enters <Username> and <Password>
    And user clicks on Login
    Then User is navigated to the HomePage

    Examples: 
      | Username | Password |
      | Add      |    12345 |
      | Sub      |    12345 |
      | Mul      |    12345 |
