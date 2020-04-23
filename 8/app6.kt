import java.awt.Dimension
import kotlin.reflect.jvm.internal.impl.load.kotlin.JvmType

fun main(args: Array<String>)
{

    val people = listOf(Person("Alice", 29), Person("Bob", 31))
    //val a: Int? = null

    println(people.maxBy(Person::age)!!.name)
    //println(a?:0)

}


