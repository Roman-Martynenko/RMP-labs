
// 3
fun main(args: Array<String>) {
    var num = 123
    println(counter(num))
    fullStr(num)
}

fun counter (inputValue:Int): Int
{
    val str = "$inputValue sm."
    return str.length
}

fun fullStr(a:Int):String
{
    val str = "$a см."
    return str
}

//4

fun fullStr2(a:Int) = "$a см."

//5

fun main(args: Array<String>) {
    println("Hello, ${args[0]}")
}


//6

fun main(args: Array<String>) {
    if (args.size == 0) {
        println("Please provide a name as a command-line argument")
        return
    }
    println("Hello, ${args[0]}!")
}

//7

fun main(args: Array<String>) {
    var str = "Hello, "
    for (a in args)
        str += a
    println(str)
}


//8 

fun main(args: Array<String>) {
    println("Фамилия: ${args[0]},")
    println("Имя: ${args[1]},")
    println("Отчество: ${args[2]}")
}

// 9

fun main(args: Array<String>) {
    println("Первое слогаемое: ${args[0]},")
    println("Второе слогаемое: ${args[1]},")
    // var a = args[0].toInt()
    // var b = args[1].toInt()
    // var c = a+b
    // println("Сумма: ${c}")
    println("Сумма: ${args[0].toInt() + args[1].toInt()}")
}

// 10
fun main(args: Array<String>)
{
    for(a in args)
    {
        println("Hello, ${a}!")
    }
    
}

// 11

fun main(args: Array<String>) {
    var factorial = 1
    for (name in args)
        factorial = factorial * name.toInt()
    println("5! равно $factorial")
}

// 12

fun main(args: Array<String>) {
    var summ = 0
    for (name in args)
        summ += name.toInt()
    println("Сумма = $summ")
}

// 13

fun main(args: Array<String>) {
    var str = ""
    for (name in args)
        str += name + " "
    println(str)
}


// 14

fun main(args: Array<String>) {
    for (index in args.indices)
        println("item at ${index} is ${args[index]}")
    
}

//15

fun main(args: Array<String>) {
    var index = 0
    while (index < args.size) 
    {
        println("item at ${index} is ${args[index]}")
        index++
    }
       
}

