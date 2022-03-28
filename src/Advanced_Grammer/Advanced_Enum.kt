package Advanced_Grammer

// enum(enumerations) class
// 열거형 클래스

fun main(){
    println(Direction.NORTH)

    Direction.values().forEach {  //forEach 로 value 다 확인가능
        println(it)
    }
    val direction = Direction.EAST
    when(direction) {
        Direction.NORTH -> {
            println("N")
        }
        Direction.SOUTH -> {
            println("S")
        }
        Direction.WEST -> {
            println("W")
        }
        Direction.EAST -> {
            println("E")
        }
    }
    val color = Color.GREEN
    when(color) {
        Color.RED -> {
            println(Color.RED.colorName)
        }
        Color.GREEN -> {
            println(Color.GREEN.colorName)
        }
        Color.BLUE -> {
            println(Color.BLUE.colorName)
        }
    }

    println(Device.DEVICEON.status)
    Device.DEVICEON.status = "OFF"  // status 값을 변경할수도있다.
    println(Device.DEVICEON.status)

    val d1 = Device.DEVICEON
    println(d1.status)  //변경된거 다시 확인해봄
}
enum class Direction {
    NORTH, SOUTH, WEST, EAST
}
enum class Color(val colorName : String) {
    RED("빨강"),
    GREEN("초록"),
    BLUE("파랑")
}
enum class Device(var status : String){
    DEVICEON("ON"),
    NETWORK("OFF"),
    LOCATIOn("SEOUL")
}