package Basic_Grammer

fun main(){
    val test  = 1234
    println(test)

    val test2 : Int = 1234 // : type 으로 타입 설정 가능
    println(test2)

    val test3 : Long = 1234123412341234 // long 타입
    println(test3)

    val test4 : Float = 1234.1234f  //float타입
    println(test4)
    println(test4::class.java.simpleName) //이걸로 타입 확인 가능

    val test5 = null //null도 존재
    println(test5)  //단 null은 ""과는 다름

    val test6 = test2.toString() //int를 string으로 변환
    println(test6::class.java.simpleName)//string 확인

    val test7 = Integer.parseInt(test6) //string을 int로 변환
    println(test7::class.java.simpleName)//int 확인

    val test8 : String? = null //?를 붙히면 null일수도 있다고 알려주는거임
    println(test8)
}