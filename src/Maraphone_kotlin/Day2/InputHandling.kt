package Maraphone_kotlin.Day2

fun main() {
    println("Пожалуйста введите число: ")

    val inputString = readln()
    val inputNumber = inputString.toIntOrNull()
    val multiplier = 5
    print("Результат операции: ")
    if (inputNumber != null) {
        println(inputNumber * multiplier)
    } else {
        print("Ошибка")
    }
//    val intNull: String? = null
}