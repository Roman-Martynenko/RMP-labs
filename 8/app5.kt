import java.awt.Dimension
import kotlin.reflect.jvm.internal.impl.load.kotlin.JvmType

fun main(args: Array<String>)
{
    val a = 3
    val b = 10
    val sum = { х: Int, у: Int -> х + у + b }
    println(sum(5, 4))


}

