package Medium_Grammer

fun main(){
    //any는 모든 아이들을 포함하는 타입 , 자바object?같은느낌
    //is 는 맞나 확인
    //as는 type casting  타입 변경,체크

    var str1 : Any = "abc"
    println(str1)
    str1 = 123
    println(str1)

    var str2 : Any = 123
    if(str2 is String) { //str2가 String이면
        println("this is string")
    } else {
        println("this is not string")
    }

    var str3 : Any = 123L
    when(str3) {               //when을 사용하여 is를 쓸수도 있음
        is Int -> { println("this is int")}
        is String -> {println("this is string")}
        else -> {
            println("this is else")
        }
    }

    var str5 : String = "abc"
    var str6 : String = str5 as String  //as 사용법

    var str9 : String? = 123 as? String  //as에 ?를 붙혀서 만약 타입 변경이 안될때 null을 반환하게함
    println(str9)

}
