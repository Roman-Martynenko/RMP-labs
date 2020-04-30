import java.awt.Dimension
import kotlin.reflect.jvm.internal.impl.load.kotlin.JvmType

fun main(args: Array<String>)
{
    fun printAllCaps(s:String?){
        val allCaps: String? = s?.toString()
        println(allCaps)
    }

    printAllCaps(null)
}