package game

enum class Direction () {
    NORTH, SOUTH, EAST, WEST, START, END
}

class Game(){
    var path = mutableListOf<Direction>(Direction.START)

    var north = { path.add(Direction.NORTH) }
    var south = { path.add(Direction.SOUTH) }
    var east = { path.add(Direction.EAST) }
    var west = { path.add(Direction.WEST) }

    var end = {
        path.add(Direction.END)
        print("Game Over: ")

//        path.forEach(){
//            print(it)
//            print(" ")
//        }

        print(path) // 걍 이렇게만 해도...
        path.clear()
        false
    }

    fun move(where: () -> Boolean) {
        where()
    }

    fun makeMove(str: String?) {
        if (str == null) return
        when (str) {
            "n" -> {
                move(north)
            }
            "s" -> {
                move(south)
            }
            "w" -> {
                move(west)
            }
            "e" -> {
                move(east)
            }
            else -> {
                move(end)
            }
        }
    }

}

fun main(){
    val game = Game()
//    game.north()
//    game.south()
//    game.east()
//    game.west()
//    game.end()
//    println(game.path)

//    val numbers = listOf<Int>(1,2,3,4,5,6,7,8,9,0)
//    println(numbers.filter { it % 3 == 0 })

    while (true) {
        print("Enter a direction: n/s/e/w:")
        game.makeMove(readLine())
        println(game.path)
    }
}
