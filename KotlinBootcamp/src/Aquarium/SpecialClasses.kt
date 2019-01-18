package Aquarium

object MobyDicWhale {
    val author = "Herman Melville"

    fun jump() {

    }
}

enum class Color(val rgb: Int) {
    RED(rgb = 0xFF0000),
    GREEN(rgb = 0x00FF00),
    BLUE(rgb = 0x0000FF)
}

sealed class Seal

class Sealion: Seal()
class Walrus: Seal()

fun matchSeal(seal: Seal): String {
    return when(seal) {
        is Walrus -> "walrus"
        is Sealion -> "sea lion"
    }
}