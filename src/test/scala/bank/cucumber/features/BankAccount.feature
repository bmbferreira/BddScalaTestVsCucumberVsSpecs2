Feature: Account Holder withdraws cash

  Scenario: The account has sufficient funds
    Given an account with a balance of $100.5
    When the Account Holder requests $20.25
    Then the account balance should be $80.25

  Scenario: The account has insufficient funds
    Given an account with a balance of $80.25
    When the Account Holder requests $100.75
    Then the Account Holder should be notified that overdrafts are not permitted