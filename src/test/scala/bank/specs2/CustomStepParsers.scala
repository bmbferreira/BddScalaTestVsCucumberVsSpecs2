package bank.specs2

import bank.BankAccount
import org.specs2.specification.script.{StepParser, StepParsers}

object CustomStepParsers extends StepParsers {

  private val regex = ".*\\$(.*)$"

  def aDouble: StepParser[Double] = readAs(regex).and((s: String) => s.toDouble)

  def aBankAccount: StepParser[BankAccount] =
    readAs(regex).and((s: String) => new BankAccount(s.toDouble))

}
