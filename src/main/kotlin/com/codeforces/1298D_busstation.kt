
// https://stackoverflow.com/questions/45977011/example-of-when-should-we-use-run-let-apply-also-and-with-on-kotlin
// lists https://kotlinlang.org/docs/reference/collections-overview.html

fun main(args: Array<String>) {
    fun readint() = readLine()!!.toInt()
    fun readll() = readLine()!!.toLong()
    fun readline() = (readLine()!!.split(" ").map { it.toInt() }).toIntArray()
    fun readline2() = (readLine()!!.split(" ").map { it.toInt() }).toIntArray()

    var s = readline()
    var a = readline2()
    var n = s[0]
    var w = s[1]

    var xmin = 0
    var ymin = 0

    var max = -w
    var min = w

    for (i in 0..n-1) {
        ymin = a[i] + xmin
        xmin = ymin
        if (xmin<min)
            min = xmin
        if (xmin>max)
            max = xmin

    }

    var t0=0
    if (min<0)
        t0=-min


    var t1=w-max
    if (t1<0)
        t1=w

    println(t1-t0+1)

}