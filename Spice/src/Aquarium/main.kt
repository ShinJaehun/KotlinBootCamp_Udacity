package Aquarium

fun buildAquarium() {
//    val myAquarium = Aquarium()
//    myAquarium.printSize()
//    myAquarium.height = 60
//    myAquarium.printSize()

//    val aquarium1 = Aquarium()
//    aquarium1.printSize()
//    val aquarium2 = Aquarium(width=25)
//    aquarium2.printSize()

//    val aquarium6 = Aquarium(numberOfFish = 29)
//    aquarium6.printSize()
//    println("Volume: ${aquarium6.width *aquarium6.length * aquarium6.height / 1000}  l")

//    val aquarium7 = Aquarium(numberOfFish = 29)
//    aquarium7.printSize()
//    aquarium7.volume = 70
//    aquarium7.printSize()

//    val aquarium8 = Aquarium(length=25, width=25, height = 40)
//    aquarium8.printSize()

//    val myAquarium = Aquarium(length=25, width=25, height = 40)
//    myAquarium.printSize()
//    val myTower = TowerTank(diameter=25, height = 40)
//    myTower.printSize()
}

fun makeFish() {
    val shark = Shark()
    val pleco = Plecostomus()
    println("Shark: ${shark.color}")
    shark.eat()
    println("Plecostomus: ${pleco.color}")
    pleco.eat()
}

fun feedFish(fish: FishAction) {
    // 어떤 종류의 fish인지 상관 없이 fishAction의 eat()만 구현되어 있으면 사용 가능
    fish.eat()
}

fun main() {
//    buildAquarium()
//    makeFish()

//    val shark = Shark()
//    feedFish(shark)

    val sealion = SeaLion()
    println(matchSeal(sealion)) // 예상대로 처리됨!
}