package com.codewars

// https://kotlinlang.org/docs/reference/basic-types.html


class Vowels {
    fun getCount(str : String) : Int {
        var a = 0;
        for (i in str)
            if ("aeiou".contains(i))
                a += 1;
        return a
    }

    fun getCount2(str : String) = str.count { it in "aeiou" }
    fun getCount3(str : String): Int = str.count { it in listOf('a','i','e','o','u') }

    fun getCount4(str: String) = str.sumBy {
        when (it) {
            'a', 'i', 'e', 'o', 'u' -> 1
            else -> 0
        }
    }

    fun getCount5(str : String) : Int {
        val vowels = setOf('a', 'e', 'i', 'o', 'u')
        return str.count{it -> vowels.contains(it)}
    }

    fun getCount6(str: String): Int{
        val vowels = listOf<Char>('a', 'e', 'i', 'o', 'u')
        return str.toCharArray().filter { vowels.contains(it) }.count()
    }
}