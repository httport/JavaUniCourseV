package com.github.httport

class Potomok(private val s: String) : Predok(s) {
    override fun PrSort() {
        StrS = Str.split("\\s+".toRegex())
            .sortedDescending()
            .joinToString(" ")
    }
}