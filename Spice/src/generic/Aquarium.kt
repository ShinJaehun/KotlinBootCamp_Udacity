package generic

open class WaterSupply(var needsProcessing: Boolean)

class TapWater: WaterSupply(true) {
    fun addChemicalCleaners(){
        needsProcessing = false
    }
}

class FishStoreWater: WaterSupply(false)

class LakeWater: WaterSupply(true) {
    fun filter(){
        needsProcessing = false
    }
}

//class Aquarium<T>(val waterSupply: T)
//class Aquarium<T: Any?>(val waterSupply: T) // to allow null
//class Aquarium<T: Any>(val waterSupply: T) // not to allow null
//class Aquarium<T: WaterSupply>(val waterSupply: T) // only a WaterSupply (or one of its subclasses) can be passed for T

//class Aquarium<T: WaterSupply>(val waterSupply: T) {
//    fun addWater() {
//        check(!waterSupply.needsProcessing) { "water supply needs processing first" }
//        println("adding water from $waterSupply")
//    }
//}

//class Aquarium<T: WaterSupply>(val waterSupply: T) {
// 이렇게 하면 addItemTo(aquarium)이 type mismatch
// because Kotlin can't ensure that you are not doing anything unsafe with the type.
class Aquarium<out T: WaterSupply>(val waterSupply: T) {
//    fun addWater() {
//        check(!waterSupply.needsProcessing) { "water supply needs processing first" }
//        println("adding water from $waterSupply")
//    }
    fun addWater(cleaner: Cleaner<T>) {
        if(waterSupply.needsProcessing) {
            cleaner.clean(waterSupply)
        }
        println("water added")
    }

//    fun <R: WaterSupply> hasWaterSupplyOfType() = waterSupply is R
    inline fun <reified R: WaterSupply> hasWaterSupplyOfType() = waterSupply is R
}
fun addItemTo(aquarium: Aquarium<WaterSupply>) = println("item added")

//interface Cleaner<in T: WaterSupply> {
//fun addWater(cleaner: Cleaner<T>) { 에서 T가 unsafe
interface Cleaner<in T: WaterSupply> {
    fun clean(waterSupply: T)
}

class TapWaterCleaner: Cleaner<TapWater> {
    override fun clean(waterSupply: TapWater) = waterSupply.addChemicalCleaners()
}

//fun isWaterClean(aquarium: Aquarium<WaterSupply>) {
//    println("aquarium water is clean: ${!aquarium.waterSupply.needsProcessing}")
//}

fun <T: WaterSupply> isWaterClean(aquarium: Aquarium<T>) {
    println("aquarium water is clean: ${!aquarium.waterSupply.needsProcessing}")
}

inline fun <reified T: WaterSupply> WaterSupply.isOfType() = this is T
inline fun <reified R: WaterSupply> Aquarium<*>.hasWaterSupplyOfType() = waterSupply is R

fun genericExample(){
//    val aquarium = Aquarium<TapWater>(TapWater())
//    val aquarium = Aquarium(TapWater()) // generic type 생략 가능
//    println(aquarium.waterSupply) // generic.TapWater@5b6f7412 뭐 이런 식으로 출력 됨
//    println("water needs processing: ${aquarium.waterSupply.needsProcessing}")
//    aquarium.waterSupply.addChemicalCleaners() // 여기서 waterSupply를 통해 접근할 수 있다는 점!
//    println("water needs processing: ${aquarium.waterSupply.needsProcessing}")

//    val aquarium2 = Aquarium("string")
//    println(aquarium2.waterSupply)

//    val aquarium3 = Aquarium(null)
//    if (aquarium3.waterSupply == null) {
//        println("watersupply is null")
//    }

//    val aquarium4 = Aquarium(LakeWater())
//    aquarium4.waterSupply.filter() // check() 때문에 이 과정이 없으면 exception
//    aquarium4.addWater()

//    val aquarium5 = Aquarium(TapWater())
//    addItemTo(aquarium5)

//    val cleaner = TapWaterCleaner()
//    val aquarium6 = Aquarium(TapWater())
//    aquarium6.addWater(cleaner)

//    val aquarium7 = Aquarium(TapWater())
////    isWaterClean<TapWater>(aquarium7)
//    isWaterClean(aquarium7)

//    val aquarium8 = Aquarium(TapWater())
//    println(aquarium8.hasWaterSupplyOfType<LakeWater>())
    val aquarium9 = Aquarium(TapWater())
//    println(aquarium9.waterSupply.isOfType<TapWater>())
    println(aquarium9.hasWaterSupplyOfType<TapWater>())
}

fun main(){
    genericExample()
}