//en déclarant la classe inner je peux utiliser
//les attributs de la classe externe à 
//l'intérieur des classes internes
//mais l'appel change
class Outer {
    var bar:Int=12
       inner class Nested1 (var x:Int) {
       fun foo() =bar
       }
   
       class Nested2 {
           fun foo() = 2
           }
       class Nested3 {
               fun foo() = 3
               }
       }
   fun main()
   {
    // je ne peux pas écrire  
    //val demo = Outer.Nested1(5)
     val demo = Outer().Nested1(5)
   // demo.bar=3 //non  autorisé avec 
   //une classe interne

   //println(demo.bar) //non autorisé
     println(demo.foo())
     println(demo.x)
     var o =Outer()
     o.bar=17
     println(o.bar)
   }