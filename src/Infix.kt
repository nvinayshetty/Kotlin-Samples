/**
 * Created by vinayaprasadn on 14/4/17.
 */
fun main(args: Array<String>) {
    infix_functions()
}

infix fun Double.averageWith(other:Double):Double{
    return (this+other)/2.0
}

fun infix_functions() {
    val a=3.0
    val b=5.0

    println("average ${a averageWith b}")


}
