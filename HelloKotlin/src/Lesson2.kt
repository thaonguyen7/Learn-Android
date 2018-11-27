import java.util.*

fun main(args: Array<String>) {
    println("Hello Kotlin")

    val fish = 2
    fish.times(6)
    fish.div(10)
    fish.plus(4)
    fish.minus(3)
    println("Number of fish = $fish")

    // primitive type as object
    1.toLong()
    // boxed number
    val boxed: Number = 1
    boxed.toLong()

    // nullable
    var marbles: Int? = null
    println(marbles)
    var lotsOfFish: List<String?> = listOf(null, null)
    println(lotsOfFish)
    var everMoreFish: List<String>? = null
    everMoreFish = listOf("Swift", "Kotlin", "Python", "JavaScript")
    println(everMoreFish.elementAt(0))
    var definitilyFish: List<String?>? = null
    definitilyFish = listOf(null, null)
    println(definitilyFish)

    var fishFoodCheats: Int? = 5
    val dec = fishFoodCheats?.dec() ?: 0 // Decrement
    println(dec)

    val result = 2.plus(71).plus(233).minus(13).div(30).plus(1)
    println(result)

    var rainbowColor = "Blue"
    rainbowColor = "Red"
    val blackColor = "Black"
    println(rainbowColor)
    println(blackColor)

    var greenColor = null
    var blueColor: Int? = null
    println(greenColor)

    var list1: List<String?> = listOf(null, null)
    var list2: List<String>? = null

    var nullTest: Int? = null
    val increament = nullTest?.inc() ?: 0
    println(increament)

    // String
    val helloFish = "Hello" + "Fish"
    val numberOfFish = 55
    var numberOfPlants = 12
    println("I have $numberOfFish fish and $numberOfPlants plants")
    println("I have ${numberOfFish + numberOfPlants} fish and plants")

    // Condition
    if (numberOfFish > numberOfPlants) println("Good ratio!")
    else
        println("Unhealthy ratio!")

    var fish3 = 50
    if (fish3 in 1..100) {
        println(fish3)
    }

    when (numberOfFish) {
        0 -> println("Empty tank")
        55 -> println("Full tank")
        else -> println("Perfect!")
    }

    val fishName = "Whale"
    when (fishName.length) {
        0 -> println("Fish name cannot be empty")
        in 3..12 -> println("Good fish name")
        else -> println("OK fish name")
    }

    // Arrays and Loops
    val myList = mutableListOf("tuna", "salmon", "shark")
    // myList = mutableListOf("test") compile error => can't assign to other list
    // but still can modify
    myList.remove("shark")
    myList.add("whale")
    println(myList)

    val swarm = listOf(12, 5)
    val school = arrayOf("hua", "hut", "ftu")
    val number = intArrayOf(12, 45, 67)
    val mix = arrayOf(2, "fish")
    println(Arrays.toString(school))

    // nested array
    val bigSwarm = arrayOf(swarm, arrayOf("dolphin", "whale", "orka"))
    println(Arrays.toString(bigSwarm))

    // init array with dynamic code
    val array = Array(5) { it * 2}
    println(array.toList())

    for (element in array) println(element)

    for ((index, element) in myList.withIndex()) {
        println("Fish at $index is $element")
    }

    for (i in 'b'..'g') print(i)
    println()
    for (i in 1..5) print(i)
    println()
    for (i in 5 downTo 1) print(i)
    println()
    for (i in 3..6 step 2) print(i)
    println()
    println("Practice")
    val numbers = Array(5) { it + 11}
    println(numbers.toList())
    val strings: MutableList<String> = mutableListOf()
    for (i in numbers) {
        strings.add(i.toString())
    }
    println(strings)

    var list3: MutableList<Int> = mutableListOf()
    for (i in 0..100 step 7) list3.add(i)
    println(list3)

    for (i in 0..100 step 7) print(i.toString() + " - ")
}