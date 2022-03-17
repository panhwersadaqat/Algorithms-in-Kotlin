package queue

import java.util.*

fun main(arg: Array<String>) {
    val numbers: Queue<Int> = LinkedList<Int>()

    //adding elements to the queue
    numbers.add(1)
    numbers.add(2)
    numbers.add(3)

    //printing queue
    println(numbers)

    //removing element
    numbers.remove()

    //finding element
    val item = 2
    if(numbers.contains(item)) {
        println("Item is at index: ${numbers.indexOf(item)}")
    } else {
        println("Queue does not contain $item")
    }

    //getting first element
    var first = numbers.peek()
    println("First item in the Queue: $first")
    
}