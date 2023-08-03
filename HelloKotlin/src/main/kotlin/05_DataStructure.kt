/* collection
*  Mutable : 읽기 및 삽입, 삭제 수정 가능
*  Immutable : 읽기 전용
* */

fun listEx(){
    // List
    val fruitList = listOf("Banana","Apple","Melon") // Immutable List
    println("Frist fruitList ${fruitList[0]}")

    val mutableFruitList = mutableListOf("Banana","Apple","Melon")
    println("Frist fruitList ${mutableFruitList[0]}")
    mutableFruitList[0] = "Strawberry"
    println("Change fruitList ${mutableFruitList[0]}")

    println(mutableFruitList)

    mutableFruitList.forEach { fruit ->
        println("MY Fruit List : $fruit")
    }
}


// Set
fun immutableSet(){
    val immutableNumSet = setOf(1,1,2,2,3,3,3,4) // immutableSet

    val mutableSet = mutableSetOf(1,1,2,3,3,4,5,6) // mutableSet
    mutableSet.add(100)
    mutableSet.remove(1)
    println(mutableSet.contains(4)) // 존재여부 확인
}


// Map
fun mapEx(){
    val immutableMap = mapOf("name" to "Joyce", "age" to 100, "height" to 170) // immutableMap
//    println(immutableMap["name"])
//    println(immutableMap["no"])

    val mutableMap = mutableMapOf("name" to "Joyce", "age" to 100, "height" to 170) // mutableMap
    mutableMap["age"] = 10

    mutableMap.put("hobby", "coding")
    mutableMap.remove("name")
    mutableMap.replace("age", 80)
    println(mutableMap)

    println(mutableMap["age"])

}
