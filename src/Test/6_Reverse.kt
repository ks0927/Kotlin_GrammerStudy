package Test

// 리스트의 숫자를 뒤집어서 반환하는 solution 을 만드세요

fun main(){

    val arr1 = arrayListOf(1,2,3,4,5)
    val result1 = solution(arr1)
    println(result1)
    // [5,4,3,2,1]

    val arr2 = arrayListOf(2,4,6,8)
    val result2 = solution(arr2)
    println(result2)
    //  [8,6,4,2]

}
//내답
fun solution(arr: ArrayList<Int>) :ArrayList <String> {
    val count : Int = arr.size
    var result = arrayListOf<String>()

    for(i in 0..(count-1)){ //0,1,2... count-1
        result.add(arr[count-(i+1)].toString())  //arr꺼 뒤집어서 하나씩 add
    }
    return result
}

/*강의답
fun solution(arr: ArrayList<Int>) : ArrayList <String> {

    val length = arr.size

    //println(length)

    val resultArr = mutableListOf<String>()

    for (i in 0..length-1){ // length-1 = 4 -> 0 1 2 3 4 -> arr[0] arr[1] arr[2] arr[3] arr[4]
        // println(arr[length-1-i])
        // length-1 = 4
        // 4-0 = 4 arr[4]
        // 4-1 = 3 arr[3]
        // 4-2 = 2 arr[2]
        // 4-3 = 1 arr[1]
        // 4-4 = 0 arr[0]
        resultArr.add(arr[length-1-i].toString())
    }

    // println(resultArr)

    return resultArr as ArrayList<String>

}*/
