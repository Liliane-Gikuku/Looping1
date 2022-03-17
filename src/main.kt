fun main(){
    var x = sumNumbers(arrayOf(2, "Molen", 2.7, 8.00))
    println(x)
}

fun sumNumbers(mixedArray:Array<Any>):Number{
    var sum=0.0
    mixedArray.forEach {x ->
        if (x is Int|| x is Double || x is Float){
            sum+=x.toString().toDouble()
        }
    }
    return sum
}