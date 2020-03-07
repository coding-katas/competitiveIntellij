



// https://stackoverflow.com/questions/45977011/example-of-when-should-we-use-run-let-apply-also-and-with-on-kotlin
// lists https://kotlinlang.org/docs/reference/collections-overview.html

fun main(args: Array<String>)
{
    fun readint()= readLine()!!.toInt()
    var n=readint()
    val h = readLine().toString()
    val regex = """x{3,}""".toRegex()
    var m= regex.replace(h,"xx")
    println(h.length-m.length)
}
