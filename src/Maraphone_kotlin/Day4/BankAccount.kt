package Maraphone_kotlin.Day4

class BankAccount(var accountHoider: String, var balance: Double) {
    private val transactionHistory = mutableListOf<String>()

    fun deposit(amount: Double) {
        balance += amount
        transactionHistory.add("$accountHoider deposited $$amount")
    }


    fun withdraw(amount: Double) {
        if (amount <= balance) {
            balance -= amount
            transactionHistory.add("$accountHoider withdrew $$amount")
        } else {
            println("У вас недостаточно средств $$amount")
        }
    }

    fun displayTransactionHistory() {
        for (transaction in transactionHistory) {
            println(transaction)
        }
    }
    fun displayBalace(){
        println("${accountHoider}'s balance is ${balance}")
    }
}