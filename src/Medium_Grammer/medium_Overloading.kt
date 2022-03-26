package Medium_Grammer

fun main(){
    // 오버로딩 -> OverLoading
    // 같은 이름의 메서드를 여러개 가지면서, 매개변수의 유형과 개수가 다르도록 해서 구분함

    val c = Calculator()
    c.sumNumber(1,2)
    c.sumNumber(1,2,3)
    c.sumNumber("나는", "행복하다")
}
class Calculator(){
    fun sumNumber(a : Int, b : Int) {
        println(a+b)
    }
    fun sumNumber(a : Int, b : Int, c: Int) { //오버로딩
        println(a+b+c)
    }
    fun sumNumber(str1 : String, str2: String) { //오버로딩
        println(str1+str2)
    }
}