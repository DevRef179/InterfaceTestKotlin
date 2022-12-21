package com.example.interfacetestkotlin

import java.util.*

class TwoFinger:iModos{

    override fun modusStarten(btnId: Int): Int {
        var rndNr = 0
        val rnd = Random()
        rndNr = rnd.nextInt(51)
        println("BtnID: $btnId")
        return rndNr * 1007
    }

    override fun btnColor(): String? {
        return "#FFF50057"
    }
}