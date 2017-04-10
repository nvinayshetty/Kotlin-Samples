/**
 * Created by vinayaprasadn on 10/4/17.
 */
fun main(args:Array<String>){
    declareVariables()
}

fun declareVariables() {
    val a:Int=5
    val b:Float=2.3f
    val c:Double=2.35e2
    val d:Long=500
    val f:String="Hello"
    println("$a $b $c $d $f")

    val e:Int //Need not to initialize the value at the time of declaration
    e=4 //val is finally once the first value os assigned
    //e=5 you

    var g:Int=23
    g=45

}

