package lesson1_10

fun main(){
    val userAge = readLine()!!.toInt()

    val resultText = if(userAge >= AGE_OF_MAJORITY)"Показать экран со скрытым контентом"
    else if(userAge == 16 || userAge == 17)"Показать с ограниченым контентом"
    else "Вернуть на главный экран"
  //  println(resultText)

   /* if (userAge < AGE_OF_MAJORITY){
        println("Вернуть на главный экран")
    }
    */

    //when

    val consoleNumber = when(userAge){
        10 ->{
            println("Доп. действие, если ввели 10")
            "Ввели 10"
        }
        20 -> "Ввели число 20"
        42 -> "Ввели число 42"
        else -> "Ввел другое число"
    }
    println(consoleNumber)
}

const val AGE_OF_MAJORITY = 18

