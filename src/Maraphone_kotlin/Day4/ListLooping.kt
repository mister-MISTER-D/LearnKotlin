package Maraphone_kotlin.Day4

fun main(){

    val numbers = mutableListOf(0, 1, 2, 3, 4)

    for(item in 0 until numbers.size){
        numbers[item] = numbers[item] * 2
    }
        println(numbers)
}