package Test
// 여러 이메일이 담긴 리스트가 있어요!
// 저는 구글로 가입한 사람과 네이버로 가입한 사람의 숫자와
// 그 외의 기메일로 가입한 사람의 숫자를 보고 싶습니다.
// @와 .을 기준으로 어느 사이트에서 들어온 사람들인지 구분을 합니다.
// 아래와 같은 함수를 만들어보세요.

fun main(){

    val emailList1 = arrayListOf<String>("jay@naver.com",
        "john@naver.com",
        "emily@google.com",
        "ken@google.com",
        "minjun@kakao.com")
    val result1 = solution(emailList1)
    println(result1)
    // 결과값 = {naver=2, google=2, else=1}

    val emailList2 = arrayListOf<String>("Aiden@naver.com",
        "Andew@naver.com",
        "Adrian@daum.com",
        "Asher@google.com",
        "Austin@kakao.com",
        "Antonio@google.com")
    val result2 = solution(emailList2)
    println(result2)
    // 결과값 = {naver=2, google=2, else=2}

}
//내가 쓴답
fun solution(emailList: ArrayList<String>) : Map<String, Int> {
    var navercount : Int =0
    var googlecount : Int =0
    var elsecount : Int =0

    for(email in emailList){
        val cutting = email.split("@")[1].split(".")[0]
        if(cutting =="naver")
            navercount++
        else if(cutting=="google")
            googlecount++
        else
            elsecount++
    }
    val result= mutableMapOf<String,Int>()

    result.put("naver",navercount)
    result.put("google",googlecount)
    result.put("else",elsecount)

    return result
}
/* 강의 답
fun solution(emailList: ArrayList<String>) : Map<String, Int> {

    var naverCount = 0
    var googleCount = 0
    var elseCount = 0

    for(email in emailList){
        val domain = email.split("@")[1]
        val emailItem = domain.split(".")[0]
        //println(emailItem)

        if(emailItem == "naver") {
            naverCount += 1 // naverCount++ , naverCount = naverCount + 1
        } else if(emailItem == "google"){
            googleCount += 1
        } else {
            elseCount += 1
        }

    }

    println(naverCount)
    println(googleCount)
    println(elseCount)

    val resultMap = mutableMapOf<String, Int>()

    resultMap["naver"] = naverCount
    resultMap["google"] = googleCount
    resultMap["else"] = elseCount

    return resultMap

 */