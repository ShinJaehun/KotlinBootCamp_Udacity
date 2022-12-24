package Buildings

open class BaseBuildingMaterial(val numberNeeded: Int = 1)

class Wood: BaseBuildingMaterial(numberNeeded = 4)

class Brick: BaseBuildingMaterial(numberNeeded = 8)

class Building<T: BaseBuildingMaterial>(val baseBuildingMaterial: T, val baseMaterialsNeeded: Int = 100) {
    val actualMaterialsNeeded: Int = baseMaterialsNeeded * baseBuildingMaterial.numberNeeded
    fun build(){
        println("${actualMaterialsNeeded} ${baseBuildingMaterial::class.simpleName} required")
    }
}

fun <R: BaseBuildingMaterial>isSmallBuilding(building: Building<R>){
    if (building.actualMaterialsNeeded < 500) {
        println("small building")
    } else {
        println("large building")
    }
}

fun main() {
    val building = Building(Wood())
//    building.build()
    isSmallBuilding(building)
}