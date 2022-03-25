package Basic_Grammer

fun main(){
    val testList1 = listOf("a", "b", "c")
    println(testList1)
    println(testList1[0])


    val testList2 = mutableListOf("a", "b","c")
    println(testList2)
    testList2.add("d") //추가 add
    println(testList2)
    testList2.remove("a")  //삭제 remove
    println(testList2)
//map이 없을때 list 사용방법
    val mutableList1 = mutableListOf<Int>()
    mutableList1.add(5)
    mutableList1.add(10)
    mutableList1.add(15)
    mutableList1.add(22)

    val mutableList2 = mutableListOf<String>()
    mutableList2.add("유리")
    mutableList2.add("철수")
    mutableList2.add("짱구")
    mutableList2.add("훈이")

    val findIndex = mutableList1.indexOf(10)  //indexof로 key값 가져옴
    println(findIndex)
    println(mutableList2[findIndex])  //굉장히 불편한 모습

    val testMap1 = mutableMapOf<Int, String>() //map key와 value로 이루어짐 파이썬의 딕셔너리 비슷?
    testMap1.put(5, "유리") //map은 put으로 추가함
    testMap1.put(10, "철수")
    testMap1.put(15, "짱구")
    testMap1.put(22, "훈이")
    println(testMap1)
    println(testMap1[15])

    val testSet1 = mutableSetOf("a", "b", "c") //set은 중복을 허용하지 않음
    println(testSet1)

    testSet1.add("d")
    testSet1.add("e")

    println(testSet1)

    testSet1.add("e")  //중복을 허용하지 않기때문에 여러개 추가해도 안뜸
    testSet1.add("e")
    testSet1.add("e")
    testSet1.add("e")

    println(testSet1)

    testSet1.remove("e") //remove로 삭제

    println(testSet1)
 // map 문제 풀어보기
    val student = mutableMapOf<Int, String>()
    student[99] = "민지"
    student[20] = "철수"
    student[35] = "민수"
    student[48] = "가영"
    student[100] = "하영"
    student[22] = "수진"
    student[45] = "수달"
    student[88] = "캥거루"
    student[91] = "코알라"
    student[87] = "악어"
    student[54] = "코끼리"
    student[42] = "하마"


    // 점수가 50점 이상인 사람들의 이름만 반복문과 조건문을 통해서 출력하세요~ :)
    // 민지, 하영, 캥거루, 코알라, 악어, 코끼리

    val testList = ArrayList<String>()

    for (i in student){
        if(i.key >= 50){
            println(i.value)
            testList.add(i.value)
        }
    }

    println(testList)
}