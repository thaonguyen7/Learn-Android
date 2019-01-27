fun main(args: Array<String>) {

    // LIST
    println(reversedList(testList))

    println(reversedListAgain(testList))

    val symptoms: MutableList<String> = mutableListOf("white spots", "red spots", "not eating", "bloated", "belly up")

    symptoms.add("white fungus")
    symptoms.remove("white fungus")
    symptoms.contains("red") // false

    println(symptoms.subList(4, symptoms.size))

    listOf<Int>(1, 5, 3).sum()

    listOf<String>("a", "b", "c").sumBy { it.length }

    // MAP
    val cures: Map<String, String> = mapOf("white spots" to "Inc", "red sores" to "hole disease")
    println(cures.get("white spots"))
    println(cures["white spots"])
    println(cures.getOrDefault("bloating", "sorry I don't know"))

    val inventory: MutableMap<String, Int> = mutableMapOf("fish net" to 1)
    inventory.put("tank scrubber", 3)
    inventory.remove("fish net")
}

val testList: List<Int> = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9)

fun reversedList(list: List<Int>): List<Int> {
    val result: MutableList<Int> = mutableListOf<Int>()
    for (i in 0 until list.size) {
        result.add(list[list.size - 1 - i])
    }
    return result
}

fun reversedListAgain(list: List<Int>): List<Int> {
    val result: MutableList<Int> = mutableListOf()
    for (i in list.size - 1 downTo 0) {
        result.add(list[i])
    }
    return result
}