package lesson1_10

fun main() {
    //диапозоны (интервалы)

    val range1: IntRange = 42 .. 442
    val range2: IntRange = 42 until 442
    val range3: LongRange = 42L .. 442L
    val range4: CharRange = 'a' .. 'z'
    val range5: ClosedRange<Double> = 42.1..442.1
    val range6: ClosedRange<Float> = 42.1f..442.1f
    val range7: IntProgression = 42.. 442 step 2
    val range8: IntProgression = 442 downTo 42 step 2


    val a = 52 in range1
    val b = 52 !in range1
 //   println(a)
  //  println(b)

    // for - если известно сколько нужно сделать интереации циклов
    // while/do while - если не известно
    // break, continue, return


    for(i in 5 downTo 1){
        if(i == 3){
//            println("Пользователь нажал на кнопку \"Пропустить\"")
//            break
//            println("i == 3, i  не будет распечатана")
//            continue
            return
        }
        println("Реклама закончится через $i")
        Thread.sleep(1000)
    }


    println("Продолжение работы программы вне цикла")
//    for(i in range2 step 8){
//        println(i)
//    }

}
