fun hello(name: String?): String? {
    if(name == null) {
        return null
    } 
    return "Hello $name"
}

class Person(val firstname: String, val address: Address?)
class Address(val street: String?)

// wrong
fun getStreetWrong(person: Person?): String? {
    if(person != null && person.address != null) {
        return person.address.street
    }
    return null
}

// correct
fun getStreet(person: Person?): String? = person?.address?.street
val street: String = getStreet(null) ?: "A string"
