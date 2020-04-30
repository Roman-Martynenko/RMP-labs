import java.awt.Dimension
import kotlin.reflect.jvm.internal.impl.load.kotlin.JvmType

fun main(args: Array<String>)
{
    val pers = listOf(
        Person3("Мартыненко","Роман","Сергеевич"),
        Person3("Блинов","Наум","Геннадьевич"),
        Person3("Петухов","Афанасий",null),
        Person3("Лихачёв","Мстислав","Владимирович"),
        Person3("Князев","Вилен",null),
        Person3("Орлов","Ибрагил",null)
    )
    pers.forEach{
        val p = it
        it.o?.let { println("${p.f} ${p.i} ${p.o} ") }
    }
}

class Person3(var f: String, var i: String, var o: String?) {}