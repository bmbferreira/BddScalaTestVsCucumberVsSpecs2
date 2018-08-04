package bank

class BankAccount(val balance: Double) {

  def debit(amount: Double): Either[String, BankAccount] = {
    if (amount < 0.0) {
      Left(s"The debit amount must be > 0.0")
    } else if (balance - amount < 0.0) {
      Left("Overdrafts are not permitted")
    } else {
      Right(new BankAccount(balance - amount))
    }
  }

  def credit(amount: Double): Either[String, BankAccount] = {
    if (amount < 0.0) {
      Left("The credit amount must be > 0.0")
    } else {
      Right(new BankAccount(balance + amount))
    }
  }
}
