package Maraphone_kotlin.Day4


fun main(){

    val myBankAccount = BankAccount("Счет Ивана", 1777.21)


    myBankAccount.deposit(200.0)
    myBankAccount.withdraw(100.00)
    myBankAccount.deposit(900.01)
    myBankAccount.deposit(200.00)
    myBankAccount.withdraw(666.15)

    myBankAccount.displayTransactionHistory()
    myBankAccount.displayBalace()
    val saraBankAccount = BankAccount("Счет Sara", 0.0)
    saraBankAccount.deposit(100.0)
    saraBankAccount.withdraw(10.0)
    saraBankAccount.deposit(300.0)
    saraBankAccount.displayTransactionHistory()
    saraBankAccount.displayBalace()

}
