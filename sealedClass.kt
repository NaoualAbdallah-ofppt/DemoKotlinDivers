class test(var num:Int)
{}
class aa(var a:Int,num: Int):test(num){
    fun zz()
    {
        println(a)
        println(num)
    }

}
class bb(var b:Int,num:Int):test(num){
    fun mm()
    {
        println(num)
        println(b)
    }
}
fun main()
{
val m=bb(12,10)
m.mm()
}