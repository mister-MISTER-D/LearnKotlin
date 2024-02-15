package Maraphone_kotlin

fun main() {
    var computerChoice = ""
    var playerChoice = ""


    while(playerChoice != "Камень" && playerChoice != "Бумага" && playerChoice != "Ножницы"){

        println("Камень, Бумага или Ножницы? Введите свой выбор!")
        playerChoice = readln()
    }

    val randomNumber = (1..3).random()
    when (randomNumber) {
        1 -> computerChoice = "Камень"
        2 -> computerChoice = "Бумага"
        3 -> computerChoice = "Ножницы"
    }



    println(computerChoice)

    val winner = when {
        playerChoice == computerChoice -> "Ничья"
        playerChoice == "Камень" && computerChoice == "Ножницы" -> "Player"
        playerChoice == "Бумага" && computerChoice == "Камень" -> "Player"
        playerChoice == "Ножницы" && computerChoice == "Бумага" -> "Player"
        else -> "Компьютер"
    }

    if (winner == "Ничья") {
        println("Эх, это ничья")
    } else {
        println("$winner выиграл!")
    }
}