package Aquarium

/*
interface AquariumAction {
    fun eat()
    fun jump()
    fun clean()
    fun catchFish()
    fun swim() {
        println("swim")
    }
}

interface FishAction {
    fun eat()
}

abstract class AquariumFish: FishAction {
    abstract val color: String
    override fun eat() = println("yum")
}
*/

fun main(args: Array<String>) {
    delegate()
}

fun delegate() {
    val pleco = Plecostomus()
    println("Fish has color ${pleco.color}")
    pleco.eat()
}

interface  FishAction {
    fun eat()
}

interface FishColor {
    val color: String
}

/*
class Plecostomus: FishAction, FishColor {
    override fun eat() {
        println("eat algae")
    }

    override val color: String
        get() = "gold"
}
*/

/*
class Plecostomus: FishAction,
    FishColor by GoldColor {
    override fun eat() {
        println("eat algae")
    }
}
*/

class Plecostomus(fishColor: FishColor = GoldColor) :
        FishAction by PrintingFishAction("a lot of algae"),
        FishColor by fishColor

object GoldColor: FishColor {
    override val color: String = "gold"
}

object RedColor: FishColor {
    override val color: String = "red"
}

class PrintingFishAction(val food: String) : FishAction {
    override fun eat() {
        println(food)
    }
}
