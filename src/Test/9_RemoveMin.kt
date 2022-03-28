package Test

// 리스트의 가장 작은 숫자를 찾아서 제거하고
// 남은 숫자들을 모두 더해서 값을 출력해주는 함수를 만드세요

fun main(){

    val input1 = arrayListOf(1,2,3,4,5)
    val result1 = solution9(input1)
    println(result1)
    // 14

    val input2 = arrayListOf(10,8,6,4,2)
    val result2 = solution9(input2)
    println(result2)
    // 28

    val input3 = arrayListOf(6, 3, 9)
    val result3 = solution9(input3)
    println(result3)
    // 15

}

//내답
fun solution9(list: ArrayList<Int>) : Int{
    var arr1 = ArrayList<Int>(list)  //list 복사
    val min =list.minOrNull()
    arr1.remove(min)

    var result : Int = 0
    for(i in arr1){
        result+=i
    }
    return result

}

/*강의답
fun solution(list: ArrayList<Int>) : Int {

    */
/*
    val min = list.minOrNull()
    println(min)

    list.remove(min)

    println(list)

    var result = 0

    for (i in list) {
        result += i
    }
    *//*


    var smallest = list[0]

    for (i in 1..list.size-1){
        // println(list[i])
        if(smallest > list[i]){
            smallest = list[i]
        }
    }

    list.remove(smallest)

    var result = 0

    for (i in list) {
        result += i
    }

    return result
}
*/
