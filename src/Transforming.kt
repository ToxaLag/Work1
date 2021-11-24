interface Transforming {
    fun resize(zoom: Int): String
    fun rotate(direction: RotateDirection, centerX: Int, centerY: Int) : String
}

enum class RotateDirection {
    Clockwise, CounterClockwise  //разворот на 90 градусов
}
