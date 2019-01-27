package Aquarium.Generics

fun main(args: Array<String>) {
    genericExample()
}

open class WaterSupply(var needsProcessed: Boolean) {
    fun addChemicalCleaners() {
        needsProcessed = false
    }
}

class FishStoreWater : WaterSupply(false)

class LakeWater : WaterSupply(true) {
    fun filter() {
        needsProcessed = false
    }
}

class Aquarium<out T: WaterSupply>(val waterSupply: T) {
    fun addWater() {
        check(!waterSupply.needsProcessed) {
            "water supply need processed"
        }
        println("adding water from $waterSupply")
    }

    //    inline fun <reified R: WaterSupply> hasWaterSupplyOfType() = waterSupply is R
}

inline fun <reified R: WaterSupply> Aquarium<*>.hasWaterSupplyOfType() = waterSupply is R

fun <T: WaterSupply> isWaterClean(aquarium: Aquarium<T>) {
    println("aquarium water is clean ${aquarium.waterSupply.needsProcessed}")
}

fun genericExample() {
    val aquarium = Aquarium(LakeWater())
    aquarium.waterSupply.addChemicalCleaners()

    val aquarium2 = Aquarium(LakeWater())
    aquarium2.waterSupply.filter()
    aquarium2.addWater()
    isWaterClean(aquarium2)
    aquarium2.hasWaterSupplyOfType<LakeWater>() // true
}
