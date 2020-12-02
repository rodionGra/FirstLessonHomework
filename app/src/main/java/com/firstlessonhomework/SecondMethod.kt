package com.firstlessonhomework

fun main() {
    val arr = Array(101) { i -> i + 1}

    var i = 0;
    while (i < arr.size){
        if (i % 3 == 0){
            println("$i — Piff")
        }
        if (i % 5 == 0){
            println("$i - Paff")
        }
        i++;
    }
}