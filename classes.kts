class Person(val firstname: String) {
    companion object {
        fun imStatic() {
            println("I'm static")
        }
    }
    
    var shoutedName: String = firstname
        get() {
            println("Get called with field: $field")
            return field.uppercase()
        }
        set(value) {
            println("Set called $field -> $value")
            field = value
        }
}
Person.imStatic()
// final class by default => no inheritance. Would have to use "open class Person"
//class Teacher(firstname: String): Person(firstname)

data class PersonDataClss(val firstname: String)

val person1 = Person("Christian")
val person2 = Person("Christian")

// Get Called with field Christian
person1.shoutedName
// Set called Christian -> Test
person1.shoutedName = "Test"

// .equals check => false
person1 == person2

val dataPerson1 = PersonDataClss("Christian")
val dataPerson2 = PersonDataClss("Christian")

// => true
dataPerson1 == dataPerson2 
