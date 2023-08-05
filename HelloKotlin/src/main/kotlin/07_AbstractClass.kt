// 추상 클래스

abstract class Game {
    fun startGame(){
        println("Start Game")
    }// 일반 메서드

    abstract fun printGameName() // 추상 클래스

}

class Overwatch : Game() {
    override fun printGameName(){
        println("This is Overwatch")
    }
}

