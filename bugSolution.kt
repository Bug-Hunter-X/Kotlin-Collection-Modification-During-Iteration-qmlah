fun main() {
    val list = mutableListOf(1, 2, 3, 4, 5)
    val newList = list.filter { it % 2 != 0 }
    println(newList) // Output: [1, 3, 5]

    val map = mutableMapOf("a" to 1, "b" to 2, "c" to 3)
    val newMap = map.filter { it.value % 2 != 0 }
    println(newMap) // Output: {a=1, c=3}

    //Alternative solution for map using toMutableMap()
    val map2 = mutableMapOf("a" to 1, "b" to 2, "c" to 3)
    val newMap2 = map2.filter { it.value % 2 != 0 }.toMutableMap()
    println(newMap2) //Output: {a=1, c=3}
} 