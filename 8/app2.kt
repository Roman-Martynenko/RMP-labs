import java.awt.Dimension
import kotlin.reflect.jvm.internal.impl.load.kotlin.JvmType

fun main(args: Array<String>)
{
    val myList = List(5) { i -> i * 2 }
    var myList2 = MutableList(10) { i -> i * i }

    val originalMap = mapOf("key1" to 1, "key2" to 2, "key3" to 3)
    val filteredMap = originalMap.filter { it.value < 2 }

    println(listOf(1, 2, 3, 4, 5).filter { it >= 3 }) // [3, 4, 5]
    println(listOf(1, 2, 3, 4, 5).filter { it % 2 == 0 }) // [2, 4]


    val cats = listOf("Barsik", "Murzik", "Ryzhik")
    cats.forEach { println(it) }

    val cats2 = listOf("Барсик", "Мурзик", "Пикассо", "Васька", "Рыжик")
    val filtered = cats2.filter { it.contains("ик") }.sortedBy { it.length }
    println(filtered)

    println(myList)
    println(myList2)

}
