import java.awt.Dimension
import kotlin.reflect.jvm.internal.impl.load.kotlin.JvmType

fun main(args: Array<String>)
{
    val lamd1 = {s: String -> s.split("bye").size - 1}
    println(lamd1("Hello"))
    println(lamd1("Good bye bye bye"))

}