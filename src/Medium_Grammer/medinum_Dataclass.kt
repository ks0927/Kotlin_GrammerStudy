package Medium_Grammer
fun main(){
    //data class
    // 데이터를 넣어 놓는 클래스, 서버에서 데이터 받은걸 넣어놓을때 많이씀

    val justDog = JustDog("파트라슈", 21)  //그냥 class쓸때
    println(justDog.name)
    println(justDog.age)
    println(justDog.toString())  //참조값이 나옴

    val dataDog = DataDog("파트라슈 친구", 15) //data class쓸때
    println(dataDog.name)
    println(dataDog.age)
    println(dataDog.toString()) //data값이 나옴

    val dataDog2 = dataDog.copy(name = "파트라슈 여자친구")  //copy를 이용하여 data class를 더 편하게 쓸수도 있음
    println(dataDog2.toString())
}

class JustDog(var name : String, var age : Int)
data class DataDog(var name : String, var age : Int)
