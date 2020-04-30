import java.awt.Dimension
import kotlin.reflect.jvm.internal.impl.load.kotlin.JvmType

fun main(args: Array<String>)
{
    var p1 = Person2()
    var p2 = Person2("Роман")

    println(p1.NameLength())
    println(p2.NameLength())
}

class Person2( name: String?) {
    constructor() : this(null)

    private var name = name
    fun setName(_name: String?){name = _name}
    fun getName() = name
    fun NameLength() = name?.length ?: 0
}