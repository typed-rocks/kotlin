val any: Any = "Hello"
val whenResult = when(any) {
    in listOf("Hello", "World") -> "$any is in the list"
    is String -> "$any is a string of length: ${any.length}"
    in 1..9 -> "$any is single digit"
    else -> "Nothing found"
}
