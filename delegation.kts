fun expensiveHelloCall(): String {
    println("Hello called")
    return "Hello"
}

// call only happens if the if-statement reaches the result.length
val result: String by lazy {expensiveHelloCall()}
// expensiveHelloCall() only called if the first part of the if-case is true
if(true && result.length == 5) {
    println("Result is used in here too: $result")
}
