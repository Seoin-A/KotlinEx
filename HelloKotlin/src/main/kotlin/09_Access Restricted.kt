// 접근 제한자
// public > internal > protected > private


/*
*  public : 어디서나 접근 가능 ( 기본 접근 제한자)
*  internal : 같은 모듈 내에서 접근 가능
*  protected : 자식 클래스에서는 접근 가능
*  private : 해당 클래스 내부에서만 접근 가능
*/

public class A{
    public val a = 1
    val b = 2 // public 기본
}

class B {
    private val c = 3
    public val d = 4
}

open class  C{
    protected val e = 5
    private val f = 6
    public val g =7
}

class D : C(){
   private fun printCProerties(){
        println("e : $e")
        // println ("f : $f")
        println("g : $g")
    }

    fun callPrintC(){
        printCProerties()
    }

}

