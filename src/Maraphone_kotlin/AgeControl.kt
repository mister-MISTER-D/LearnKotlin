package Maraphone_kotlin

fun main(){

    println("Введите имя: ")
    var age = 0

    var enteredValue = readln()

     age = enteredValue.toInt()

    if(age in 18..39){
        println("Добро пожаловать в Бойцовский клуб")
    } else if(age >= 40)
        println("Уходи от сюда старый")
    else{
        println("Катись от сюда шпана")
    }

}
