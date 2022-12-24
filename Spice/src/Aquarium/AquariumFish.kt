package Aquarium

interface FishAction {
    fun eat()
}

class PrintingFishAction(val food: String): FishAction {
    override fun eat() {
        println(food)
    }
}

interface FishColor {
    val color: String
}

object GoldColor: FishColor {
    override val color = "gold"
}

//abstract class AquariumFish {
//    abstract val color: String
//}

//abstract class AquariumFish: FishAction {
//    abstract val color: String
//    override fun eat() = print("yum")
//}

interface AquariumAction {
    fun eat()
    fun jump()
    fun clean()
    fun catchFish()
    fun swim()  {
        println("swim")
    }
}

//class Shark: AquariumFish(), FishAction {
//    override val color = "gray"
////    override fun eat() {
////        println("hunt and eat fish")
////    }
//}
//
//class Plecostomus: AquariumFish(), FishAction {
//    override val color = "gold"
//    override fun eat() {
//        println("eat algae")
//    }
//}

class Shark: FishAction, FishColor {
    override val color = "gray"
    override fun eat() {
        println("hunt and eat fish")
    }
}

//class Plecostomus: FishAction, FishColor by GoldColor {
//    override fun eat() {
//        println("eat algae")
//    }
//}

//class Plecostomus(fishColor: FishColor = GoldColor): FishAction, FishColor by fishColor {
//    override fun eat() {
//        println("eat algae")
//    }
//}

class Plecostomus(fishColor: FishColor = GoldColor):
    FishAction by PrintingFishAction("Eat algae"),
    FishColor by fishColor

sealed class Seal
class SeaLion: Seal()
class Walrus: Seal()

fun matchSeal(seal: Seal): String {
    return when(seal) {
        is Walrus -> "walrus"
        is SeaLion -> "sea lion"
    }
}