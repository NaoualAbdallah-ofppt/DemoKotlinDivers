fun main()
{
var msg: String? = "bonjour"
println(msg?.uppercase())
println(msg!!.uppercase()) 
println(msg.uppercase()) 
// Les trois affichent BONJOUR
//La différence c'est quand la valeur est nulle
var msg1: String? = null
println(msg1?.uppercase()) //va afficher null
println(msg1!!.uppercase()) //Exception in thread "main"
// java.lang.NullPointerException (NPE)
println(msg1.uppercase()) //error: only safe (?.) 
// or non-null asserted (!!.) calls are allowed 
// on a nullable receiver of type String?

}