object question5 extends App {

    def sumEven(n:Int):Int={
        if(n%2==0){

        if(n==0) 0
        else n+sumEven(n-1)
        }

        else sumEven(n-1)
    }
        

    println(sumEven(6))
    
}