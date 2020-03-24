// 1


fun main(args: Array<String>) 
{
    class Person{
        var name: String = "Martynenko Roman"
        var age: Int = 20
     
        val info: String
            get() = "Name: $name  Age: $age"
    }
    
    val a = Person()

    a.name = "Martynenko Roman"
    println(a.info)
    
}

// 2

fun main(args: Array<String>) 
{
    class Person{
        var _name : String = "n"
        var name: String = "nn"
            get() = "$name"
            set(value){
                    if(value.length >= 2)
                        _name = value 
                		field = value

                }
        
        var age: Int = 20
     
        val info: String
            get() = "Name: $_name  Age: $age"
    }
    
    val a = Person()
    println(a.name)
    a.name = "fefe"
    println(a.name)
    
}
//3

fun main(args: Array<String>) 
{
    class Gate{
        val IN : Int = 1
        val OUT: Int = -1
        val CLOSED: Int = 0
        var mSwing: Int = 0
        
        fun getSwingDirection(): Int = mSwing
        fun setSwing(direction: Int): Boolean
        {
            if (direction == IN || direction == OUT || direction == CLOSED)
            {
                mSwing = direction
                return true
            } 
            return false
        }
        fun open(direction: Int): Boolean
        {
            if (direction == IN || direction == OUT)
            {
                setSwing(direction)
                return true
            } 
            return false
        }
        fun close()
        {
            mSwing = CLOSED
        }
        fun thru(count: Int): Int
        {
            if (count == IN) return count
            if (count == OUT) return -count
            if (count == CLOSED) return 0
            return 0
        }
        override fun toString(): String
        {
            if (mSwing == CLOSED) return "This gate is closed"
            if (mSwing == IN) return "This gate is open and swings to enter the pen only"
            if (mSwing == OUT) return "This gate is open and swings to exit the pen only"
            return "This gate has an invalid swing direction"
            
            // ворота, которые закрыты
            // воротa, которые установлены в положение IN
            // воротa, которые установлены в положение OUT
            // ворота, у которых положение отлично от IN, OUT или CLOSED
        }

    }

    val a = Gate()
    println(a.toString())

}
