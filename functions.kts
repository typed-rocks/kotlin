fun hello(name: String) = "Hello $name"

fun createBox(width: Int, height: Int = width, x: Int = 0, y: Int = 0) = "A box with width: $width and height: $height $x/$y"

createBox(width= 150, height = 100, x = 0, y = 0)
createBox(width= 150, height = 100)
createBox(width= 150)
