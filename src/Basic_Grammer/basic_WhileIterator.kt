package Basic_Grammer

fun main(){
    var count = 0
    while (count < 30) { //while문
    println(count)
    count++ //count = count + 1
    }

    val testList2 = mutableListOf("a","b","c")
    val testIterator = testList2.listIterator()  //iterator 선언

    println(testIterator.next())  //next로 다음꺼를 가지고 옴
    println(testIterator.next())
    println(testIterator.hasNext())  //hasnext 다음꺼가 있니? true false반환
    println(testIterator.next())
    println(testIterator.hasNext())
    println(testIterator.previous()) //이전꺼로 돌아감
    println(testIterator.previous())
    println(testIterator.previous())

    while(testIterator.hasNext()){ //만약 다음꺼가 있다면 계속 돌음
        println(testIterator.next())
    }

}