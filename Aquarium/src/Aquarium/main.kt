package Aquarium

fun main (args: Array<String>) {

    buildAquarium()
    makeFish()
}

fun buildAquarium() {

    val myAquarium = Aquarium()
    println("Length: ${myAquarium.length} " + "Height: ${myAquarium.height}")

    myAquarium.height = 100

    println("Length: ${myAquarium.length} " + "Height: ${myAquarium.height}")

    println("Volume: ${myAquarium.volume} liters ")

    val smallAquarium = Aquarium(length = 20, width = 15, height = 30)
    println("Volume: ${smallAquarium.volume} liters ")

    val myAquarium2 = Aquarium(numberOfFish = 9)

    println("Small Aquarium 2: ${myAquarium2.volume} liters with " +
        "length: ${myAquarium2.length} " +
        "width: ${myAquarium2.width} " +
        "height: ${myAquarium2.height}")

//    val myFish = Fish(true, 10)

}

fun makeFish() {
    val shark = Shark()
    val pleco = Plecostomus()

    println ("Shark: ${shark.color} \nPlecostomus: ${pleco.color}")
    shark.eat()
    pleco.eat()
}
