package com.codewars

class OldestAges {
    fun twoOldestAges(ages: List<Int>): List<Int> {
        val x = ages.sorted()
        return listOf(x[x.size-2], x.last())
    }

    fun twoOldestAges2(ages: List<Int>) = ages.sorted().takeLast(2)

    fun twoOldestAges3(ages: List<Int>): List<Int> {
        return ages.sorted().takeLast(2)
    }

    fun twoOldestAges4(ages: List<Int>): List<Int>  = ages.sorted().reversed().slice(0..1).reversed()
}