/**
 * Created by vinayaprasadn on 12/4/17.
 */
fun main(args:Array<String>){
    nullability()
}

fun nullability() {
  /*  var y:String?=null;
    println(y?.length?:-1)*/

    var y:String?=null
    println(y!!.length)

}
