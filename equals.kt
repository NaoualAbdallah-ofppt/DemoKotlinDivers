data class test(var num:Int, var nom:String)
{
    // cette méthode equals sera utilisée
    //le système n'utilisera pas la méthode
    //générée par data
    override fun equals(other:Any?)
    =if ((other as test).num==this.num) true
    else false

    

}
fun main()
{
var x="AA"
var y="AA"
if (x.equals(y))
    println("x=y ok")
else
    println("x non = y ")
if (x==y)
    println("ok==")
var n1=7
var n2=7
if (n1.equals(n2))
    println("x=y ok")
else
    println("x non= y ok")
val a = test(1,"aa")
val b =test(6,"aa")

if (a.equals(b))
    println("a = b")
var c=a
if (a.equals(c))
    println("a = c")
}