



// https://stackoverflow.com/questions/45977011/example-of-when-should-we-use-run-let-apply-also-and-with-on-kotlin
// lists https://kotlinlang.org/docs/reference/collections-overview.html

fun main(args: Array<String>)
{
    fun readint()= "6"!!.toInt()
    fun readll()=readLine()!!.toLong()
    fun readline()=("1 5 5 1 6 1"!!.split(" ").map{it.toInt()}).toIntArray()
    var n=readint()
    var h=readline()
   // val map = HashMap<Int, ArrayList<Int>>().withDefault { arrayListOf() }
    var map = mutableMapOf<Int, ArrayList<Int>>()

    for (i in 0..h.size-1)
        if (h[i] in map)
            map[h[i]]!!.add(i)
        else
            map[h[i]]= arrayListOf(i)

    for ((k,v) in map) {
        val s = v.size
        if (s > 1) {
            for (j in 0..s - 2) {
                h[v[j]] = -1
            }
        }
    }

    var s = ""
    var c = 0
    for (i in 0..n-1)
        if (h[i]!=-1) {
            s += "${h[i]} "
            c += 1
        }
    println(c)
    println(s.dropLast(1))
}
