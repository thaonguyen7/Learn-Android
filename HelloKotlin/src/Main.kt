

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
}