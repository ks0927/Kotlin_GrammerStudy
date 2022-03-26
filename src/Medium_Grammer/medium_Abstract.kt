package Medium_Grammer

fun main(){
    //추상 클래스
    // 공통적으로 기능을 구현해줘야할 때사용
    BMW().wheel()
    BMW().engine()

}

abstract class Car {
    abstract fun wheel()
    abstract fun engine()

}

class BMW() : Car() {
    override fun wheel(){
        println("BMW 굴러갑니다.")
    }
    override fun engine(){
        println("BMW 시동걸렸습니다.")
    }


}
