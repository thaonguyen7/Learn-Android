
fun main(args: Array<String>) {

    val equipment = "fishnet" to "catching fish" to "of big size" to "and strong"

    val equip = ("fishnet" to "catching fish") to ("of big size" to "and strong")

    println(equipment)

    println(equip)

    val fishnet = "fishnet" to "catching fish"

    val (tool, use) = fishnet

    println("The $tool is a tool for $use.")

    val fishnetString = fishnet.toString()

    println(fishnetString)

    println(fishnet.toList())

    val triple1 = Triple("A", "B", "C")

    println(triple1)

    val triple2 = Triple<Int, String, Double>(4, "Test", 4.0)
    println(triple2)
}

fun giveMeATool(): Pair<String, String> {
    return ("fishnet" to "catching")
}