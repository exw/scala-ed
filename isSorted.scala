// Exercise 2.1

def isSorted[A](as: Array[A], ordered: (A,A) => Boolean): Boolean = {
    @annotation.tailrec
    def loop(n: Int): Boolean = {
        if (n >= as.length) true
        else if (!ordered(as(n),as(n-1))) false
        else loop(n+1)
    }
    loop(0)
}
