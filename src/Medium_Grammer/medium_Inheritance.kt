package Medium_Grammer

fun main(){
    //상속은 부모클래스에 open을 사용한다.
    Job3()
}
open class AllJobs() {

    init {
        println("일을 합니다.")
    }

}

class Job3() : AllJobs(){ //alljobs를 상속받음
    init {
        println("마케팅을 합니다.")
    }
}