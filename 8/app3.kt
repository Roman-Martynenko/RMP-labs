import java.awt.Dimension
import kotlin.reflect.jvm.internal.impl.load.kotlin.JvmType

fun main(args: Array<String>)
{
    val lamd = {p:Person -> p.name}
    val people = listOf(Person("Alice", 29), Person("Bob", 31))
    val names = people.joinToString(separator = " "){lamd(it)}

    println(names)

}

class Person(Name:String, Age:Int) {
    var name: String = Name
    var age: Int = Age
}