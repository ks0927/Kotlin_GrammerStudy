package Test

// 별이 아래와 같이 2배씩 늘어나며 출력되는 solution을 완성하세요

fun main(){

    solution(3)
    // *
    // **
    // ****

    solution(5)
    // *
    // **
    // ****
    // ********
    // ****************
}
//내답
fun solution(star : Int){
    var count =1

    for(i in 1..star){
        for(j in 1..count){  //이런식의 for문은 ... 답답하다...
            print("*")
        }
        println()
        count*=2        //생각하기 어려웠음;
    }
}

/*강의답
fun solution(star : Int){

    // 별을 몇개 찍을지 알려주는 count
    var count = 1

    for(i in 1..star){


        for(j in 1..count){
            print("*")
        }

        println("")

        count = count * 2

    }

}*/
