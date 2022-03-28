package Test

// 숫자를 받아서 팩토리얼 값을 출력하는 함수를 만드세요
// 3! -> 3 x 2 x 1 = 6
// 4! -> 4 x 3 x 2 x 1 = 24
// 5! -> 5 x 4 x 3 x 2 x 1 = 120

fun main(){

    val result1 = solution7(3)
    println(result1)
    // 6

    val result2 = solution7(4)
    println(result2)
    // 24

    val result3 = solution7(5)
    println(result3)
    // 120

}

//내답
fun solution7( number : Int ) : Int {
    var result =1
    for(i in 1..number){
        result *=i
    }
    return result
}

/*강의 답
fun solution( number : Int ) : Int {

    // 3 x 2 x 1 -> 6
    // 1 x 2 x 3 -> 6

    var result = 1

    for (i in 1..number){
        //println(i)
        result *= i // result = result * i  생각한거하고 똑같네
        // i = 1 -> result -> 1 * 1 = 1
        // i = 2 -> result -> 1 * 2 = 2
        // i = 3 -> result -> 2 * 3 = 6
        // i = 4 -> result -> 6 * 4 = 24
        // i = 5 -> result -> 24 * 5 = 120
    }

    return result

}*/



