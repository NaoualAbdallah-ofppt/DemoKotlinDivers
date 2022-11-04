const val xx: String = "aa"

fun main()
{
val name = "Phil"
print("Hello $name")

// Output : Hello Phil

//La diffétence entre
var x:String?=null
println(x)

lateinit var y:String
y="aa"
println(y)
//Dans la première approche on a autorisé la valeur null
//mais dans la deuxième on indique que la variable sera initialisée
//plus tard

fun sayHello1() = println("Hello !")
fun sayHello2(): Unit = println("Hello !")
fun sayHello3(): Unit { println("Hello !") }
fun sayHello4() { println("Hello !") }


fun getUrlApi1() { return "bonjour" }
//error: type mismatch: inferred type is String but Unit was expected

fun getUrlApi2(): String { return "https://www.my.api.com" }

 
fun getUrlApi3() = "https://www.my.api.com"
}