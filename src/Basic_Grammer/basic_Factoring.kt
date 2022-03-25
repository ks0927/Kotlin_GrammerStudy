package Basic_Grammer

//문자열 가공
fun main(){
    val testString = "동해물과 백두산이 마르고 닳도록"

    val replaceValue = testString.replace("백두산", "한라산") //replace로 교체

    println(replaceValue)

    val a = testString[1]
    val b = testString[2]
    println(a.toString() +b.toString())// 이거 불편하지? 그래서 substring 사용해보자

    val splitString = testString.substring(0, testString.length-1) // substring으로 문자열 자르기
    println(splitString)

    val newTestString = testString.split(" ") //split으로 쪼개기
    println(newTestString)
    println(newTestString[0])
    println(newTestString[1])

    //문자열 쪼개기 연습

    val testList = ArrayList<String>()
    testList.add("abc1@naver.com")
    testList.add("abc2@google.com")
    testList.add("abc3@daum.com")
    testList.add("abc4@kakao.com")
    testList.add("abc5@naver.com")
    testList.add("abc6@kakao.com")
    testList.add("abc7@naver.com")

    // 저는 저기 이메일이 @다음에 naver라고 적힌 이메일의 갯수를 찾고 싶다.
    // 2가지 방법이 존재함

    // 첫번째 방법으로는 naver라는 텍스트가 포함되었는지 찾기 하지만 문제가 있는데
    // 첫번쨰 방법의 문제는 -> naver@google.com 같은 예외 상황 존재

    // 두번째 방법으로는 @뒤에 naver라고 텍스트가 있고 그 다음에 .이 이어진 이메일이 몇개인지 찾기
    // ******@naver.   이 방식을 사용해 볼것

    val emailList = ArrayList<String>()

    for (item in testList) {
        println(item.split("@")[1].split(".")[0])  //split으로 @뒤에꺼를 [1]로 가져온뒤 .앞에꺼를 split해서 가져온다
        emailList.add(item.split("@")[1].split(".")[0])  //리스트에 저장해놓고
    }
    println(emailList)

    var count = 0
    for (item in emailList) {  //저장한 list에서
        if(item == "naver") {  //naver인거 찾기
            count++
        }
    }
    println(count)
}