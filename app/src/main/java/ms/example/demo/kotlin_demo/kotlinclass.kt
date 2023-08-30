package ms.example.demo.kotlin_demo

//fun main(){
//    val myList:MutableList<String> = mutableListOf("mo" , "bo" , "no")
//
//    println(myList.get(myList.size - 1) )
//    println(myList[myList.size-1])
//    println(myList[myList.lastIndex])
//    println(myList.last())
//
//    println(findFriendScore(myList))
//}
//
//fun findFriendScore(friends:MutableList<String>): Int {
//
//    var score = 0
//
//    for (friend in friends){
//        score += 1
//
//    }
//    return score
//}


data class ExamResult(val name: String, val score: Int)

fun main() {
    runTests()
}

// Return "A" if the score is b/w 90 and 100
//        "B" if the score is b/w 80 and 89
//        "C" if the score is b/w 70 and 79
//        "F" for anything else
fun getExamGrade(result: ExamResult): String {
    // TODO: fill this in

    if(result.score in 90..100){
        return "A"
    }else if(result.score in 80..89){
        return "B"
    }else if(result.score in 70..79){
        return "C"
    }else if( result.score < 70 ){
        return "F"
    }
    return ""
}

// Return the number of exam results which had a score higher than the threshold parameter
fun countScoresHigherThan(threshold: Int, results: List<ExamResult>): Int {
    // TODO: fill this in
    var counter = 0
    for(result in results){
        if( result.score > threshold){
            counter += 1
        }
    }
    return counter
}

fun runTests() {
    val examResults = listOf(
        ExamResult("Mary", 91),
        ExamResult("John", 85),
        ExamResult("Rahul", 70),
        ExamResult("Noob", 42),
        ExamResult("Nala", 99),
        ExamResult("George", 81)
    )
    check("A" == getExamGrade(examResults[0])) {
        "91 should translate to an A"
    }
    check("B" == getExamGrade(examResults[1])) {
        "85 should translate to a B"
    }
    check("C" == getExamGrade(examResults[2])) {
        "70 should translate to a C"
    }
    check("F" == getExamGrade(examResults[3])) {
        "42 should translate to an F"
    }

    check(2 == countScoresHigherThan(85, examResults)) {
        "Two students scored higher than 85"
    }
}