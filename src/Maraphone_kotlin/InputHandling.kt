package Maraphone_kotlin

fun main(){
    println("Пожалуйста введите число: ")

    var inputString = readln()
    var inputNumber = inputString.toInt()
    val multiplier = 5
    println("Результат операции: ")
    println(inputNumber * multiplier )
}