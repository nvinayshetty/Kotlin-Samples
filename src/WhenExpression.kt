/**
 * Created by vinayaprasadn on 13/4/17.
 */

fun main(args:Array<String>){
   when_expressions()
}

fun getFranceDialingCOde()=33
fun when_expressions() {
    var code=33
    when(code){
        44-> println("uk")
        91-> println("India")
        46->println("some country")
        getFranceDialingCOde()-> print("France")
        39,379->println("Vatican")
        in 1..99-> print("Unknown")
        !in 1..999-> print("Unknown")
            else->{
                println("Invalid country code")
            }
    }


    val z: Any =getFranceDialingCOde()
    when(z)
    {
        is Int-> println("we got an int")
        is String-> println("we got a string")
        else-> println("I don't know how to handle")
    }
}
