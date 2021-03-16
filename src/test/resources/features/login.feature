Feature: Login user


  Scenario: Login user
   Then click "Log In" button
    Then input login
    Then input password
    Then click "Log in" button span
    Then Content with "Courses you might be interested in" visible