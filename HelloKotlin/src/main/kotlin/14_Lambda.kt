// Lambda Expression : 값처럼 다룰 수 있는 익명 함수

fun LambdaFun(){
    val sayHello = fun(){
        println("Hello!")
    } // 익명 함수

    val squareNum : (Int) -> (Int) = { num -> num*num}

    val squareNum2 = { num : Int -> num*num }

    val squareNum3 : (Int) -> (Int) = { it * it}

    val squareNum4 : (Int) -> (Int) = { it * it}

    println(squareNum(30))
    println(squareNum2(30))
    println(squareNum3(30))


    fun invokeLambda(lambda : (Int) -> Boolean) : Boolean{
        return lambda(5)
    }

    val falseValue = invokeLambda { num -> num == 10 }

    val trueValue = invokeLambda { num -> num < 10 }
    invokeLambda ({ it < 10})
    invokeLambda { it<10 }
    invokeLambda() { it<10 }
}





