package Aquarium

fun main(args: Array<String>) {
    buildAquarium()

    val aquarium = Aquarium2(width = 10, height = 30, length = 20)
    println("water: ${aquarium.water} cm3")

    val aquarium3 = Aquarium2(numberOfFish = 30)

    val fish2 = Fish()

    makeFish()
}

fun buildAquarium() {

    val myAquarium = Aquarium()

    println("Length: ${myAquarium.length} " +
            "Width: ${myAquarium.width} " +
            "Height: ${myAquarium.height}"
        )

    myAquarium.height = 80
    println("Height: ${myAquarium.height} cm")

    println("Volume: ${myAquarium.volume3} liters")
}

fun makeFish() {
//    val shark = Shark()
//    val pleco = Plecostomus()
//
//    println("Shark: ${shark.color} \nPlecostomus: ${pleco.color}")
//
//    shark.eat()
//    pleco.eat()
}
