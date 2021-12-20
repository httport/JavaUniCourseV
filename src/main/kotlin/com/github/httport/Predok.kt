package com.github.httport

open class Predok(private val s: String) {
    val Str: String = s
    var StrS: String? = null

    open fun PrSort() {
        StrS = Str.split("\\s+".toRegex())
            .sorted()
            .joinToString(" ")
    }
}