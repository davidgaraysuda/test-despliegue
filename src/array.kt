fun main(){
    println(arr())
    println(testMulti(mult))
    print(testTotal(total))
    print(testArr())
}
var mult=0
var total=0

fun arr():Int{

    val num= arrayListOf<Int>(1,2,3,4,5,6,7,8,9,2)
    for((i,v) in num.withIndex()){
        if(i%2==0){
            mult+=(v*2)
        }
        if(i%2!=0){
            total+=v
        }
    }
    total+=mult
    return (total)
}

fun testMulti(multi:Int):Boolean{
        var esp=50
        return multi==esp
}

fun testTotal(valor:Int):Boolean{
    var esp=72
   return valor==esp
}

fun testArr():Boolean {
    var esp = 0
    var comp=false
    val num = arrayListOf<Int>(1, 2, 3, 4, 5, 6, 7, 8, 9, 2)
    for ((i, v) in num.withIndex()) {
        comp= v >= esp
    }
    return comp
}