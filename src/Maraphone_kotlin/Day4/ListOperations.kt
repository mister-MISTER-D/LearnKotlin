package Maraphone_kotlin.Day4

fun main(){

    val fruitsList = mutableListOf("Апельсин", "Яблоко", "Бананы", "Киви", "Хурма")
//    println(fruitsList)
    fruitsList.add("Кокос")
//    println(fruitsList)
    fruitsList.remove("Киви")
    println(fruitsList)

    val hasApple = fruitsList.contains("Яблоко")
    if(hasApple){
        println("Яблоко есть в вашем списке")
    }else {
        println("Яблоко нету в вашем списке")
    }

}

