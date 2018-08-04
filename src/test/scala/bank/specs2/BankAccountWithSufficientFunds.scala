package bank.specs2

import bank.specs2.CustomStepParsers._
import org.specs2._
import org.specs2.specification.script.GWT

class BankAccountWithSufficientFunds extends Specification with GWT {

  def is =
    s2"""
     Given an account with a balance of $$100.5     ${bankAccount.start}
     When the Account Holder requests $$20.25
     Then the account balance should be $$80.25     ${bankAccount.end}
    """

  private val bankAccount =
    Scenario("bankAccount")
      .given(aBankAccount)
      .when(aDouble) { case debit :: bAccount :: _ => bAccount.debit(debit) }
      .andThen(aDouble) {
        case expectedBalance :: bAccount :: _ =>
          bAccount.right.exists(_.balance == expectedBalance)
      }
}
