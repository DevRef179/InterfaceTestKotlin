package com.example.interfacetestkotlin

import java.util.*

abstract class BaseClass {
    private var counter = 0
    private val PlayerOne = ArrayList<Int>(10)
    private val PlayerTwo = ArrayList<Int>(10)
    fun memoryPlayerOne(id: Int) {
        PlayerOne.add(id)
        counter++
    }

    fun memoryPlayerTwo(id: Int) {
        PlayerTwo.add(id)
        counter++
    }

    fun getListPlayerOne(): ArrayList<Int>? {
        return PlayerOne
    }

    fun getListPlayerTwo(): ArrayList<Int>? {
        return PlayerTwo
    }

    fun getAlter():Int{
        return 99
    }

    fun alter(): Int {
        var rndNr = 0
        val rnd = Random()
        rndNr = rnd.nextInt(51)
        println("Alter: $rndNr")
        return rndNr
    }
}