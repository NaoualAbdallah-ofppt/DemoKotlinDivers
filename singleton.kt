data class User (var nom:String, var age:Int)
//Singleton = permet de limiter l’instanciation
// d’une classe à un seul objet
object uu
{
    fun aa():String=User("sabir",40).nom+"XXXX"
    fun bb():Int=User("sabir",40).age +10
}
fun main()
{
    println(uu.aa())
}
