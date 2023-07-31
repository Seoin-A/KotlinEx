
// if 문
fun isPass(examScope: Int) : Boolean{
    if(examScope >= 60){
        return true
    }else{
        return false
    }

}

fun isContained(intRange: IntRange) : Boolean{
    return if(intRange.contains(3)){
        true
    }else if(intRange.contains(10)){
        false
    }
    else{
        false
    }
}

// when == switch 문과 동일
fun getGrade (score : Int) : Char {
    return when (score){
        in 0..40 -> 'D'
        in 41..70 -> 'C'
        in 71..90 -> 'B'
        in 90..100 -> 'A'
        else -> 'Z'
    }

}