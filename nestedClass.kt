//dans ce cas les classes sont imbriquée (nested)
//je ne peux pas accéder aux attributs de Outer
//depuis les classes internes 
class Outer {
 val bar:Int=12
    class Nested1 (var x:Int) {
    fun foo() =34
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
  val demo = Outer.Nested1(5)
  val demo2 = Outer.Nested2()
// je ne peux pas écrire  
//val demo = Outer().Nested1(5)
 //   demo.bar=3
  println(demo.foo())
  var o =Outer()
  println(o.bar)
}