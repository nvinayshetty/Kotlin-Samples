/**
 * Created by vinayaprasadn on 13/4/17.
 */

fun main(args:Array<String>){
   forLoop()
}

fun forLoop() {
    for (a in (10 downTo 1))
        println("$a\t")

    var ints = intArrayOf(4, 3, 2, 1)
    for ((index, value) in ints.withIndex())
        println("$index\t $value")
    var capitals = mapOf("paris" to "France", "london" to "uk")
    for ((capital, country) in capitals)
        println("$capital is the capital of $country")
}
