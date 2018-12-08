import java.util.*

fun main(args: Array<String>) {
    val isUnit = println("Hello, ${args[0]}")
    println(isUnit)
    dayOfWeek()

    val temperature = 10
    val isHot = if (temperature > 50) true else false
    println(isHot)

    val message = "You are ${ if (temperature > 50) "fried" else "safe" } fish"
    println(message)

    feedTheFish()

    swim(5)
    swim(5,"slow")
    swim(speed = "slow", time = 5)

    println(whatShouldIDoToday("happy"))

    var swim = { println("swim \n")}
    swim()
}

fun dayOfWeek() {
    println("What day is it today?")
    val weekday = Calendar.getInstance().get(Calendar.DAY_OF_WEEK)
    when (weekday) {
        1 -> println("Sunday")
        2 -> println("Monday")
        3 -> println("Tuesday")
        4 -> println("Wednesday")
        5 -> println("Thursday")
        6 -> println("Friday")
        7 -> println("Saturday")
        else -> println("Time has stopped")
    }
}

fun shouldChangeWater(day: String, temperature: Int = 22, dirty: Int = 20): Boolean {
//    return when {
//        temperature > 30 -> true
//        dirty > 30 -> true
//        day == "Sunday" -> true
//        else -> false
//    }

    return when {
        isTooHot(temperature) -> true
        isDirty(dirty) -> true
        isSunday(day) -> true
        else -> false
    }
}

fun isTooHot(temperature: Int) = temperature > 30

fun isDirty(dirty: Int) = dirty > 30

fun isSunday(day: String) = day == "Sunday"

fun feedTheFish() {
    val day = randomDay()
    val food = fishFood(day)
    println("Today is $day and the fish eat $food")

    shouldChangeWater(day, 20, 50)
    shouldChangeWater(day)
    shouldChangeWater(day, dirty = 50)
    shouldChangeWater(day = "Monday")

    if (shouldChangeWater(day)) {
        println("Change the water today")
    }
}

fun randomDay(): String {
    val week = listOf("Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday")
    return week[Random().nextInt(7)]
}

fun fishFood(day: String): String {
    return when (day) {
        "Monday" -> "flakes"
        "Tuesday" -> "pellets"
        "Wednesday" -> "redworms"
        "Thursday" -> "granules"
        "Friday" -> "mosquitoes"
        "Saturday" -> "lettuce"
        "Sunday" -> "plankton"
        else -> "fasting"
    }
}

fun swim(time: Int, speed: String = "fast") {
    println("swimming $speed")
}

fun whatShouldIDoToday(mood: String, weather: String = "sunny", temperature: Int = 24): String {
    return when {
        mood == "happy" && weather == "sunny" -> "go for a walk"
        else -> "Stay home and read"
    }
}

//lambdas
var dirty = 20
val waterFilter: (Int) -> Int = { dirty -> dirty / 2}
fun feedFish(dirty: Int) = dirty + 10
fun updateDirty(dirty: Int, operation: (Int) -> Int): Int {
    return operation(dirty)
}

fun dirtyProcessor(){
    dirty = updateDirty(dirty, waterFilter)
    dirty = updateDirty(dirty, ::feedFish)
    dirty = updateDirty(dirty) { dirty ->
        dirty + 50
    }
}