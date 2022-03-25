package Basic_Grammer
fun main(){
    val testList1 = ArrayList<String>() //arraylist를 활용한 list 생성
    testList1.add("a")
    testList1.add("b")
    testList1.add("c")

    val testList2 = listOf("a", "b","c")  //listof를 사용한 list 생성 . 단 이건 읽기모드라 수정이 불가능함
    println(testList2)

    val testList3 = mutableListOf("a","b","c")  //mutablelistof를 사용한 list 생성. listof와 다르게 수정이 가능함
    println(testList3)
    testList3.add("d")
    println(testList3)

    val testList4 = listOf("student1","student2","student3","student4", "teacher1", "student5")
    println(testList4)
    println(testList4.filter { it.startsWith("s")})  //filter를 사용하여 필터링하는데 startsWith를 사용해서 s로 시작하는 거만 필터링해서 가져옴

    val testList5 = listOf("student1","student2","student3","student4", "teacher1", "student5", null)
    println(testList5)
    //println(testList5.filter { it.startsWith("s")})  null이 있기때문에 불가능함
    println(testList5.filterNotNull().filter { it.startsWith("s")}) //null이 없게 필터링후 startsWith로 s로시작하는거 필터링해서 가져옴

    var test3 : String = "c"
    var test4 : String? = "d"  //?때문에 null이있을수도있음

    test3 = test4!! //null이 있을수도 있으면 오류가 나지만 !!를 붙혀서 null이 없음을 표시함
    println(test3)

    val testList6 = listOf("a", "b", "c", "d", "e","f")
    for (abc in testList6) { //약간 파이썬과 같은 for 사용
        println(abc)
    }

    for (i in 1..10 step 3){ //1..10 이런식으로 1~10을 표현 가능하고 step을 통해 건너뛸 크기 정할 수있음
       println(i)
       }

    for (i in 1..3){
       println("i의 값은 : $i")} //$를 사용해서 편리하게 print가능 c에서의 %와 닮은듯
    //구구단 출력해보기
    for (i in 2..9){
        for (j in 1..9){
            val result = i * j
            println("$i * $j : $result")
        }
    }
}
