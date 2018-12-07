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
    return true
}

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