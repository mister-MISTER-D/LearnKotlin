package Lesson_14

import javax.print.attribute.standard.JobOriginatingUserName

class Scout(
    name: String,
    speed: Int,
    val radarRange: Int,
    val afterburnerSpeed: Int,
): Spaceship(name, speed) {

    fun handleDataFromRadar(){
        println("$name обработка данных с радара ")
    }
    fun runAfterburner(){
        println("$name: форсаж запущен")
    }

}