package Advanced_Grammer

// 지연초기화
// lateinit / lazy

fun main(){

    lateinit var lateString : String //미리 변수 선언

    lateString = "b"

    println(lateString)

    // 서버에서 받아온 데이터를 넣어두고 싶은데, 미리 변수를 선언해놓고
    // 나중에 서버에서 값을 받아와서 넣어줄 때 주로 사용한다.

    lateString = "변경된 스트링"       //var이라 변경가능
    println(lateString)

    val lazyString : String by lazy {          //lazy 사용  lazy는 val이라 값변경이 안됨
        println("이 친구가 만들어질 때 프린트")
        "lazyTestString"
    }
    lazyString  //만들어져서 println 나온거임
    println(lazyString)    // lazyTestString


}
