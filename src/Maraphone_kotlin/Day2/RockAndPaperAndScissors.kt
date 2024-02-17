package Maraphone_kotlin.Day2

fun main() {
    var computerChoice = ""
    var playerChoice = ""


    while(playerChoice != "КАМЕНЬ" && playerChoice != "БУМАГА" && playerChoice != "НОЖНИЦЫ"){

        println("Камень, Бумага или Ножницы? Введите свой выбор!")
        playerChoice = readln().uppercase()
    }

    val randomNumber = (1..3).random()
    when (randomNumber) {
        1 -> computerChoice = "КАМЕНЬ"
        2 -> computerChoice = "БУМАГА"
        3 -> computerChoice = "НОЖНИЦЫ"
    }



    println(computerChoice)

    val winner = when {
        playerChoice == computerChoice -> "Ничья"
        playerChoice == "КАМЕНЬ" && computerChoice == "НОЖНИЦЫ" -> "Игрок"
        playerChoice == "БУМАГА" && computerChoice == "КАМЕНЬ" -> "Игрок"
        playerChoice == "НОЖНИЦЫ" && computerChoice == "БУМАГА" -> "Игрок"
        else -> "Компьютер"
    }

    if (winner == "Ничья") {
        println("Эх, это ничья")
    } else {
        println("$winner выиграл!")
    }
}