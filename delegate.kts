fun hello(): String {
    println("Called")
    return "Hi NDC"
}

val result: String by lazy {hello()}

if(true && result.length == 6) {
    println("IN THERE $result")
}
