package Test

// 리스트에 있는 숫자들을 모두 더한 후
// 리스트의 갯수로 나눈 값을 출력하는 solution을 만드세요

fun main(){

    val arr1 = arrayListOf<String>("1", "2")
    val result1 = solution5(arr1)
    println(result1)
    // 1.5

    val arr2 = arrayListOf<String>("1", "2", "3", "4","5")
    val result2 = solution5(arr2)
    println(result2)
    // 3.0


}
//내답
fun solution5(arr: ArrayList<String>): Double {
    var count : Double =0.0
    var sum : Double = 0.0

    for(list in arr){
        val a :Int = Integer.parseInt(list)
        sum+=a
        count++
    }
    val result : Double = sum/count
    return result
}
/*강의답
fun solution(arr: ArrayList<String>): Double {

    var sum = 0
    var arrLength = arr.size  //list는 size로 하면되는구나...

    for (i in arr){
        //println(i.toInt())  //parseInt로 안해도 되는구나...
        sum += i.toInt()
    }

    // println(sum)
    // println(arrLength)
    // println(sum.toDouble() / arrLength.toDouble())
    return sum.toDouble() / arrLength.toDouble()
}*/
