import kotlin.reflect.typeOf

fun main(){
    println("testDig"+ " "+testDig())
    //println(sumDig(cedula))
    println("testSumDig"+ " "+testSumDig())
    println("testValidDig"+ " "+testValidDig())
}

val cedula= arrayListOf<Int>(0,1,0,6,1,4,0,0,4)
var sum=0
fun sumDig(cedula:ArrayList<Int>):Int{
    for((i,v) in cedula.withIndex()){
        if(i%2==0){
            sum+=multiplicar(v,2)
        }
        if(i%2!=0){
           sum+=multiplicar(v,1)
        }
    }
    return (sum)
}

fun multiplicar(dig:Int, cof:Int):Int{
    var res=0
    if((dig*cof)>9){
        res+=(dig*cof)-9
    }
    if(dig*cof<9){
        res+=(dig*cof)
    }
    return res
}

fun validDig(ult:Int):Boolean{
    var newUlt=0
    if((sum%10)>0){
        newUlt=10-(sum%10)
    }
    return newUlt
}

fun testDig():Boolean{
    val esp=5
    return multiplicar(7,2)==esp
}

fun testSumDig():Boolean{
    val esp=21
    return sumDig(cedula)==esp
}

fun testValidDig():Boolean{
    val esp=9
    return validDig(21)==esp
}


