package Medium_Grammer

fun main(){
    // 오버라이딩
    // 부모클래스의 메스드를 자식클래스에서 재정의해서 사용할수있다
    //override 과 open 사용

    Child().doing()
    Child().disease()
}
open class Parents() {

    fun doing() {
        println("자식을 돌봅니다.")
    }
    open fun disease() { //오버라이딩할 함수를 open
        println("비염이 있습니다.")
    }

}

class Child() : Parents(){ //parents로부터 상속받음

    override fun disease(){ //override 쓴뒤 재정의
        //super.disease()  //이건 그대로 쓰는거지
        println("겁이 많습니다.")
    }


}
