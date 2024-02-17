package Maraphone_kotlin.Day3




class Book (val title: String = "Неизвестен", val author: String = "Автор", val yearPublished: Int = 2024){






}


fun main(){

    val customBook = Book("Кровь и Свет","Пушкин",1980)
    val myBook = Book()
    println(myBook.title)
    println(myBook.author)
    println(myBook.yearPublished)
    println("Моя книга:")
    println(customBook.title)
    println(customBook.author)
    println(customBook.yearPublished)

}