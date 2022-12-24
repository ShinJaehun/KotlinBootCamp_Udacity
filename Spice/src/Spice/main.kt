package Spice

fun main(args: Array<String>) {
//    val SimpleSpiceInstance = SimpleSpice()
//    println("Name : ${SimpleSpiceInstance.name} " + "Heat : ${SimpleSpiceInstance.heat}")

    val spicesList = listOf(
        Spice("curry", "mild"),
        Spice("pepper", "medium"),
        Spice("cayenne", "spicy"),
        Spice("ginger", "mild"),
        Spice("red curry", "medium"),
        Spice("green curry", "mild"),
        Spice("hot pepper", "extremely spicy")
    )

    val spiceListLessThan5 = spicesList.filter {it.heat < 5}

    for (item in spiceListLessThan5) {
        //loop for list
        println("${item.name} is ${item.spiciness}")
    }
}