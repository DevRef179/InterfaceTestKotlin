package com.example.interfacetestkotlin

open class GameClass:BaseClass() {
    private var modus: iModos? = null

    open fun colorModus(): String? {
        return modus.btnColor()
    }

    open fun runModus(one: Int): Int {
        var result = 0
        result = modus.modusStarten(one)
        return result
    }

    open fun getModus(): iModos? {
        return modus
    }

    open fun setModus(modus: iModos?) {
        this.modus = modus
    }

}