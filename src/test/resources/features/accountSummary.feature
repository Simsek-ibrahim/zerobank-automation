Feature: Account Summary

  Scenario: The user should be able to see the account details
    Given User should be on the login page
    When User should input username "username" and password "password"
    And "Account Summary" page should be displayed
    Then User should see the following account Types
      | Cash Accounts       |
      | Investment Accounts |
      | Credit Accounts     |
      | Loan Accounts       |
    Then Credit Accounts Table should have following columns
      | Account     |
      | Credit Card |
      | Balance     |