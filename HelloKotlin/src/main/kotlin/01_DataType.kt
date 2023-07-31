fun dataType(){
    // 상수 : val
    val pi : Double = 3.14
    println(pi)

    // 변수 : val
    var age : Int = 39
    println(age)

    age= 45
    println(age)

    // [Data Type]

    // 1. Numbers
    // 1-1 Byte
    var mByte : Byte = 100

    // 1-2 Short
    var mShort : Short = 1000

    // 1-3. Int
    var mInt : Int = 100000

    // 1-4. Long
    var mLong : Long = 100000000L

    // 1-5. Float
    var mFloat : Float = 1.5f

    // 1-6. Double
    var mDouble : Double = 1.488572987

    // 2. Characters
    var mChar : Char = 'b'

    // 3. Strings
    var mString : String = "Hellow world"

    // 4. Booleans
    var mFalse : Boolean = false
    var mTrue : Boolean = true

    // 5. Arrays
    var mArray : Array<String>  = arrayOf("Kotlin", "Is", "Fun")

    println(mArray[0])
    println(mArray.get(1))
    println(mArray.size)


}


fun printStudentInfo(name : String, age : Int) : Unit{
    // void == Unit (생략 가능)

    //println("Student Name : "+name)
    println("Student Name : $name")
    println("age : $age");
}

fun addNum(n1 : Int, n2 : Int) : Int {
    return n1+n2
}