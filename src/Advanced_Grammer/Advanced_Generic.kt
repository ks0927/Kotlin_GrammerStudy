package Advanced_Grammer

// 제네릭(generic)
// 컴파일시에 타입 체크를 할 수 있다 -> 컴파일
// 타입캐스팅이 필요없다.

fun main(){
    val box3 = Box3(10)
    println(box3.value)
    println(box3.value::class.java.simpleName)  //int

    val box4 = Box3("10")
    println(box4.value)
    println(box4.value::class.java.simpleName) //string

    testFun2("a")
    testFun2(123)
}
class Box3<T>(test : T) {  //제네릭을 사용한 여러타입 받기 - 클래스일때?
    var value = test
}
fun <T> testFun2(a : T) { //제네릭을 사용한 여러 타입 받기 -함수일때?
    println(a)
}