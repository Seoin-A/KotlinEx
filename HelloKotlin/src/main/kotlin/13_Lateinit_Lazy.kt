// lateinit -> var
// lazy -> val
// => 나중에 초기화 하기 위해서 사용
// 변수만 사용가능하며 nullable과 같이 사용 불가
// 원시 자료형 사용 불가
fun Lateinit(){
    lateinit var lunch : String
    lunch = "waffle"
    println(lunch)
}

fun Laze(){
    val lazeBear : String by lazy {
        println("Bear is comming!") // 처음 호출될 떄 한번만 실행
        "bear"
    }

    println("First try :: $lazeBear")
    println("Seccond try :: $lazeBear")

    /* 결과 화면
    * Bear is comming!
      First try :: bear
      Seccond try :: bear
  
    * */
}