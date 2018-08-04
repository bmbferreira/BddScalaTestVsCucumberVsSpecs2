package bank.scalatest

import bank.BankAccount
import org.scalatest.{FeatureSpec, GivenWhenThen}

class BankAccountSpecs extends FeatureSpec with GivenWhenThen {

  feature("Account Holder withdraws cash") {
    scenario("The account has sufficient funds") {
      val balance = 100.5
      Given(s"""an account with a balance of $$$balance""")
      val bankAccount = new BankAccount(balance)
      val withdrawAmount = 20.25
      When(s"the Account Holder requests $$$withdrawAmount")
      val resultBankAccount = bankAccount.debit(withdrawAmount)
      val expectedBalance = 80.25
      Then(s"the account balance should be $$$expectedBalance")
      assert(resultBankAccount.right.exists(_.balance == expectedBalance))
    }

    scenario("The account has insufficient funds") {
      val balance = 80.25
      Given(s"""an account with a balance of $$$balance""")
      val bankAccount = new BankAccount(balance)
      val withdrawAmount = 100.75
      When(s"the Account Holder requests $$$withdrawAmount")
      val resultBankAccount = bankAccount.debit(withdrawAmount)
      val expectedMessage = "overdrafts are not permitted"
      Then(s"the Account Holder should be notified that $expectedMessage")
      assert(resultBankAccount.left.exists(_.equalsIgnoreCase(expectedMessage)))
    }
  }
}
