open class person (var address: String){

    constructor() : this("XYZW"){
        var address = this.address
    }
}



class student(var enno: Int,var name: String) : person(){

    constructor(): this(123,"ABC"){
        var enno = this.enno
        var nm = this.name
    }

    fun print(){
        println(" Enrollment no : $enno")
        println(" name : $name")
        println(" Address : $address")
    }
}
fun main()
{
    var s1= student()
    s1.print()
}