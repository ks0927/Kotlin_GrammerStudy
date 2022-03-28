package Test

// 문자열의 숫자와 짝수(true)와 홀수(false)를 알려주는 solution을 만드세요

fun main(){

    val result1 = solution("abcd")
    println(result1)
    // [4, true]

    val result2 = solution("abcde")
    println(result2)
    // [5, false]
}

//내가쓴답
fun solution(str : String) : ArrayList<String> {

    val slen = str.length
    val result = arrayListOf<String>()
    result.add(slen.toString())
    if(slen%2 ==0)
        result.add("true")
    else
        result.add("false")

    return result
}
/*강의에서의 답
fun solution(str : String) : ArrayList<String> {

    // 길이 구하는 것 하나랑
    val length = str.length
    //println(length)

    // 구해진 길이가 홀수인지 짝수인지 알려주는 기능

    */
/*
    var isEven = true
    if(length % 2 == 0){
        //println("짝수")
        isEven = true
    } else {
        //println("홀수")
        isEven = false
    }
    *//*


    val isEven = length % 2 == 0

    val resultArray = arrayListOf<String>(length.toString(), isEven.toString())

    return resultArray

}*/
