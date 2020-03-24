import kotlin.math.sqrt

// абстрактный класс фигуры
abstract class Figure {
    // абстрактный метод для получения периметра
    abstract fun perimeter(): Float

    // абстрактный метод для получения площади
    abstract fun area(): Float
}
// производный класс прямоугольника
class Rectangle(val width: Float, val height: Float) : Figure()
{
    // переопределение получения периметра
    override fun perimeter(): Float{
        return width * 2 + height * 2;
    }
    // переопрелеление получения площади
    override fun area(): Float{
        return width * height;
    }
}

// производный класс треугольника
class Triangle(val a: Float, val b: Float, val c: Float) : Figure()
{
    // переопределение получения периметра
    override fun perimeter(): Float{
        return a + b + c
    }
    // переопрелеление получения площади
    override fun area(): Float{
        val p = perimeter() / 2
        return sqrt(p * (p-a) * (p-b) * (p-c));
    }
}

// производный класс трапеции
class Trapezoid(val a: Float, val b: Float, val c: Float, val d: Float, val h: Float) : Figure()
{
    // переопределение получения периметра
    override fun perimeter(): Float{
        return a + b + c + d
    }
    // переопрелеление получения площади
    override fun area(): Float{
        return (a + b) * h / 2;
    }
}
