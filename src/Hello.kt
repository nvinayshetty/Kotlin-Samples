/**
 * Created by vinayaprasadn on 10/4/17.
 */
fun main(args:Array<String>){
    //declareVariables()
    ranges()
}

fun ranges() {
   //val a:IntRange=1..10
    //val  a=1.rangeTo(10)
  /*  val  a: IntProgression =1.rangeTo(10).reversed()*/
    val a:IntProgression=100 downTo 0 step 3
   for(x in a ) println("$x\t")
    println("sum of ints $a=${a.sum()}")


}

fun declareVariables() {
    val a=5
    val b=2.3f
    val c=2.35e2
    val d=500
    val f="Hello"
    println("$a $b $c $d $f")

    val e:Int //Need not to initialize the value at the time of declaration
    e=4 //val is finally once the first value os assigned
    //e=5 you

    var g:Int=23
    g=45

}

