Feature: valid login functionality

  Scenario: verify user can login with valid credentials
    Given USER OPENS THE WEBSITE
    Then verify user is on on login page
    When user enters username "valid.username" and password "valid.password"
    Then verify user is on home page