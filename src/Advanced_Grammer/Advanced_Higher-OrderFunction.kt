package Advanced_Grammer

// 고차함수 (Higher-Order Function)
// f(f(x)) = x  수학에서 이모습과 닮았음

fun main(){

    sum(1,2, { a : Int, b : Int -> a + b})
    sum(1,2) { a : Int, b : Int -> a + b}
    sum(1,2, ::testSum)

    printTest("abc")
    highPrintTest(::printTest)  //::이건 참조? 한다는 뜻인데 정확하겐 잘...

    test1()
    test2()
    test3()
}
fun testSum(a : Int, b : Int) : Int {
    return a+b
}
val testLambdaSum = {a : Int, b : Int -> a+b} //람다
fun sum(a : Int, b : Int, operation : (Int, Int) -> Int) { //고차함수
    println("$a $b")
    println(operation(a,b))
}

fun printTest(aaasdasd : String) { //원래 함수
    println(aaasdasd)
}
fun highPrintTest(abc : (String) -> Unit) { //이게 고차함수
    abc("bbb")
}

fun test1() : Unit {  //Unit은 아무것도 반환하지 않는다 void 같은 느낌
    println("abc")
}
fun test2() : Unit {
    println("abc2")
    return                //이런식으로 써도되고
}
fun test3() : Unit {
    println("abc3")
    return Unit      // 이런식으로 써도 된다
}
