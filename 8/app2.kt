import java.awt.Dimension
import kotlin.reflect.jvm.internal.impl.load.kotlin.JvmType

fun main(args: Array<String>)
{
    val myList = List(5) { i -> i * 2 }
    var myList2 = MutableList(10) { i -> i * i }

    println(myList)
    println(myList2)

}