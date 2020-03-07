import kotlin.math.pow

/*
9
999
123
0
1782
31415926
1500
999999
35499710
2000000000
*/


fun main(args: Array<String>)
{
    fun readint()= readLine()!!.toInt()
    fun readll()=readLine()!!.toLong()
    fun readline()=(readLine()!!.split(" ").map{it.toInt()}).toIntArray()
    var n=readint()
    //var h=readline()

    for (i in 0..n-1) {
        var m = readint()
        if ((m>=0) and (m<=999)) {
            println(m)
        } else if ((m>=1000) and (m<1000000)) {
            var x=m
            if (m%1000<500) {
                println("${( (x / 1000)) }K")
            } else {
                var a = (1 + (x / 1000))

                if (a>=1000)
                    println("${(a / 1000) }M")
                else
                   println("${(1 + (x / 1000)) }K")
            }
        } else if (m>=1000000)  {
            var x=m
            if (m%1000000<1000000/2) {
                println("${( (x / 1000000)) }M")
            } else {
                println("${(1 + (x / 1000000)) }M")
            }
        }
    }

}
