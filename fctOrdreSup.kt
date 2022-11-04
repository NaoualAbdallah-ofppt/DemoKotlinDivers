/* Une fonction d'ordre supérieur (higher order ) est une fonction qui
 prend des fonctions comme paramètres, ou qui renvoie 
 une fonction*/
val difference = { x: Int, y: Int ->
     if (x>y) {x - y} else {y-x}}
val somme = { x: Int ,y:Int-> x + y }
val produit = { x: Int, y: Int -> x / y }
fun operation(n1:Int,n2:Int,
op:(Int,Int)->Int)
=op(n1,n2)

fun main()
{


println(operation(2, 5, difference) )
println(operation(5, 2,produit ))
println(operation(10, 2, { x: Int ,y:Int-> x + y } ))
}