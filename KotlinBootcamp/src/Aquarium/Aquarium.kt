package Aquarium

import kotlin.math.PI

class Aquarium {
    var width: Int = 20
    var height: Int = 40
    var length: Int = 100

    fun volume1(): Int {
        return width * height * length / 1000
    }

    fun volume2() = width * height * length / 1000

    var volume3: Int
        get() = width * height * length / 1000
        private set(value) {
            height = value * 1000 / width * length
        }
}

open class Aquarium2(val width: Int = 0, var height: Int = 40, val length: Int = 100) {
    open var volume
        get() = width * height * length / 1000
        set(value) {height = value * 1000 / width * length}

    open var water = volume * 0.9

    constructor(numberOfFish: Int): this() {
        val water = numberOfFish * 2000
        val tank: Double = water + water * 0.1
        height = (tank / (length * width)).toInt()
    }
}

class TowerTank : Aquarium2() {
    override var water = volume * 0.8

    override var volume: Int
        get() = (width * height * length / 1000 * PI).toInt()
        set(value) {
            height = value * 1000 / width * length
        }
}
