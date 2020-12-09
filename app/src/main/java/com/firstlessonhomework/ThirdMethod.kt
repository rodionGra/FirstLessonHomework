package com.firstlessonhomework

fun main() {

    for (element in 0 until 101) {
        if (element % 3 == 0) {
            println("$element — Piff")
        }
        if (element % 5 == 0) {
            println("$element - Paff")
        }
    }

}