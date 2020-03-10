package com.codingames
/*
fun main(args : Array<String>) {
    val numbers = arrayListOf(1, 2, 3, 4)
    numbers.add(5)
    numbers.removeAt(1)
    numbers[0] = 0
    numbers.shuffle()
    println(numbers)
}

*/

fun List<String>.getShortWordsTo(shortWords: MutableList<String>, maxLength: Int) {
    this.filterTo(shortWords) { it.length <= maxLength }
    // throwing away the articles
    val articles = setOf("a", "A", "an", "An", "the", "The")
    shortWords -= articles
}

fun main() {
    val words = "A long time ago in a galaxy far far away".split(" ")
    val shortWords = mutableListOf<String>()
    words.getShortWordsTo(shortWords, 2)
    println(shortWords)

    val numbersMap = mutableMapOf<String,Int>()
    numbersMap.put("three", 3)
    numbersMap["one"] = 11
    println(numbersMap)
}