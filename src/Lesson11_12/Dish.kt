package Lesson11_12

class Dish (
    private val id: Int,
    val name: String,
    var category: String,
    val ingredients: List<String>,
    var inFavorites: Boolean = false,

    ){

    fun addToFavorites(){
        println("Блюдо $name добавлено в избранное")
        inFavorites = true
    }

    fun removeFromFavorites(){
        println("Блюдо $name удалено в избранное")
        inFavorites = false
    }

    fun startCooking(){
        println("Пользователь перешел на экран начала приготовление блюда $name")
    }

    fun downloadIngredients(): List<String> {
        return ingredients
    }


}