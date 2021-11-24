class Rect(var x: Int, var y: Int, var width: Int, var height:Int): Movable, Figure(0),Transforming {
    override fun move(dx: Int, dy: Int) {
        x=+dx;y=+dy
    }

    override fun area(): Float {
        return (width*height).toFloat()
    }

    override fun resize(zoom: Int): String {
         return("width:${width*zoom};height: ${height*zoom}")
    }

    override fun rotate(direction: RotateDirection, centerX: Int, centerY: Int): String {
        return when (direction){
            RotateDirection.CounterClockwise ->{ "x=${centerX - (y-centerY)}; y=${centerY + (x-centerX)}"}
            RotateDirection.Clockwise -> {"x=${centerX - (y-centerY)}; y=${centerY + (x-centerX)}"}
        }
        val perehod=width
        width=height
        height=perehod
    }
}