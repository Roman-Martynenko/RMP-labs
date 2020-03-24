// 1

//  виды объявления массива:
val numbers = arrayOf<int>(1, 2, 3, 4, 5)
//val numbers = intArrayOf(1, 2, 3, 4, 5)
//val numbers: Array<Int> = arrayOf(1, 2, 3, 4, 5)

// выполнить вывод в консоль индексы и значения элементов массива,
// 1)	используя свойство indices;
// 2)	используя метод withIndex().

fun main(args: Array<String>) 
{
    val numbers = intArrayOf(1, 2, 3, 4, 5)

    for (i in numbers.indices) 
    {
        println("index: ${i}   value: ${numbers[i]}")
    }

    val iterator = (numbers).iterator()

    for ((index, value) in iterator.withIndex()) 
    {
        println("The element at $index is $value")
    }
    
}

// index: 0   value: 1
// index: 1   value: 2
// index: 2   value: 3
// index: 3   value: 4
// index: 4   value: 5

// 2

fun main(args: Array<String>) 
{
    val numbers = intArrayOf(1, 2, 3, 4, 5)
    var arr = emptyArray<String>()

    for (i in numbers) 
    {
        arr +=i.toString()
    }
    
}
//3

fun main(args: Array<String>) 
{

    var arr = arrayOfNulls<Char>(5)
    
    arr.set(0,'a')
    arr.set(1,'b')
    arr.set(2,'c')
    arr.set(3,'d')
    arr.set(4,'e')
    
    
    for (i in 0..4)
    {
        println(arr.get(i))
    }
}

// 4

fun main(args: Array<String>) 
{
    val myArray = Array(5, { i -> i * 2 })
	println(myArray[1])     // 2
    println(myArray[2])     // 4
    println(myArray[3])     // 6

}


// 5

fun main(args: Array<String>) 
{
    val myArray = Array(5, { i -> i * 2 })
    
    myArray.forEach {
    println("The element is $it")

}

// The element is 0
// The element is 2
// The element is 4
// The element is 6
// The element is 8
    
    
// 6
fun main(args: Array<String>) 
{
    val myArray = Array(5, { i -> i * 2 })
    
    val start = args[0].toInt()
    val stop = args[1].toInt()

    for(i in start until stop)
    {
        myArray[i] *= -1
    }
    
    myArray.forEach {
    println("The element is $it")
}

//3 5
// The element is 0
// The element is 2
// The element is 4
// The element is -6
// The element is -8

    

// Колекции

// 1


fun main(args: Array<String>) 
{
    val set = setOf(1, 3, -4, 2, -11)
    val (positive, negative) = set.partition { it > 0 }
    println(positive)
    println(negative)   
    

}

// 2

fun main(args: Array<String>) 
{
    val intsHashSet = hashSetOf(1, 2, 3, 4)
    println(intsHashSet)
    intsHashSet.add(5)
    println("add 5")
    println(intsHashSet)
    println("remove 2")
    intsHashSet.remove(2)
    println(intsHashSet)
    println(intsHashSet.elementAt(2))
    
	println(intsHashSet.isEmpty())
    println(intsHashSet.size)
    println(intsHashSet.contains(4))
    println(intsHashSet.toString())
    println(intsHashSet.last())
    println(intsHashSet.hashCode())
    intsHashSet.clear()
    println(intsHashSet)


}




// 3

fun main(args: Array<String>) {

    var list = listOf(1, 2, 3)
    var dest = list.map { it * it }
    println(dest.toString()) // выводит [1, 4, 9]
        
    val cats = listOf("Мурзик", "Барсик", "Рыжик")
    println(cats.getOrElse(4) { "Неизвестный котик" })

    val list = listOf(1, 2, 3, 4, 5)
    // сколько не четных
    println(list.count { it % 2 == 1 }) // 3
        

}

// 4

fun main(args: Array<String>) {

    val map1 = mapOf("beverage" to 2.7, "meal" to 12.4)
    val map2 = map1.mapValues { it.value.toString() + "$" }
    println(map2) // {beverage=2.7$, meal=12.4$}

}


// 5

fun main(args: Array<String>) {

    val currenciesMutableMap: MutableMap<String, String> =
    mutableMapOf("Гривна" to "Украина", "Доллар" to "США", "Лира" to "Турция")
    println("Страны: ${currenciesMutableMap.values}") // Страны: [Украина, США, Турция]
    println("Валюты: ${currenciesMutableMap.keys}") // Валюты: [Гривна, Доллар, Лира]
    println(currenciesMutableMap) // {Гривна=Украина, Доллар=США, Лира=Турция}
    currenciesMutableMap.put("Тугрик", "Монголия")
    println(currenciesMutableMap) // {Гривна=Украина, Доллар=США, Лира=Турция, Тугрик=Монголия}
    currenciesMutableMap.remove("Доллар")
    println(currenciesMutableMap) // {Гривна=Украина, Лира=Турция, Тугрик=Монголия}

}



