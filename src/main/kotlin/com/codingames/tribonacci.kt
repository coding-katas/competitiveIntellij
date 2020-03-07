package com.codingames

import java.util.*
import java.io.*
import java.math.*

// https://kotlinlang.org/docs/tutorials/kotlin-for-py/loops.html

fun fib(t0: Int,t1 : Int, t2: Int, n: Int): Int {
    var a = t0;
    var b = t1;
    var c = t2;
    println(" $a --> $b --> $c")
    if (n > 2) {
        for (i in 0..n - 3) {
            val a0 = a;
            a = b
            b = c
            c += a + a0
            println(" $a --> $b --> $c")
        }
    } else {
        return a + b + c
    }
    return c
}
fun main(args : Array<String>) {
    val input = Scanner(System.`in`)
    val N = 10
    val T0 =4
    val T1 = 5
    val T2 = 6
    val n: IntArray = intArrayOf(T0,T1,T2)
    println(N)
    println(T0)
    println(T1)
    println(T2)
    println(fib(T0,T1, T2, N))

    // 1002
}