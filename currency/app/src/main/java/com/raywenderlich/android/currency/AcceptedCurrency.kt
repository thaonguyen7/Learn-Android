package com.raywenderlich.android.currency

sealed class AcceptedCurrency {
    val name: String
     get() = when (this) {
         is Dollar -> "Dollar"
         is Euro -> "Euro"
         is Crypto -> "NerdCoin"
     }

    abstract val valueInDollars: Double
    var amount: Double = 0.0

    fun totalValueInDollars(): Double {
        return amount * valueInDollars
    }
}

class Dollar : AcceptedCurrency() {
    override val valueInDollars: Double
        get() = 1.0
}

class Euro : AcceptedCurrency() {
    override val valueInDollars: Double
        get() = 1.25
}

class Crypto : AcceptedCurrency() {
    override val valueInDollars: Double
        get() = 2534.92
}