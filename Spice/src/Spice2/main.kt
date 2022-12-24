package Spice2

fun main(args: Array<String>) {
    val curry = Curry();
    curry.prepareSpice()
//    println("${curry.prepareSpice()}") // 븅시나 prepareSpice()에서 println()을 호출하는데 거기에 다시 println()을 했으니...
//    쓸데 없이 'kotlin.Unit'이 출력되는 이유가 바로 이것!
    println("${curry.color}")

//    val spiceContainer = SpiceContainer(label = "hello")
//    println(spiceContainer.label)
}

//abstract class Spice (val name: String, val spiciness: String = "mild") {
sealed class Spice (val name: String, val spiciness: String = "mild") {
    val heat: Int
        get() {
            return when (spiciness) {
                "mild" -> 1
                "medium" -> 3
                "spicy" -> 5
                "very spicy" -> 7
                "extremely spicy" -> 10
                else -> 0
            }
        }

    init {
        println("${name}'s level of spiciness ${spiciness} -> ${heat}" )
    }

    abstract fun prepareSpice()
}

class Curry(name: String = "Curry", color: SpiceColor = YellowSpiceColor): Spice(name), Grinder, SpiceColor by color{
    override fun prepareSpice() {
        println("preparing spice")
    }

    override fun grind() {
    }
}

interface Grinder {
    fun grind()
}

interface SpiceColor {
//    val color: String
    val color: Color
}

enum class Color(val rgb: Int) {
    RED(0xFF0000), GREEN(0x00FF00), BLUE(0x0000FF), YELLOW(0xFFFF00);
}
object YellowSpiceColor: SpiceColor {
//    override val color = "yellow"
    override val color = Color.YELLOW;
}