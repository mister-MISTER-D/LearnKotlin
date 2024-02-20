fun main(){

    //NPE(NullPointException)
    //null

    val nullableString: String? = null
  //  val nonNullableString: String = "null"

//    if(nullableString != null) println(nullableString.length)
//    else println("Перемнная зранит null")
  //  println(nullableString?.length)
  //  println(nonNullableString.length)

//    val nullableLine: String? = readLine()

//    val stringLength: Int = nullableString?.length ?: 999
//    println(stringLength)

    val nullableLength: Int = nullableString!!.length

}

