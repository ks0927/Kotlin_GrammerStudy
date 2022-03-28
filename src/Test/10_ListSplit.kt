package Test

import java.util.*

// 가장 가까운 사람의 이름을 알려주는 함수를 완성하세요
// 거리는 음수가 아닙니다 / 같은 거리는 없습니다.

fun main(){

    val result1 = solution10("민수 : 3, 민지  : 4, 찬혁 : 1.5, 지우 : 2")
    println(result1)
    // 찬혁

    val result2 = solution10("지영 : 3.7, 민영  : 1.2 , 해피 : 2.7, 퍼니 : 3")
    println(result2)
    // 민영

}
//내답
fun solution10(str: String) : String{
    var a = str.split(",")
    var map1 = mutableMapOf<String,Double>()

    for(i in a){
        var name = i.split(": ")[0].trim() //trim으로 공백문자 다듬어주자
        var distance = i.split(": ")[1]
        map1.put(name,distance.toDouble())
    }
    var min =map1.filter { it.value== map1.minOf { it.value }} //value값 가장 작은거 가져옴

    return min.keys.toString()  //나 왜 []가 같이 나오냐...
}
/*강의 답
fun solution(str: String) : String {

    val list = str.split(",")
    //println(list)

    val nameList = mutableListOf<String>()
    val distanceList = mutableListOf<Double>()

    for (item in list) {

        val name = item.split(":")[0]
        val distance = item.split(":")[1].toDouble()

        nameList.add(name)
        distanceList.add(distance)

    }

    //println(nameList)
    //println(distanceList)

    val minDistance = distanceList.minOrNull()

    //println(minDistance)

    val resultIndex = distanceList.indexOf(minDistance)

    //println(resultIndex)



    return nameList[resultIndex].trim()
}*/
