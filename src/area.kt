fun main(){
    println("Prueba 1: "+ testMult())
    println("Prueba 2: "+ testNum())

}

fun area(base:Int, alt:Int):Int{
    if(base>0 && alt>0){
        return(base * alt)
    } else{return 0}
}

fun testMult():Boolean{
    val res=area(2, 8)
    val esp=16
    return res==esp
}

fun testNum():Boolean{
    val res=area(7, -8)
    val esp=0
    return res==esp
}