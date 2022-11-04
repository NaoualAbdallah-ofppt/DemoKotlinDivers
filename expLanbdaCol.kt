data class User(var email: String, var age: Int)

fun main()
{

val users = listOf(
    User("toto@gmail.com", 20),
    User("hello@gmail.com", 18),
    User("oc@gmail.com", 35))
//it mot réservé faisant réference au paramètre
// Get the older user
println(users.maxBy { it.age } )         // User("oc@gmail.com", 35)
// Get the younger user
println(users.minBy { it.age } )     // User("hello@gmail.com", 18)
// Is all users >= 20 ?
println(users.all { it.age >= 20 } )   // false
//println(users.all { User::age >= 20 })
// Is any user >= 35 ?
println(users.any { it.age > 35 })     // true
// How many user are >= 20 ?
println(users.count{it.age>= 20})      // 2
// Find the first user who is >= 20
println(users.find{ it.age >= 20 })  
  // User(email="toto@gmail.com", age=20)
println(users.map{it.age})
//il retourne une listOf User
println(users.filter { it.age >= 20 })

}

/*
val message: String? = "Hello OpenClassrooms students !"
if (message != null) println(message)
Cependant, grâce à la fonction d’ordre supérieur let , vous pourrez réaliser l’équivalent de manière beaucoup plus lisible : 

val message: String? = "Hello OpenClassrooms students !"
message?.let { print(it) }
let()  exécute le corps de la lambda SI la variable précédente est différente de nulle. 
it  correspond à l'unique paramètre de la lambda, contenant la valeur de la variable "message".

Le mot-clé it  à l’intérieur d’une lambda fait toujours référence à l’unique paramètre de celle-ci. Vous l’utiliserez très souvent pour gagner en lisibilité ! */