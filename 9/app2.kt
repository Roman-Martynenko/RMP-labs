import java.awt.Dimension
import kotlin.reflect.jvm.internal.impl.load.kotlin.JvmType

fun main(args: Array<String>)
{
    var p1 = Person1()
    var p2 = Person1("Роман")

    p1.Hello()
    p2.Hello()
    println(p1.getName())
}

class Person1( name: String?) {
    constructor() : this(null)

    private var name = name
    fun setName(_name: String?){name = _name}
    fun getName() = name
    fun Hello()
    {
        if (name == null){ println("Hello Anonim") }
        else { println("Hello $name") }
    }
}