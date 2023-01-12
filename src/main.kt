fun main(){
    println("Prueba 1: "+ testSum())
    println("Prueba 2: "+ testSumN())
}

fun sum(num1:Int, num2:Int):Int{
    if(num1>=0 && num2 >=0){
        return (num1+num2)
    } else {
        return 0
    }
}

fun testSum():Boolean{
    val respuesta=sum(2,2)
    val esp=4
    return (respuesta==esp)
}

fun testSumN():Boolean{
    val respuesta=sum(2,-2)
    val esp=0
    return (respuesta==esp)
}