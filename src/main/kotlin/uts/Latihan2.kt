package uts

import java.util.*

fun main(){
    val input = Scanner(System.`in`)
    var i : Int
    val j : Int

    println("awal : ")
    i = input.nextInt()

    println("akhir : ")
    j = input.nextInt()

    do {
        if (i % 3 == 0)
            print("$i ")
        i++
    }while (i<=j)
}