package Advanced_Grammer

// infix function  두개의 변수 가운데 오는 함수?
//infix fun dispatcher.함수이름(receiver): 리턴타입 { 구현부 }
//dispatcher는 함수전에 오는 객체 receiver는 함수 뒤에 오는 객체
//map에서는 to를 사용해서 쓰는듯함? 써보진않음

fun main(){

    println(10 sum1 20)
    println(20 sum2 30)
    println(10 multi1 10)

    println("apple" sum1 "포도")
    println("사과" sum2 "포도")
    println(10 showList 20)
}

infix fun Int.showList(num : Int) : List<Int> {  //리스트를 반환형으로 쓸수도있는데

    val list = mutableListOf<Int>()
    for (i in this..num) {    //this가 앞에 숫자고 num이 뒤에 숫자인듯함
        list.add(i)
    }
    return list

}

infix fun String.sum1(abc : String) : String = this + abc   //쓰는방식1
infix fun String.sum2(abc : String) : String {             //쓰는방식2
    return this + abc
}

infix fun Int.sum1(num : Int) : Int = this + num  //this가 앞에쓴 숫자 num이 뒤에쓴 숫자같음
infix fun Int.sum2(num : Int) : Int {          //이런식으로 return  사용해서 쓸수도 있는듯함
    return this + num
}
infix fun Int.multi1(num : Int) : Int = this * num  //곱하기도 마찬가지

