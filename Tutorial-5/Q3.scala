object question3 extends App {
    
    def add(n:Int):Int={
        if(n==0) 0
        else n+add(n-1)
    }

    println(add(5))
}
