package example

data class Fish(var name: String)

fun fishExamples(){
    val fish = Fish("splashy")
//    with (fish.name) {
//        println(this.capitalize())
//    }
    myWith (fish.name) {
        println(this.capitalize())
    }

    println(fish.run {name}) // myWith()가 사실 name을 변경하는 건 아닌거야...

    val fish2 = Fish(name="splash").apply {
        name = "sharky"
    }
//    println(fish2.name)

    // run() returns the result of applying the function, and apply() returns the object after applying the function

    println(fish.let { it.name.capitalize() }
        .let { it + "fish" }
        .let { it.length }
        .let { it + 31 }
    )
}

fun myWith(name: String, block: String.() -> Unit) {
    name.block()
}

fun main(){
    fishExamples()
}