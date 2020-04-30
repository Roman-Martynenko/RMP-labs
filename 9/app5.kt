import java.awt.Dimension
import kotlin.reflect.jvm.internal.impl.load.kotlin.JvmType

fun main(args: Array<String>)
{
    fun x1(obj:Any)
    {
        val x: String? = obj as? String
        if(x == null) { println("Undefined") }
        else { println(x) }

    }
    x1("fsfwe")
    x1(123123)
    x1(1.3)

}