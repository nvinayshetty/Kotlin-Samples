/**
 * Created by vinayaprasadn on 14/4/17.
 */
fun main(args: Array<String>) {
    val product:(Int,Int)->Int={x,y->x*y}
    println("2*3 is${product(2,3)}")

    val numbers= listOf(1,2,4,5,6)
   // val count=numbers.count { x->x>3 }
    val count=numbers.count { it>3 }
    println(count)

    var sum=0
    numbers.forEach { sum+=it }
    println("the sum of $numbers is $sum")
}

