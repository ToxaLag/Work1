class Squre (var x:Int, var y:Int,var width: Int): Movable, Transforming, Figure(1){
    override fun move(dx: Int, dy: Int) {
        x=+dx;y=+dy
    }

    override fun area(): Float {
        return (width*width).toFloat()
    }

    override fun resize(zoom: Int) : String {
        return("${width*zoom}")
    }

    override fun rotate(direction: RotateDirection, centerX: Int, centerY: Int) : String {
        return when (direction){
            RotateDirection.CounterClockwise ->{ "x=${(y-centerY)+centerX}; y=${(x-centerX)+centerY}"}
            RotateDirection.Clockwise -> {"x=${(centerY-y)+centerX}; y=${(centerX-x)+centerY}"}
        }
    }
}