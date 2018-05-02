package specs2

import org.specs2._
import CustomStepParsers._
import org.specs2.specification.script.GWT

class BankAccountWithSufficientFunds extends Specification with GWT {

  def is =
    s2"""
     Given an account with a balance of $$100    ${bankAccount.start}
     When the Account Holder requests $$20
     Then the account balance should be $$80     ${bankAccount.end}
    """

  val bankAccount =
    Scenario("bankAccount")
      .given(aBankAccount)
      .when(aDouble) { case debit :: bAccount :: _ => bAccount.debit(debit) }
      .andThen(aDouble) {
        case expectedBalance :: bAccount :: _ =>
          bAccount.right.exists(_.balance == expectedBalance)
      }
}
