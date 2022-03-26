package Medium_Grammer

fun main(){
    //엘비스 연산자( ?: )왼쪽 객체가 non-null이면 그 객체의 값이 리턴 null이라면 오른쪽값 리턴
    //null 의 처리를 위한 연산자

    println(findStringLength1(null))
    println(findStringLength2(null))
}

fun findStringLength1(str : String?) : Int {  //이런식으로 할수도 있겠지만...
    var resultcount = 0
    if(str != null){
        resultcount = str.length
    }
    return resultcount
}
fun findStringLength2(str : String?) : Int {
    return str?.length ?: 0  // 이처럼 ?: 엘비스 연산자를 사용하여 :? 왼쪽값이 null이 아니면 그대로 return , null이면 오른쪽 값 return
}