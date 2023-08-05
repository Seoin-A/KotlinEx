// 인터페이스
/*
* 인터페이스 특징
*
* 1. interface 키워드를 사용하여 정의한다.
* 2. 인터페이스는 상수와 추상메서드로 구성
* 3. 모든 상수는  public static final 타입
* 4. 모든 추상 메서드는 abstract public 타입
* 5. 인스턴스를 생성할 수 없음
* 6. 레퍼런스 변수의 인터페이스 타입으로 사용 가능
* 7. 다른 인터페이스를 extends 키워드로 상속받을 수 있으며, 다중 상속 가능
* 8. 인터페이스의 구현은 implements 키워드를 사용
*
*
*
* */



interface Vehicle  {
    fun drive()
    fun stop()

    fun destroy() = println("Vehicle is destroyed")  // default fun
    // fun destroy(){ println("Vegicle is destroyed)
}

interface Color{
    fun showMeColor()
}

class Car1 : Vehicle{
    override fun drive() {
        println("Car is moving")
    }

    override fun stop() {
        println("Car is stopping")
    }

    override fun destroy() {
        super.destroy()
        println("The vehicle is car")
    }
}

class Bike : Vehicle,Color {
    override fun drive() {
        println("Bike is moving")
    }

    override fun stop() {
        println("Bike is stopping")
    }

    override fun showMeColor() {
        TODO("Not yet implemented")
    }
}
