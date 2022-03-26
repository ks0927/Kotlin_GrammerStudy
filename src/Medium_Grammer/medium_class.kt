package Medium_Grammer

fun main(){
    //함수가 기능이라면
    //class 는 설계 + 기능

    val dog = Dog("파트라슈 친구", 10)
    println(dog.getMyDogInfo())
    initTest()

    InitialValue("개복치", 30)
    InitialValue("박보검") //age가 없지만 초기값 20이 미리설정되어있어서 20이라 나올것
}
class Dog(name : String, age : Int){

    val dogName = name
    val dogAge = age

    fun getMyDogInfo() : String {
        return "$dogName : $dogAge"
    }
}

class initTest(){

    init {    //init은 매개변수가 없고 반환되는값이 없는 함수, 생성자를 통해 인스턴스가 만들어질때 호출되는 함수
        println("여기에서 뭔가 해주고싶음")
    }

    fun testInitFun(){
        println("testInitFun")
    }
}
class InitialValue(name : String, age : Int = 20) { //age:Int =20 으로 초기값을 미리 설정해줄수있음

    init {
        println(name)
        println(age)
    }

}
