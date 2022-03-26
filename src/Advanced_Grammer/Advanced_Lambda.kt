package Advanced_Grammer

// 람다(lambda)
fun main(){
    println(sum(1,2))
    println(sumNumber(1,2))
    println(sumTypeNumber(1,2))
    println(sumTypeNumberNull(1,2))

    println(sumString("1", "2"))
    println(sumStringTwo("1","2"))
    println(sumStringTypeTwo("1","2"))
}

fun sum(a : Int, b : Int) : Int { //원래는 이런식으로 만들었지만
    return a+b
}
val sumNumber = {a : Int, b : Int -> a + b}  //람다를 활용하면 이렇게 짧게 만들수있음
val sumTypeNumber : (Int, Int) -> Int = {a, b -> a+b}  //이런식으로 만들수도 있고
val sumTypeNumberNull : (Int, Int) -> Int? = {_, _ -> null}  //?를 붙혀서 null반환도 가능 근데 왜_,_ 이런식으로쓰는지?

fun sumString(a : String, b : String) : String {  //string도 이런식이였지만
    return "string1 : $a string2 : $b"
}
val sumStringTwo = {a : String, b : String -> "string1 : $a string2 : $b"} //람다를 사용하면 짧게 만들수있다
val sumStringTypeTwo : (String, String) -> String = {a,b -> "string1 : $a string2 : $b"} //이런식으로도 사용가능
