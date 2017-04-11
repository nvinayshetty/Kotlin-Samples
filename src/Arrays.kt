import java.util.*

/**
 * Created by vinayaprasadn on 11/4/17.
 */


fun main(args:Array<String>){
arrays()
}

fun arrays(){
    /*var names:Array<String> = arrayOf("a","b","c","d")
    println(names.toList())
    var ages: IntArray= intArrayOf(2,3,4,5,6)
    println(ages.toList())*/
    val values=Array(10,{2.0})
    println(values.toList())
    var squares = Array(10,{(it*it).toString()})
    println(squares.toList())
}
