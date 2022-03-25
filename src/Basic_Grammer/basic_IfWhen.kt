package Basic_Grammer

fun main(){
    val studentScore4 = 10

    if(studentScore4 > 100) {        //if와 elseif else 사용
        println("100보다 큼")
    } else if(studentScore4 > 50) {
        println("50보다 큼")
    } else if(studentScore4 > 30) {
        println("30보다 큼")
    } else {
        println("30보다 작음")
    }

    val score = 70
    when(score) {          //when을 사용하여 조건문 사용 가능, 다른 언어의 switch 와 같음
        100 -> {
            println("100")
        }
        90 -> {
            println("90")
        }
        80 -> {       //80...90 또는 80 in 90 이런식으로 범위를 만들수도 있더라
            println("80")
        }
        else -> {
            print("no")
        }
    }

}