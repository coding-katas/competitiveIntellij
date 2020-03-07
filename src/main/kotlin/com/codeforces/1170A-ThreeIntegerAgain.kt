package com.codeforces

// https://codeforces.com/contest/1170/problem/A

private fun readLn() = readLine()!! // string line
private fun readInt() = readLn().toInt() // single int
private fun readStrings() = readLn().split(" ") // list of strings
private fun readInts() = readStrings().map { it.toInt() } // list of ints

/*
fun solve() {
    val sline  = readLine()!!.split(" ")
    val (x,y) = sline.map {it.toInt()}
    val a = min(x,y)-1
    val b = x - min(x,y) + 1
    val c = y - min(x,y) + 1
    println("$a $b $c")
}


fun main() {
    val q = readLine()!!.toInt()
    repeat(q) {
        solve()
    }

}

fun readint()=readLine()!!.toInt()
fun readll()=readLine()!!.toLong()
fun readline()=(readLine()!!.split(" ").map{it.toInt()}).toIntArray()
fun main(args: Array<String>)
{
    var t=readint()
    while(t-->0)
    {
        var a=readline()
        if(a[0]<a[1]) a[0]=a[1].also{a[1]=a[0]}
        println("1 ${a[1]-1} ${a[0]-a[1]+1}")
    }
}*/


/*val maxIdx = v.indices.maxBy { v[it] } ?: -1
val minIdx = v.indices.minBy { v[it] } ?: -1
if (maxIdx!=minIdx) {
    var l: List<Int> = emptyList()
    for (i in 0..v.size)
        if (!(listOf(minIdx, maxIdx).contains(i)))
           l += i

    if (v[maxIdx]>v[minIdx])
       c=v[maxIdx]-v[minIdx]
    else
        c=v[minIdx]-v[maxIdx]
    println(c)
    println(v[l[0]])
    println(v[l[1]])
    if (v[l[1]]>c) {
        a = v[l[0]] - c
        b = v[l[1]] - a
    } else {
        a = v[l[1]] - c
        b = v[l[0]] - a
    }
    println("$a $b $c")

} else {
    print("${v[0]} ${v[1]} ${v[2]}")
}*/


/*for (i in 0..h.size-1) {
        println(">>> ${h[i]} x")
        if (h[i].equals("x")) {
            count += 1
            println("--->>> $count")
            if (count>2)
               a += 1
        } else {
            print("aaaa")
            count=0
        }
    }*/