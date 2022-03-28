// 문자의 갯수를 세는 solution을 만들어주세요
// 문자열이 많이 나온 순서대로 정렬됩니다.
// 문자열 갯수가 같은 경우는 없다고 가정합니다. (a 는 5개 b 는 5개 이런 경우는 없습니다.)

fun main(){

    val result1 = solution8("aabbaabccbb")
    println(result1)
    // {b=5, a=4, c=2}

    val result2 = solution8("ccddcddaaq")
    println(result2)
    // {d=4, c=3, a=2, q=1}

}

//내답
fun solution8( str : String ): Map<String, Int> {
    var resultmap = mutableMapOf<String,Int>()

    for(i in str) {
        if (!resultmap.containsKey(i.toString())) {  //만약 string에서 가져온값이 없으면 맵에 추가한뒤 value를 1로설정
            resultmap.put(i.toString(), 1)
        }
        else{         //만약 string에서 가져온값이 있으면 value값을 +1해줌
            resultmap.replace(i.toString(),resultmap.getValue(i.toString())+1)
        }

    }
    return resultmap.toList().sortedWith(compareByDescending { it.second }).toMap()
    //놀랍게도 map은 key정렬만있고 value정렬이 없다!! 그래서 list에서 value내림차순정렬을하고 맵으로 다시변경해줘야함
}
/*강의답
fun solution( str : String ): Map<String, Int> {

    // 일단은 문자열에 어떤 알파벳이 있는지 찾기

    val resultArr = mutableListOf<String>()

    for(i in str) {
        resultArr.add(i.toString())
    }

    //println(resultArr)
    //println(resultArr.distinct())

    val distinctList = resultArr.distinct()
    val countList =  mutableListOf<Int>()
    // 어떤 알파벳이 몇번 사용되었는지 세기


    for (i in distinctList){ // a b c
        val count = resultArr.filter { it == i}.count()
        // println(count)
        countList.add(count)
    }


    // 알파벳이 많이 나온 순서대로 정렬

    val resultMap = mutableMapOf<String, Int>()

    for (i in 0..distinctList.count() - 1){
        //println(distinctList[i])
        //println(countList[i])
        resultMap[distinctList[i]] = countList[i]
    }

    // println(resultMap.toList().sortedBy {it.second}.reversed().toMap() )

    return resultMap.toList().sortedBy {it.second}.reversed().toMap()

}
*/





