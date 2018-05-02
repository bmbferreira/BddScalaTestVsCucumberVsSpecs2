package steps

import bank.BankAccount
import cucumber.api.scala.{EN, ScalaDsl}

class StepDefinitions extends ScalaDsl with EN {

  var bankAccount: BankAccount = _
  var result: Either[String,BankAccount] = _

  Given("""^an account with a balance of \$(\d+)$"""){ (balance:Int) =>
    bankAccount = new BankAccount(balance)
  }

  When("""^the Account Holder requests \$(\d+)$"""){ (amount:Int) =>
    result = bankAccount.debit(amount)
  }

  Then("""^the account balance should be \$(\d+)$"""){ (expectedResult:Int) =>
    assert(result.right.exists(_.balance == expectedResult))
  }

  Then("""^the Account Holder should be notified that overdrafts are not permitted$"""){ () =>
    assert(result.left.exists(_.equalsIgnoreCase("overdrafts are not permitted")))
  }
}
