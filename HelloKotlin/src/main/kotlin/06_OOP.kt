/*
*   OOP 객체 지향 프로그래밍
* 1. 추상화 : 공통성과 본질을 모아 추출
* 2. 상속 : 기존의 클래스를 재활용
* 3. 다형성 : 여러 객체의 속성이나 기능이 상황에 따라 여러 가지 형태를 가질 수 있는 성질
* 4. 캡슐화 : 서로 연관있는 것들을 묶어서 외부로부터 보호
* */


class Car(val color : String , val name : String, val age : Int ){
    init {
        println("Color : $color Name : $name , Age : $age")
    }

    constructor(color: String, name : String) : this(color,name,12){
        println("Secondary constructor is called!")

        
    }
}

open class Contry(val fullName : String, val capital: String, val language : String)
{
    fun printFullName(){
        println("${fullName} Full name : $fullName")
    }
    fun printcapital(){
        println("Capital : $capital")
    }
    fun printlanguage(){
        println("Language : $language")
    }

    open fun singNationalAnthem(){
        println("Start singing")
    }
}



// 상속
class Korea(fullName : String, capital: String,language : String) : Contry(fullName,capital,language)
{
    override fun singNationalAnthem(){
        super.singNationalAnthem()
        println("Sing Korea national anthem")
    }
}

class Usa(fullName: String, capital: String, language: String) : Contry(fullName, capital, language)
{
    override fun singNationalAnthem() {
        super.singNationalAnthem()
        println("Sing Usa national anthem")
    }
}
