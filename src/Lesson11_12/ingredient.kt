package Lesson11_12

class Ingredient constructor(var name: String, var weight: Int, var count: Int) {


    var isNeedToPrepare = false
    constructor(
        name: String,
        weight: Int,
        count: Int,
        _isNeedToPrepare: Boolean,
    ): this(name, weight, count) {

        isNeedToPrepare = _isNeedToPrepare

    }

    init{
        println("Ингридиент $name создан")
    }

    //вторичный конструктор
    //первичный конструктор
    //блоки init
    // тело вторичного конструкторов

}