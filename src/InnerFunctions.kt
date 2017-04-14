/**
 * Created by vinayaprasadn on 14/4/17.
 */
/*fun solveQuadraticEquation(a:Double,b:Double,c:Double):Pair<Double,Double>{
    fun calculateDiscriminant(a:Double,b:Double,c:Double):Double{
        return b*b-4*a*c
    }
    val root_disc=Math.sqrt(calculateDiscriminant(a,b,c))
    return Pair((-b+root_disc)/(2*a),(-b-root_disc)/(2*a))
}*/

fun solveQuadraticEquation(a:Double,b:Double,c:Double):Pair<Double,Double>{
    fun calculateDiscriminant():Double{
        return b*b-4*a*c
    }
    val root_disc=Math.sqrt(calculateDiscriminant())
    return Pair((-b+root_disc)/(2*a),(-b-root_disc)/(2*a))
}

fun main(args: Array<String>) {
    print(solveQuadraticEquation(1.0,10.0,16.0))
}