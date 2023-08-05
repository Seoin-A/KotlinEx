// 싱클턴 패턴 : 클래스의 인스턴스가 오직 하나만 생성됨

object MyFirstObject {
    val number = 1
    fun sayHello(){
        println("Hello!")

    }
}

class Dinner {
    companion object{
        val MENU = "pasta"
        fun eatDinner(){
            println("Today's Menu is ${MENU}")
        }

    }
}