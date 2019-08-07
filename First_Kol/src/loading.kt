class StudentClass(name: String, mark:Int)
{
    var name = name
    var mark = mark
    /* infix function marry(b:StudentClass) : StudentClass
    {
    var baby = StudentClass("",0)\
    baby.name = this.name + b.name
    baby.mark = this.mark + b.mark
    return baby
     */
    operator fun plus(b:StudentClass): StudentClass
    {
        var baby = StudentClass("",0)
        baby.name = this.name + b.name
        baby.mark = this.mark + b.mark
        return baby
    }
}
fun main(a:Array<String>)
{
    var a= 10
    var b = 20
    var c: Int = a+b
    var arun = StudentClass("Arun", 30)
    var neath = StudentClass("Neath",99)
    var baby:StudentClass= arun+neath//aru.plus(neath)
    //arun merry neath => arun.marry(neath)
    println(baby)
}