fun String.hasSpaces(): Boolean {
    val found = this.find { it == ' ' }
    return found != null
}

fun String.hasSpaces2() = find { it == ' ' } != null

fun extensionsExample() {
    "Does it have spaces?".hasSpaces()
}

open class AquariumPlant(val color: String, private  val size: Int)
class GreenLeafyPlant(size: Int) : AquariumPlant("Green", size)

fun AquariumPlant.isRed() = color == "Red"
fun AquariumPlant.print() = println("AquariumPlant")
fun GreenLeafyPlant.print() = println("GreenLeafyPlant")

val AquariumPlant.isGreen: Boolean
    get() = color == "Green"

fun AquariumPlant?.pull() {
    this?.apply {
        println("removing $this")
    }
}

fun staticExample() {
    val plant = GreenLeafyPlant(size = 50)
    plant.print() //GreenLeafyPlant

    val aquariumPlant: AquariumPlant = plant
    aquariumPlant.print() //AquariumPlant

    val plant2: AquariumPlant? = null
    plant.pull()
}
