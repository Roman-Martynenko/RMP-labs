import java.awt.Dimension
import kotlin.reflect.jvm.internal.impl.load.kotlin.JvmType

fun main(args: Array<String>)
{
    val cats = listOf("Barsik", null, "Murzik", "Ryzhik", null)
    cats.forEach { it?.let{println(it)} }
}