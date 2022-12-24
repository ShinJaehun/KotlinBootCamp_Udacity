package Aquarium

import kotlin.math.PI

//class Aquarium {
//    var width: Int = 20
//    var height: Int = 40
//    var length: Int = 100
//
//    fun printSize() {
//        println("Width: $width cm " + "Length: $length cm " + "Height: $height cm")
//    }
//}


//class Aquarium(length: Int = 100, width: Int = 20, height: Int = 40) {
//    var width: Int = width
//    var height: Int = height
//    var length: Int = length
//
//    fun printSize() {
//        println("Width: $width cm " + "Length: $length cm " + "Height: $height cm")
//    }
//}

//class Aquarium(var length: Int = 100, var width: Int = 20, var height: Int = 40) {
//    fun printSize() {
//        println("Width: $width cm " + "Length: $length cm " + "Height: $height cm")
//    }
//}

//class Aquarium(var length: Int = 100, var width: Int = 20, var height: Int = 40) {
//    init {
//        println("aquarium initializing")
//    }
//    init {
//        println("Volumn: ${width * length * height / 1000} l")
//    }
//    fun printSize() {
//        println("Width: $width cm " + "Length: $length cm " + "Height: $height cm")
//    }
//}

//class Aquarium(var length: Int = 100, var width: Int = 20, var height: Int = 40) {
//    init {
//        println("aquarium initializing")
//    }
//    init {
//        println("Volumn: ${width * length * height / 1000} l")
//    }
//    constructor(numberOfFish: Int): this() {
//        val tank = numberOfFish * 2000 * 1.1
//        height = (tank / (length * width)).toInt()
//    }
//    fun printSize() {
//        println("Width: $width cm " + "Length: $length cm " + "Height: $height cm")
//    }
//}

//class Aquarium(var length: Int = 100, var width: Int = 20, var height: Int = 40) {
//    var volume: Int
//        get() = width * height * length / 1000
//    init {
//        println("aquarium initializing")
//    }
//    constructor(numberOfFish: Int): this() {
//        val tank = numberOfFish * 2000 * 1.1
//        height = (tank / (length * width)).toInt()
//    }
//    fun printSize() {
//        println("Width: $width cm " + "Length: $length cm " + "Height: $height cm")
//        println("Volume: $volume l")
//    }
//}

//class Aquarium(var length: Int = 100, var width: Int = 20, var height: Int = 40) {
//    var volume: Int
//        get() = width * height * length / 1000
//        set(value) {
//            height = (value * 1000) / (width * length)
//        }
//    init {
//        println("aquarium initializing")
//    }
//    constructor(numberOfFish: Int): this() {
//        val tank = numberOfFish * 2000 * 1.1
//        height = (tank / (length * width)).toInt()
//    }
//    fun printSize() {
//        println("Width: $width cm " + "Length: $length cm " + "Height: $height cm")
//        println("Volume: $volume l")
//    }
//}

open class Aquarium(open var length: Int = 100, open var width: Int = 20, open var height: Int = 40) {
    open var volume: Int
        get() = width * height * length / 1000
        set(value) {
            height = (value * 1000) / (width * length)
        }
    open val shape = "rectangle"
    open var water: Double = 0.0
        get() = volume * 0.9
    init {
        println("aquarium initializing")
    }
    constructor(numberOfFish: Int): this() {
        val tank = numberOfFish * 2000 * 1.1
        height = (tank / (length * width)).toInt()
    }
    fun printSize() {
        println(shape)
        println("Width: $width cm " + "Length: $length cm " + "Height: $height cm")
        println("Volume: $volume l Water: $water l (${water/volume*100.0}% full)")
    }
}

class TowerTank(override var height: Int, var diameter: Int): Aquarium(height = height, width = diameter, length = diameter) {
    override var volume: Int
        get() = (width/2 * length/2 * height/1000 * PI).toInt()
        set(value) {
            height = ((value * 1000 / PI) / (width/2 * length/2)).toInt()
        }
    override var water = volume * 0.8
    override val shape = "cylinder"
}