package com.firstlessonhomework

fun main(args: Array<String>) {

    (0..100).forEach { item ->
        if (item % 3 == 0){
            println("$item — Piff")
        }
        if (item % 5 == 0){
            println("$item - Paff")
        }
    }

}