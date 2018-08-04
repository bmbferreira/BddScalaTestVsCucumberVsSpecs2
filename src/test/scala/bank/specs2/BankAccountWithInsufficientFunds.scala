package bank.specs2

import bank.specs2.CustomStepParsers._
import org.specs2._
import org.specs2.specification.script.GWT

class BankAccountWithInsufficientFunds extends Specification with GWT {

  def is =
    s2"""
     Given an account with a balance of $$80.25                                        ${bankAccount.start}
     When the Account Holder requests $$100.75
     Then the Account Holder should be notified that overdrafts are not permitted      ${bankAccount.end}
    """

  private val bankAccount =
    Scenario("A Bank Account with Insufficient Funds")
      .given(aBankAccount)
      .when(aDouble) { case debit :: bAccount :: _ => bAccount.debit(debit) }
      .andThen() {
        case insufficientFunds :: bAccount :: _ =>
          bAccount.left.exists(msg => insufficientFunds.toLowerCase.contains(msg.toLowerCase))
      }
}
