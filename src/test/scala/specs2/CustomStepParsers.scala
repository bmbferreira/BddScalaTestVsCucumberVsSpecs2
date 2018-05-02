package specs2

import bank.BankAccount
import org.specs2.specification.script.{StepParser, StepParsers}

object CustomStepParsers extends StepParsers {

  private val regex = ".*\\$(.*)$"

  def aDouble = readAs(regex).and((s: String) => s.toDouble)

  def aBankAccount =
    readAs(regex).and((s: String) => new BankAccount(s.toDouble))

}
