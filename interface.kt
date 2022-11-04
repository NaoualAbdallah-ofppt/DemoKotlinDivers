interface MyInterface1{
    var propriete1:String
    fun methode0()
    fun methode1()
    //il est possible d'avoir une méthode implémentée
    fun methode2(){
    println("Méthode 2")
    }
}
//Une classe qui implémente l'interface
class xx : MyInterface1
{
    override var propriete1:String="AA"
    get() = "**" +field+"**"
    set(value) {field=value}
     //xx ne va implémenter methode2
    //elle peut l'utiliser sans l'implémenter
    //mais elle doit implémenter methode0 et methode1
override fun methode0(){println("mm0")}
override fun methode1(){println("mm1")}
}
//Une interface qui implémente une autre
interface MyInterface2:MyInterface1{
    fun methode3()


}
class yy:MyInterface2
{
    override var propriete1:String="BB"
   
override fun methode0(){println("mm0")}
override fun methode1(){println("mm1")}

    override fun methode3(){println("mm3")}

}
fun main()
{
    val A=xx()
    A.propriete1="rrrr"
    println(A.propriete1)
}