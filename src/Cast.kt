/**
 * Created by vinayaprasadn on 13/4/17.
 */

fun main(args:Array<String>){
   flowBasedTyping()
}

fun flowBasedTyping() {
    var s:String?="hello";
   // print(s.length)
    if(s!=null){
        print(s.length)
    }


    var x:Cloneable= intArrayOf(1,2,3)
    if(x is IntArray){
        print(x.size)
    }
}




