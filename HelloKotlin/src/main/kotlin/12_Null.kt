// null : 값이 아직 할당되지 않은 상태

// Nullable vs Non-Nullable(default)

fun NullCheck(){
    // Non-Nullable
    var myName : String ="Joyce"
    //println(myName.reversed())


    // Nullable ?
    var nullableMyName : String? = null
    // println(nullableMyName.reversed()) (x) : null 일 수도 있고 String 일 수 있기 떄문에 fun 사용 불가

    // SafeCall
    println(nullableMyName?.reversed())

    // ?: => null 일 경우 default 지정 (엘비스 연산자)

    val joyce = nullableMyName?.reversed() ?: "Annoymous"
    println("Joyce : $joyce")


    // 확정 연산자 (!!) : null 이 아님을 확정할 경우에만 사용
    println(nullableMyName!!.reversed())


}