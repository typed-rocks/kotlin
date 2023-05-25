fun isStringLength5Fn(str: String) = str.length == 5

val isStringLength5Lambda = { str: String -> str.length == 5 }
val isStringLength5Lambda2: (String) -> Boolean = { it.length == 5 }

val list = listOf("Hello", "World", "NDC Oslo")

// possible ways:
list.filter({ element -> isStringLength5Fn(element) })
list.filter() { element -> isStringLength5Fn(element) }
list.filter { element -> isStringLength5Fn(element) }
list.filter{ isStringLength5Fn(it)}

val final = list.filter(isStringLength5Lambda)
