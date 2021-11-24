fun main() {
    // интерфейсы удобно использовать в коллекциях
    val figures: Array<Movable>
    val movable: Movable = Rect(0,0,1,1)
    movable.move(1,1)
    // переменной базового класса
    val f: Figure = Rect(0,0,1,1)
    val f2: Figure = Circle(4, 4, 5)
    val f3: Figure = Squre(1, 4, 2)
    println("Площадь прямоугольника: ${f.area()}")
    println("Площадь круга: ${f2.area()}")
    println("Площадь квадрата: ${f3.area()}")
    val transforming: Transforming = Rect(1,1,2,1)
    println("После: ${transforming.rotate(direction = RotateDirection.Clockwise, 3,2)}")
    println("После увеличения в 3 раз: ${transforming.resize(3)}")
    println()
}