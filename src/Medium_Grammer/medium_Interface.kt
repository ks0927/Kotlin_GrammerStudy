package Medium_Grammer

fun main(){
    //인터페이스
    BMW2().autoParking()
}
abstract class Car1 {
    abstract fun wheel()
    abstract fun engine()
}
interface CarAutoDriving {
    fun autoDriving()
}
interface CarAutoParking{
    fun autoParking()
}

class  BMW2() : Car1(), CarAutoDriving, CarAutoParking { //상속하고 implements가 여기선 그냥 같이 쓰이나봐
    override fun wheel(){
        println("BMW 굴러감")
    }
    override fun engine(){
        println("BMW 엔진시동")
    }
    override fun autoDriving(){
        println("BMW 자율 주행")
    }
    override fun autoParking(){
        println("BMW 자동주차")
    }
}

class Benz() : Car1(), CarAutoParking{

    override fun wheel(){
        println("Benz 굴러감")
    }
    override fun engine(){
        println("Benz 엔진시동")
    }
    override fun autoParking(){
        println("BENZ 자동 주차")
    }

}