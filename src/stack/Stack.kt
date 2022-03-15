package stack

class StackWithList{
    val elements: MutableList<Any> = mutableListOf()

    fun isEmpty() = elements.isEmpty()

    fun size() = elements.size

    fun push(item: Any) = elements.add(item)

    fun pop() : Any? {
        val item = elements.lastOrNull()
        if (!isEmpty()){
            elements.removeAt(elements.size -1)
        }
        return item
    }
    fun peek() : Any? = elements.lastOrNull()

    override fun toString(): String = elements.toString()
}

fun main(args: Array<String>) {
    var stacklist  = StackWithList()
    println("is Stack empty : "+stacklist.isEmpty())
    stacklist.push("karthiq")
    println("peek is : " +stacklist.peek())
    stacklist.push(false)
    stacklist.push(5)
    stacklist.push(12.22)
    println("the pop elements is : " +stacklist.pop())
    println("the size is : " +stacklist.size())
    println("is Stack empty : " +stacklist.isEmpty())
}