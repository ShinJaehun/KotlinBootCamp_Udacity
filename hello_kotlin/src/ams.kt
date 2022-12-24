import java.util.*

//fun main(args: Array<String>) {
//    val t = args[0].toInt()
//    println(" ${ if (t < 12) "Good morning Kotlin" else "Good night Kotlin"}")
//}

//fun dayOfWeek() {
//    println("What day is it today?")
//    when(Calendar.getInstance().get(Calendar.DAY_OF_WEEK)){
//        1 -> println("Sunday")
//        7 -> println("Saturday")
//        else -> println("Other day")
//    }
//}

//fun main(args: Array<String>) {
//    println("Hello, ${args[0]}")
//    dayOfWeek()
//}

//fun main(args: Array<String>) {
//    feedTheFish()
//}
//
//fun feedTheFish(){
//    val day = randomDay()
//    val food = fishFood(day)
//    println ("Today is $day and the fish eats $food")
//}
//
//fun randomDay() : String {
//    val week = listOf("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")
//    return week[Random().nextInt(7)]
//}
//
//fun fishFood(day : String) : String {
//    return when(day) {
//        "Monday" -> "flakes"
//        "Wednesday" -> "redworms"
//        "Thursday" -> "snake"
//        "Friday" -> "mosquitoes"
//        "Sunday" -> "bear"
//        else -> "fasting"
//    }
//}

//fun getFortuneCookie() : String {
//    val fortunes = listOf(
//        "You will have a great day!",
//        "Things will go well for you today.",
//        "Enjoy a wonderful day of success.",
//        "Be humble and all will turn out well.",
//        "Today is a good day for exercising restraint.",
//        "Take it easy and enjoy life!",
//        "Treasure your friends because they are your greatest fortune."
//    )
//
//    println("Enter your birthday: ")
//    val birthday = readLine()?.toIntOrNull() ?: 1
//
//    return fortunes[birthday.rem(fortunes.size)]
//}
//
//fun main(args: Array<String>) {
//    println ("Your fortune is: ${getFortuneCookie()}")
//}


//fun getBirthday() : Int {
//    println("Enter your birthday: ")
//    return readLine()?.toIntOrNull() ?: 1
//}
//
//fun getFortune(birthday : Int) : String {
//    val fortunes = listOf(
//        "You will have a great day!",
//        "Things will go well for you today.",
//        "Enjoy a wonderful day of success.",
//        "Be humble and all will turn out well.",
//        "Today is a good day for exercising restraint.",
//        "Take it easy and enjoy life!",
//        "Treasure your friends because they are your greatest fortune."
//    )
//
//    val index = when(birthday) {
//        in 1..7 -> 4
//        28, 31 -> 2
//        else -> birthday.rem(fortunes.size)
//    }
//
//    return fortunes[index]
//}
//
//fun main(args: Array<String>) {
//    var fortune: String
//    for (i in 1..10) {
//        fortune = getFortune(getBirthday())
//        println ("Your fortune is: $fortune")
//        if (fortune.contains("Take it easy")) break;
//    }
//}

//fun main(args: Array<String>) {
//    feedTheFish()
//}
//
//fun feedTheFish(){
//    val day = randomDay()
//    val food = fishFood(day)
//    println ("Today is $day and the fish eats $food")
//}
//
//
//fun shouldChangeWater(
//    day: String,
//    temperature: Int = 22,
//    dirty: Int = 20) {
//
//}
//
//fun randomDay() : String {
//    val week = listOf("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")
//    return week[Random().nextInt(7)]
//}
//
//fun fishFood(day : String) : String {
//    return when(day) {
//        "Monday" -> "flakes"
//        "Wednesday" -> "redworms"
//        "Thursday" -> "snake"
//        "Friday" -> "mosquitoes"
//        "Sunday" -> "bear"
//        else -> "fasting"
//    }
//}

//fun canAddFish(
//    tankSize : Double,
//    currentFish : List<Int>,
//    fishSize : Int = 2,
//    hasDecorations : Boolean = true ) : Boolean {
//
//    return (tankSize * if (hasDecorations) 0.8 else 1.0) >= currentFish.sum() + fishSize
//
////    if (hasDecorations) {
////        var total: Int = 0
////        for (i in currentFish) total += i
////
////        return tankSize * 0.8 >= total + fishSize
////    } else {
////        var total: Int = 0
////        for (i in currentFish) total += i
////
////        return tankSize >= total + fishSize
////    }
//}
//
//fun main(args: Array<String>){
//    println(canAddFish(10.0, listOf(3,3,3)))
//    println(canAddFish(8.0, listOf(2,2,2), hasDecorations = false))
//    println(canAddFish(9.0, listOf(1,1,3), 3))
//    println(canAddFish(10.0, listOf(), 7, true))
//}

//fun getBirthday() : Int {
//    println("Enter your birthday: ")
//    return readLine()?.toIntOrNull() ?: 1
//}
//
//fun getFortune(birthday : Int) : String {
//    val fortunes = listOf(
//        "You will have a great day!",
//        "Things will go well for you today.",
//        "Enjoy a wonderful day of success.",
//        "Be humble and all will turn out well.",
//        "Today is a good day for exercising restraint.",
//        "Take it easy and enjoy life!",
//        "Treasure your friends because they are your greatest fortune."
//    )
//
//    val index = when(birthday) {
//        in 1..7 -> 4
//        28, 31 -> 2
//        else -> birthday.rem(fortunes.size)
//    }
//
//    return fortunes[index]
//}
//
//fun main(args: Array<String>) {
//    var fortune: String =""
//    while (!fortune.contains("Take it easy")) {
//        fortune = getFortune(getBirthday())
//        println ("Your fortune is: $fortune")
//    }
//}

//val rollDice = { Random().nextInt(12) + 1 }
//val rollDice = { sides : Int -> Random().nextInt(sides) + 1 }
val rollDice = { sides : Int ->
    if (sides == 0) 0
    else Random().nextInt(sides) + 1
}

val rollDice2 : (Int) -> Int = { sides : Int ->
    if (sides == 0) 0
    else Random().nextInt(sides) + 1
}


fun gamePlay(rollDice : Int){
    println("$rollDice")
}
gamePlay(rollDice2(4))


