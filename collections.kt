// listOf
val listOfNames = listOf("Jake Wharton", "Joe Birch", "Robert Martin")
listOfNames[0] // => Jake Wharton
listOfNames[0] = "Mathieu Nebra" // => ERROR ! List is immutable

// mutableListOf
val listOfNames = mutableListOf("Jake Wharton", "Joe Birch", "Robert Martin")
listOfNames[0] // => Jake Wharton
listOfNames[0] = "Mathieu Nebra" // => SUCCESS !

// setOf
val setOfNames = setOf("Jake Wharton", "Joe Birch", "Robert Martin")
listOfNames.first() // => Jake Wharton
listOfNames.add("Mathieu Nebra") // => ERROR ! Set is immutable

// mutableSetOf
val setOfNames = mutableSetOf("Jake Wharton", "Joe Birch", "Robert Martin")
listOfNames.first() // => Jake Wharton
listOfNames.add("Mathieu Nebra") // => SUCCESS !