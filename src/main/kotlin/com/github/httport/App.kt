package com.github.httport

import java.io.File

fun Peredacha(arg: Predok) {
    arg.PrSort()
    println(arg.StrS)
}

fun main() {
    File("ass").readLines()
    val input = print("Введите строку: ").run { readln() }
    val sortBy = println("1 - для сортировки по возрастанию\n2 - для сортировки по убыванию").run { readln() }

    if (sortBy == "1") {
        Peredacha(Predok(input))
    } else {
        Peredacha(Potomok(input))
    }
}
