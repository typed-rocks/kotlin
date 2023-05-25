class Person(val firstname: String)

infix fun Person.greets(person: Person) = "${this.firstname} greets ${person.firstname}"

val person1 = Person("Christian")
val person2 = Person("Giulia")

person1 greets person2
