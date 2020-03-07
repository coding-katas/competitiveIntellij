



// https://stackoverflow.com/questions/45977011/example-of-when-should-we-use-run-let-apply-also-and-with-on-kotlin
// lists https://kotlinlang.org/docs/reference/collections-overview.html

fun main(args: Array<String>)
{
    fun readint()=readLine()!!.toInt()
    fun readll()=readLine()!!.toLong()
    fun readline()=(readLine()!!.split(" ").map{it.toInt()}).toIntArray()

    var v=readline().sorted()

    var c = v[3]-v[0];
    var a = v[2]-c;
    var b = v[0]-a;
    println("$a $b $c")

}

