package lesson1_10

fun main() {
    //конкатенация строк

    val greetings = "Здраствуй"
    // val space = ' '
    val userName = "Пират Попрыгун"

    //   println(greetings+ "," +userName+ '!'+ space+ "Вот ты" +space+ "был ли счастлив вчера?")

    //интерполяция строк

    //   println("$greetings, $userName! Вот ты  был ли счастлив вчера?")
//    println("Ладно другой вопрос, ответь ${40 + 2}")


    //многострочная запись


    val multiString = """
             |строка 1
               |строка 2
       |строка 3
    """.trimMargin()
    println(multiString)
}