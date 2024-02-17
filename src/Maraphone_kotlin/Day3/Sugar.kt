package Maraphone_kotlin.Day3

fun main(){
    // Функция вызова
    println("Введите первое ваше число")
    val numOne = readln()
    val numOneInt = numOne.toInt()

    println("Введите второе ваше число")
    val numTwo = readln()
    val numTwoInt = numTwo.toInt()

    val result = add( numOneInt, numTwoInt)
    println("Вот ваш результат: $result")
}

fun add(numOne: Int,numTwo: Int):Int{
    val myResult = numOne + numTwo
    return myResult
}
// Определить функцию


fun userCoffee(){

//    makeCoffee( 10, "Ани")
//    makeCoffee( 0, "Кирилла")
//    makeCoffee( 1, "Оли")
//    makeCoffee( 2, "Павла")
//    makeCoffee( 3, "Сигмы")
    println("Для кого кофе?")
    val name = readln()
    println("Сколько сахара положить?")
    val sugarCount = readln()
    val sugarCountInt = sugarCount.toInt()

    makeCoffee(sugarCountInt, name)

}
fun makeCoffee(sugarCount : Int, name:String){

    if(sugarCount == 1 ){
        println("Кофе с $sugarCount ложкой сахара для $name")
    }else if (sugarCount == 0){
        println("Кофе без сахара для $name")
    } else {
        println("Кофе с $sugarCount ложками сахара для $name ")
    }
}