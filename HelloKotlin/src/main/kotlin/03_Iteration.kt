fun rangeClass(){
    // 특정 범위의 값을 표현할 수 있다.
    // IntRange, LongRange, CharRange

    val numRange : IntRange = 1..5
    println(numRange.contains(3)) // 범위 안에 3이 존재하는가
    println(numRange.contains(10)) // 범위 안에 10이 존재하는가

    val charRange : CharRange = 'a'..'e'
    println(charRange.contains('z')) // 범위 안에 10이 존재하는가
    println(charRange.contains('a')) // 범위 안에 10이 존재하는가


    // 1. For
    for (i in 1..5){
        println(i)
    }

    for ( i in 1 until 10){
        println(i)
    }

    for ( i in 10 downTo 1){
        println(i)
    }

    for ( i in 1..10 step 2){
        println(i)
    }

    
    // 2. while


}