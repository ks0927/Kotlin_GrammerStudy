package Basic_Grammer

fun main(){
    val a = "남자"
    val b = 10

    //And
    if(a == "남자" && b >= 20) {  //&& and연산자
        println("AND 만족")
    } else {
        println("AND 불만족")
    }

    val c = "남자"
    val d = 30

    // OR
    if(c == "여자" || d >= 30) {  // || or연산자
        println("OR 만족")
    } else {
        println("OR 불만족")
    }
//and or 연습
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
    student[1] = "크로커다일"

    // 학생들 중에, 점수가 50점 이상이고 and 학생의 이름길이가 3이상인 친구들만 프린트해라
    for (i in student){
        if(i.key >= 50 && i.value.length > 2){
            println(i.value)
        }
    }
}