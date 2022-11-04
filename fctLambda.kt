//fonction lambdas
fun main()
{
    println(somme(4,6))
    println(lambda1(4))
    var S:String="Bonjour"
    println(S.lambda4(4))
   
    //println(double(4,6)) 
    //error: too many arguments for 
}

//Fonction lambdas Somme
val somme = { x:Int, y:Int -> x+y }
//Fonction lambdas Double
//val double={x->x*2}
//error: cannot infer a type for this parameter. Please specify it explicitly.
//val double={x->x*2}
val double={x:Int->x*2}


val lambda1: (Int) -> Int ={ a -> a * a}
 val lambda2: (String,String) -> String = { a , b -> a + b }
 val lambda3: (Int)-> Unit = {print(Int)}
 val lambda4: String.(Int) -> String = {this + it}
 //cette fct lambdas sera une fonction d'extension pour les
 //strings