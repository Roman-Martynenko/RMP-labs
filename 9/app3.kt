import java.awt.Dimension
import kotlin.reflect.jvm.internal.impl.load.kotlin.JvmType

fun main(args: Array<String>)
{
    class Address(val streetAddress: String, val zipCode: Int, val city: String, val country: String)
    open class Company(val name: String, val address: Address?)
    class Person(val name: String, val company: Company?)

    fun Person.countryName(): String {
        val country = this.company?.address?.country
        return if (country != null) country else "Unknown"
    }

    var p1 = Person("Роман", null)
    println(p1.countryName())

    var c1 = Company("TryDep", null)
    var p2 = Person("Roman", c1)
    println(p2.countryName())

    var a1 = Address("Kom",12345,"Simf","Russian")
    var c2 = Company("TryDep", a1)
    var p3 = Person("Roman", c2)
    println(p3.countryName())
}

