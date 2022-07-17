object question5 extends App{
    def easy(n:Int):Int={
        return n*8
    }

    def tempo(n:Int):Int={
        return n*7
    }

    val total_time=easy(2)+tempo(3)+easy(2)

    println(total_time)
    
}
