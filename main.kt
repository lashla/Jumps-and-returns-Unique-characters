fun main() {
    var counter = 0
    val input = readLine()!!.toString()
    Loop@for (firstElement in input.indices){
        for (secondElement in input.indices){
            if (input[firstElement] == input[secondElement] && firstElement != secondElement) continue@Loop
        }
        counter++
    }
    print(counter)
}
