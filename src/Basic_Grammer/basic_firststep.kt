package Basic_Grammer
//코틀린은 fun으로 시작하는듯함?
fun main(){
    println("hello world") //system.out.println이 앞에가 짧아지고 세미콜론도 없다!

    val asdf = "test box1" //val은 변수를 담는 박스인데 final인듯함 변경 불가
    println(asdf)

    var box2 = "test box2" //var도 변수를 담는 박스인데 변경이 가능함
    println(box2)
    box2 = "test change"
    println(box2)

}