// Hi NDC
val name = if(true) {
    "Hi NDC"
} else {
    "Nothing"
}

// "Hello again
val noException = try {
    "Hello again"
} catch (ex: Exception) {
    "Catched"
}

// "Catched
val catched = try {
    "Hello again"
    throw Exception("Panic")
} catch (ex: Exception) {
    "Catched"
}
