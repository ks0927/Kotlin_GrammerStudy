package Medium_Grammer

fun main(){
    //list 가공

    val testList1 = mutableListOf<Int>()
    testList1.add(1)
    testList1.add(2)
    testList1.add(3)
    testList1.add(4)
    testList1.add(10)
    testList1.add(10)
    testList1.add(11)
    testList1.add(11)

    println(testList1.distinct())   //distinct 중복제거
    println(testList1.maxOrNull())   //max값 가져오기 비어있으면 null반환
    println(testList1.minOrNull())   //min값 가져오기 비어있으면 null반환

    val testList2 = listOf("john", "jay", "minsu", "minji", "bokchi")
    val result1 = testList2.filter {  //필터링하는 법
        it.startsWith("m")     //m으로 시작하는 string 가져오기
    }
    println(result1)

    val testList3 = listOf(1,2,3,4,5,6)
    val result2 = testList3.filter {
        it % 2 == 0                 //2로 나누어지는 수 구하기(짝수)
    }
    println(result2)

    val testList4 = listOf("a", "aa", "aaa", "aaaa")
    val result3 = testList4.groupBy {    //groupBy 그룹화시킨 결과값을 LinkedHashMap 형태로 반환
        it.length > 2                    //길이가 2이상
    }
    println(result3) //길이가 2이상일때 true 아닐때 false
    println(result3[true])    //true값만 보기


}
