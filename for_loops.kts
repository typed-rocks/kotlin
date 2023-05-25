for(i in 0..10) {
    println(i)
}

for(i in 0 until 10) {
    println(i)
}

for(i in 0 until 10 step 2) {
    println(i)
}

for(i in 10 downTo 0 step 2) {
    println(i)
}

val list = listOf("Hello", "World")

for(value in list) {
    println(value)
}

for((i, value) in list.withIndex()) {
    println("$i : $value")
}
