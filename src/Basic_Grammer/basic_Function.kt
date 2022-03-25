package Basic_Grammer

// 함수 사용

fun main(){
    bobMaking(2)
    var sumtest =sum(30,23)

}

fun bobMaking(time : Int){
    println("$time 분 후에 밥이 완료됩니다.")
}

fun sum(num1 : Int, num2 : Int) : Int{ //return 값이 있다면 : 타입을 함수도 써줘야댐

    val result = num1 + num2
    return result
}