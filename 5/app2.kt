fun main(args: Array<String>) {

    //вызов статического метода
    Ship.LifeBoat.down()

    //создание объекта статического класса
    val lf = Ship.LifeBoat() //вызов обычного метода
    lf.swim()
}


open class Ship {
    private val id = 0

    class LifeBoat {
        fun swim() {
            println("отплытие шлюпки")
        }

        companion object {
            fun down() {
                println("шлюпки на воду!")
            }
        }
    }

}