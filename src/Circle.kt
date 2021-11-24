import kotlin.math.PI

class Circle(var x:Int, var y:Int, var radius:Int): Movable,Transforming,Figure(2) {
    override fun move(dx: Int, dy: Int) {
        x=+dx;y=+dy
    }

    override fun area(): Float {
        return (PI*radius*radius).toFloat()
    }

    override fun resize(zoom: Int): String {
        return("${radius*zoom}")
    }

    override fun rotate(direction: RotateDirection, centerX: Int, centerY: Int) : String {
        return when (direction){
            RotateDirection.CounterClockwise ->{ "x=${(y-centerY)+centerX}; y=${(x-centerX)+centerY}"}
            RotateDirection.Clockwise -> {"x=${(centerY-y)+centerX}; y=${(centerX-x)+centerY}"}
        }
    }
}