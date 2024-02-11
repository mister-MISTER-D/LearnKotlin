fun main(){
    //операторы сравнения
    //логические операторы

    //   val a = 1+1
    //   val b = (1 ==1)

    // <. >. >=. <=. ==. !=
    // true(истина)
    //false(ложь)


    // ===, !==(операторы ссылочного сравнение)
    //&&, ||, ! (логические операторы)

    val userAge = 5
    //var comparableResult = (userAge >= AGE_OF_MAJORITY) && !(userAge >= RETIREMENT_AGE)
    var comparableResult = userAge !in AGE_OF_MAJORITY .. RETIREMENT_AGE
    println("Резутальт проверки возраста: $comparableResult")


    val a = true
    val b = !a
    //   println(b)


}


//const val AGE_OF_MAJORITY = 18
const val RETIREMENT_AGE = 65
